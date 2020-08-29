package com.wither.molang;

import com.wither.molang.objects.MoLangObject;
import com.wither.molang.objects.MoLangPrimitive;

public class Main {
    public static void main(String[] args) {
//        String string = "2 + (variable.test.a * 4)";
        /*
        String string = "math.acos(0.5)";
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
         */
        MoLang moLang = new MoLang("math.cos(variable.x) + math.sin(variable.a);", new MoLangObject(
                "x", new MoLangPrimitive(60f),
                "a", new MoLangPrimitive(30f)
        ));
        System.out.println(moLang.evaluate());
    }
}
