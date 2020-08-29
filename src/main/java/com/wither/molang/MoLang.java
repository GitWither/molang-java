package com.wither.molang;

import com.wither.molang.listeners.MoLangBasicListener;
import com.wither.molang.objects.MoLangMath;
import com.wither.molang.objects.MoLangObject;
import com.wither.molang.objects.MoLangPrimitive;
import com.wither.molang.objects.MoLangQuery;
import com.wither.molang.util.VariableType;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;

public class MoLang {

    private final String expression;
    private final MoLangLexer lexer;
    private final CommonTokenStream tokens;
    private final MoLangParser parser;
    private final Stack<Float> stack;
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
        this.stack = new Stack<>();
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
        this.parser.addParseListener(new MoLangBasicListener(this.stack, this.scope));
        this.parser.program();
        return this.stack.peek();
    }
}
