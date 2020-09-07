package com.wither.molang.visitors;

import com.wither.molang.MoLangBaseVisitor;
import com.wither.molang.MoLangParser;
import com.wither.molang.exceptions.MoLangException;
import com.wither.molang.exceptions.MoLangUndefinedFieldException;
import com.wither.molang.exceptions.MoLangUnexpectedTypeException;
import com.wither.molang.objects.*;

public class MoLangEvalVisitor extends MoLangBaseVisitor<MoLangElement> {
    private final MoLangObject scope;

    public MoLangEvalVisitor(MoLangObject scope) {
        this.scope = scope;
    }

    /**
     * Utility function, which returns MoLangElement object casted to chosen type
     * or throws an exception, if the types don't match
     *
     * @param type    type to cast to
     * @param element MoLangElement to cast
     * @return casted MoLangElement
     */
    private <T extends MoLangElement> T as(Class<T> type, MoLangElement element) {
        if (!type.isInstance(element)) {
            throw new MoLangUnexpectedTypeException(type, element);
        }
        //noinspection unchecked
        return (T) element;
    }

    /**
     * Utility function, which returns MoLangElement or throws an exception, if the element is null
     *
     * @param fieldName field name
     * @param element   MoLangElement to check
     * @return MoLangElement
     */
    private MoLangElement defined(String fieldName, MoLangElement element) {
        if (element == null) {
            throw new MoLangUndefinedFieldException(fieldName);
        }
        return element;
    }

    @Override
    public MoLangElement visitProgram(MoLangParser.ProgramContext ctx) {
        if (ctx.expression().size() == 1) {
            return visit(ctx.expression(0));
        }
        else {
            return super.visitProgram(ctx);
        }
    }

    @Override
    public MoLangElement visitValue(MoLangParser.ValueContext ctx) {
        return resolveValue(ctx);
    }

    @Override
    public MoLangElement visitSum(MoLangParser.SumContext ctx) {
        if (ctx.sum().size() == 2) {
            MoLangPrimitive a = as(MoLangPrimitive.class, visit(ctx.sum(0)));
            MoLangPrimitive b = as(MoLangPrimitive.class, visit(ctx.sum(1)));

            if (ctx.Add() != null) {
                return new MoLangPrimitive(a.asFloat() + b.asFloat());
            }
            else if (ctx.Subtract() != null) {
                return new MoLangPrimitive(a.asFloat() - b.asFloat());
            }
            else if (ctx.Multiply() != null) {
                return new MoLangPrimitive(a.asFloat() * b.asFloat());
            }
            else if (ctx.Divide() != null) {
                return new MoLangPrimitive(a.asFloat() / b.asFloat());
            }
            else if (ctx.Equal() != null) {
                return new MoLangPrimitive(a.asFloat() == b.asFloat() ? 1f : 0f);
            }
            else if (ctx.NotEqual() != null) {
                return new MoLangPrimitive(a.asFloat() != b.asFloat() ? 1f : 0f);
            }
            else if (ctx.Greater() != null) {
                return new MoLangPrimitive(a.asFloat() > b.asFloat() ? 1f : 0f);
            }
            else if (ctx.Less() != null) {
                return new MoLangPrimitive(a.asFloat() < b.asFloat() ? 1f : 0f);
            }
            else if (ctx.GreaterOrEqual() != null) {
                return new MoLangPrimitive(a.asFloat() >= b.asFloat() ? 1f : 0f);
            }
            else if (ctx.LessOrEqual() != null) {
                return new MoLangPrimitive(a.asFloat() <= b.asFloat() ? 1f : 0f);
            }
            else {
                throw new MoLangException("Unexpected behavior");
            }
        }
        else if (ctx.sum().size() == 1) {
            return visit(ctx.sum(0));
        }
        else {
            return visit(ctx.value());
        }
    }

    @Override
    public MoLangElement visitConditional_operator(MoLangParser.Conditional_operatorContext ctx) {
        MoLangElement condition = visit(ctx.sum());
        if (as(MoLangPrimitive.class, condition).asBoolean()) {
            return visit(ctx.block(0));
        } else {
            return visit(ctx.block(1));
        }
    }

    /**
     * Resolves value rule into a float value
     *
     * @param ctx Rule context
     * @return float value
     */
    private MoLangElement resolveValue(MoLangParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            return new MoLangPrimitive(Float.parseFloat(ctx.NUMBER().getText()));
        }
        else if (ctx.field() != null) {
            MoLangElement resolve = resolveField(ctx.field());
            if (resolve instanceof MoLangFunction) {
                resolve = ((MoLangFunction) resolve).get(new MoLangElement[0]);
            }
            return defined(ctx.field().getText(), resolve);
        }
        throw new MoLangException("Unexpected behavior!");
    }

    /**
     * Resolves field rule into MoLangElement
     *
     * @param ctx Rule context
     * @return MoLangElement or null, if the value was not found
     */
    private MoLangElement resolveField(MoLangParser.FieldContext ctx) {
        if (ctx.field() != null) {
            MoLangElement element = defined(ctx.field().getText(), resolveField(ctx.field()));
            if (ctx.value() != null) {
                MoLangElement index = resolveValue(ctx.value());
                return as(MoLangArray.class, element).get(as(MoLangPrimitive.class, index).asInt());
            }
            if (ctx.LeftParen() != null) {
                MoLangElement[] args = new MoLangElement[ctx.argument().size()];
                for (int i = 0; i < ctx.argument().size(); i++) {
                    MoLangParser.ArgumentContext value = ctx.argument(i);
                    if (value.NUMBER() != null) {
                        args[i] = new MoLangPrimitive(Float.parseFloat(value.NUMBER().getText()));
                    }
                    else if (value.field() != null) {
                        args[i] = resolveField(value.field());
                    }
                }
                return as(MoLangFunction.class, element).get(args);
            }
            else if (ctx.name() != null) {
                return as(MoLangObject.class, element).get(ctx.name().getText());
            }
        }
        if (ctx.name() != null) {
            return scope.get(ctx.name().getText());
        }
        throw new MoLangException("Unexpected behavior!");
    }

}
