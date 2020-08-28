package com.wither.molang.listeners;

import com.wither.molang.MoLangBaseListener;
import com.wither.molang.MoLangListener;
import com.wither.molang.MoLangParser;

import java.util.Stack;

public class MoLangBasicListener extends com.wither.molang.MoLangBaseListener {
    private Stack<Float> stack;

    public MoLangBasicListener(Stack<Float> stack) {
        this.stack = stack;
    }

    @Override
    public void exitValue(MoLangParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            this.stack.push(Float.parseFloat(ctx.NUMBER().getText()));
        }
    }

    @Override
    public void exitSum(MoLangParser.SumContext ctx) {
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
        }
    }

    public Stack<Float> getStack() {
        return this.stack;
    }
}
