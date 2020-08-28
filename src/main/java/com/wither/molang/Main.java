package com.wither.molang;

import gen.com.wither.molang.MoLangBaseListener;
import gen.com.wither.molang.MoLangLexer;
import gen.com.wither.molang.MoLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "5 + 5";
        MoLangLexer moLangLexer = new MoLangLexer(CharStreams.fromString(string));
        CommonTokenStream tokens = new CommonTokenStream(moLangLexer);
        MoLangParser parser = new MoLangParser(tokens);
        Stack<Float> stack = new Stack<>();
        parser.addParseListener(new MoLangBaseListener() {
            @Override
            public void exitField(MoLangParser.FieldContext ctx) {
                if (ctx.NUMBER() != null) {
                    stack.push(Float.parseFloat(ctx.NUMBER().getText()));
                }
            }

            @Override
            public void exitSum(MoLangParser.SumContext ctx) {
                if (ctx.sum().size() == 2) {
                    float b = stack.pop();
                    float a = stack.pop();

                    if (ctx.Add() != null) {
                       stack.push(a + b);
                    }
                    else if (ctx.Subtract() != null) {
                        stack.push(a - b);
                    }
                    else if (ctx.Multiply() != null) {
                        stack.push(a * b);
                    }
                    else if (ctx.Divide() != null) {
                        stack.push(a / b);
                    }
                    else if (ctx.Equal() != null) {
                        stack.push(a == b ? 1f : 0f);
                    }
                    else if (ctx.NotEqual() != null) {
                        stack.push(a != b ? 1f : 0f);
                    }
                }
            }
        });
        parser.program();
        System.out.println(stack);
    }
}
