package com.wither.molang;

import com.wither.molang.listeners.MoLangBasicListener;
import com.wither.molang.objects.MoLangMath;
import com.wither.molang.objects.MoLangObject;
import com.wither.molang.objects.MoLangPrimitive;
import com.wither.molang.objects.MoLangQuery;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;

public class MoLang {

    final String expression;
    private final MoLangLexer lexer;
    private final CommonTokenStream tokens;
    private final MoLangParser parser;
    private final Stack<Float> stack;
    private final MoLangObject scope;



    public MoLang(String expression) {
        this.expression = expression;
        this.lexer = new MoLangLexer(CharStreams.fromString(this.expression));
        this.tokens = new CommonTokenStream(lexer);
        this.parser = new MoLangParser(tokens);
        this.stack = new Stack<>();
        this.scope = new MoLangObject(
                "query", new MoLangQuery(),
                "context", new MoLangObject(),
                "temp", new MoLangObject(),
                "math", new MoLangMath(),
                "variable", new MoLangObject(
                "test", new MoLangObject(
                "a", new MoLangPrimitive(3f)
                )
            )
        );
    }

    public float evaluate() {
        this.parser.addParseListener(new MoLangBasicListener(this.stack, this.scope));
        this.parser.program();
        return this.stack.peek();
    }
}
