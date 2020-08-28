package com.wither.molang;

import com.wither.molang.listeners.MoLangBasicListener;
import com.wither.molang.objects.MoLangMath;
import com.wither.molang.objects.MoLangObject;
import com.wither.molang.objects.MoLangPrimitive;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        String string = "2 + (variable.test.a * 4)";
        String string = "math.mod(8, 3)";
        MoLangLexer moLangLexer = new MoLangLexer(CharStreams.fromString(string));
        CommonTokenStream tokens = new CommonTokenStream(moLangLexer);
        MoLangParser parser = new MoLangParser(tokens);
        Stack<Float> stack = new Stack<>();
        MoLangObject scope = new MoLangObject(
                "query", new MoLangObject(),
                "context", new MoLangObject(),
                "temp", new MoLangObject(),
                "math", new MoLangMath(),
                "variable", new MoLangObject(
                        "test", new MoLangObject(
                                "a", new MoLangPrimitive(3f)
                        )
                )
        );
        parser.addParseListener(new MoLangBasicListener(stack, scope));
        parser.program();
        System.out.println(stack);
    }
}
