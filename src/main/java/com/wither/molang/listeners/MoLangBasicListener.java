package com.wither.molang.listeners;

import com.wither.molang.MoLangParser;
import com.wither.molang.objects.*;

import java.util.Stack;

public class MoLangBasicListener extends com.wither.molang.MoLangBaseListener {
    private final Stack<Float> stack;
    private final MoLangObject scope;
    private boolean ignoreExecution = false;

    public MoLangBasicListener(Stack<Float> stack, MoLangObject scope) {
        this.stack = stack;
        this.scope = scope;
    }

    @Override
    public void exitValue(MoLangParser.ValueContext ctx) {
        if (ignoreExecution) {
            return;
        }
        this.stack.push(resolveValue(ctx));
    }

    @Override
    public void exitSum(MoLangParser.SumContext ctx) {
        if (ignoreExecution) {
            return;
        }
        if (ctx.sum().size() == 2) {
            float b = this.stack.pop();
            float a = this.stack.pop();

            if (ctx.Add() != null) {
                this.stack.push(a + b);
            }
            else if (ctx.Subtract() != null) {
                this.stack.push(a - b);
            }
            else if (ctx.Multiply() != null) {
                this.stack.push(a * b);
            }
            else if (ctx.Divide() != null) {
                this.stack.push(a / b);
            }
            else if (ctx.Equal() != null) {
                this.stack.push(a == b ? 1f : 0f);
            }
            else if (ctx.NotEqual() != null) {
                this.stack.push(a != b ? 1f : 0f);
            }
            else if (ctx.Greater() != null) {
                this.stack.push(a > b ? 1f : 0f);
            }
            else if (ctx.Less() != null) {
                this.stack.push(a < b ? 1f : 0f);
            }
            else if (ctx.GreaterOrEqual() != null) {
                this.stack.push(a >= b ? 1f : 0f);
            }
            else if (ctx.LessOrEqual() != null) {
                this.stack.push(a <= b ? 1f : 0f);
            }
        }
    }

    @Override
    public void enterBlock(MoLangParser.BlockContext ctx) {
        if (ignoreExecution) {
            return;
        }
        if (ctx.getParent() instanceof MoLangParser.Conditional_operatorContext) {
            int index = ((MoLangParser.Conditional_operatorContext) ctx.getParent()).block().indexOf(ctx);
            if ((stack.peek() == 0 && index == 0) || (stack.peek() != 0 && index == 1)) {
                ignoreExecution = true;
            }
        }
    }

    @Override
    public void exitBlock(MoLangParser.BlockContext ctx) {
        if (ignoreExecution) {
            if (ctx.getParent() instanceof MoLangParser.Conditional_operatorContext) {
                int index = ((MoLangParser.Conditional_operatorContext) ctx.getParent()).block().indexOf(ctx);
                if ((stack.peek() == 0 && index == 0) || (stack.peek() != 0 && index == 1)) {
                    ignoreExecution = false;
                }
            }
        }
    }

    @Override
    public void exitConditional_operator(MoLangParser.Conditional_operatorContext ctx) {

    }

    /**
     * Resolves value rule into a float value
     *
     * @param ctx Rule context
     * @return float value
     */
    private float resolveValue(MoLangParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            return Float.parseFloat(ctx.NUMBER().getText());
        }
        else if (ctx.field() != null) {
            MoLangElement resolve = resolveField(ctx.field());
            if (resolve == null) {
                //TODO: No idea how MoLang handles undefined values
                throw new RuntimeException("Undefined field '" + ctx.field().getText() + "'");
            }
            if (!(resolve instanceof MoLangPrimitive)) {
                //TODO: No idea how MoLang handles unexpected types
                throw new RuntimeException(
                        "Expected number from '" + ctx.field().getText() + "', but got " + resolve.getTypeName());
            }
            return ((MoLangPrimitive) resolve).get();
        }
        // If the code reaches this point, something is seriously broken, because either NUMBER or field should be non-null
        throw new RuntimeException("Unexpected behavior!");
    }

    /**
     * Resolves field rule into MoLangElement
     *
     * @param ctx Rule context
     * @return MoLangElement or null, if the value was not found
     */
    private MoLangElement resolveField(MoLangParser.FieldContext ctx) {
        if (ctx.field() != null) {
            MoLangElement element = resolveField(ctx.field());
            if (element == null) {
                //TODO: No idea how MoLang handles undefined values
                throw new RuntimeException("Undefined field '" + ctx.field().getText() + "'");
            }
            if (ctx.value() != null) {
                if (!(element instanceof MoLangArray)) {
                    //TODO: No idea how MoLang handles unexpected types
                    throw new RuntimeException(
                            "Expected array from '" + ctx.field().getText() + "', but got " + element.getTypeName());
                }
                float index = resolveValue(ctx.value());
                //TODO: What if we won't get integer? Do we throw exception or remove the decimal part like now?
                return ((MoLangArray) element).get((int) index);
            }
            if (ctx.LeftParen() != null) {
                if (!(element instanceof MoLangFunction)) {
                    //TODO: No idea how MoLang handles unexpected types
                    throw new RuntimeException(
                            "Expected function from '" + ctx.field().getText() + "', but got " + element.getTypeName());
                }
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
                return ((MoLangFunction) element).get(args);
            }
            else if (ctx.name() != null) {
                if (!(element instanceof MoLangObject)) {
                    //TODO: No idea how MoLang handles unexpected types
                    throw new RuntimeException(
                            "Expected object from '" + ctx.field().getText() + "', but got " + element.getTypeName());
                }
                return ((MoLangObject) element).get(ctx.name().getText());
            }
        }
        if (ctx.name() != null) {
            return scope.get(ctx.name().getText());
        }
        // If the code reaches this point, something is seriously broken
        throw new RuntimeException("Unexpected behavior!");
    }

    public Stack<Float> getStack() {
        return this.stack;
    }
}
