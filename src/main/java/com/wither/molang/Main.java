package com.wither.molang;

import com.wither.molang.listeners.MoLangBasicListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "2 + (3 * 4)";
        MoLangLexer moLangLexer = new MoLangLexer(CharStreams.fromString(string));
        CommonTokenStream tokens = new CommonTokenStream(moLangLexer);
        MoLangParser parser = new MoLangParser(tokens);
        Stack<Float> stack = new Stack<>();
        parser.addParseListener(new MoLangBasicListener(stack));
        parser.program();
        System.out.println(stack);
    }
}
