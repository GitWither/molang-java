package com.wither.molang;

import com.wither.molang.visitors.MoLangEvalVisitor;
import com.wither.molang.objects.*;
import com.wither.molang.util.VariableType;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;

public class MoLang {

    private final String expression;
    private final MoLangLexer lexer;
    private final CommonTokenStream tokens;
    private final MoLangParser parser;
    private final MoLangObject scope;

    public MoLang(VariableType variableType, String expression, MoLangObject variables) {
        this(expression);
        this.scope.set(variableType.getId(), variables);
    }

    public MoLang(String expression, MoLangObject variables) {
        this(expression);
        this.scope.set("variable", variables);
    }

    public MoLang(String expression) {
        this.expression = expression;
        this.lexer = new MoLangLexer(CharStreams.fromString(this.expression));
        this.tokens = new CommonTokenStream(lexer);
        this.parser = new MoLangParser(tokens);
        this.scope = new MoLangObject(
                "query", new MoLangQuery(),
                "math", new MoLangMath()
        );
    }

    public void setVariable(String variable, float value) {
        //TODO: Implement runtime variable setting
    }

    public String getExpression() {
        return this.expression;
    }

    public float evaluate() {
        MoLangParser.ProgramContext program = this.parser.program();
        MoLangElement result = new MoLangEvalVisitor(this.scope).visit(program);
        return result instanceof MoLangPrimitive ? ((MoLangPrimitive) result).asFloat() : 0.0f;
    }
}
