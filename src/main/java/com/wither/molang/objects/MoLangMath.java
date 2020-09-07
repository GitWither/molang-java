package com.wither.molang.objects;

import com.wither.molang.util.MathHelper;

public class MoLangMath extends MoLangFunctionObject {

    public MoLangMath() {
        super(
                "abs", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "abs",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            Math.abs(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "acos", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "acos",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.acos(((MoLangPrimitive) moLangElement[0]).asFloat()))
                    );
                }),
                "asin", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "asin",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.asin(((MoLangPrimitive) moLangElement[0]).asFloat()))
                    );
                }),
                "atan", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "atan",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.atan(((MoLangPrimitive) moLangElement[0]).asFloat()))
                    );
                }),
                "atan2", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "atan2",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.atan2(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat()))
                    );
                }),
                "ceil", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "ceil",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.ceil(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "clamp", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 3, 3, "clamp",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.clamp(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat(), ((MoLangPrimitive) moLangElement[2]).asFloat())
                    );
                }),
                "cos", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "cos",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.cos(Math.toRadians(((MoLangPrimitive) moLangElement[0]).asFloat()))
                    );
                }),
                "die_roll", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 3, 3, "die_roll",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.dieRoll(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat(), ((MoLangPrimitive) moLangElement[2]).asFloat())
                    );
                }),
                "die_roll_integer", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 3, 3, "die_roll_integer",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.dieRollInteger(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat(), ((MoLangPrimitive) moLangElement[2]).asFloat())
                    );
                }),
                "exp", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "exp",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.pow(Math.E, ((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "floor", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "floor",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.floor(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "hermite_blend", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "hermite_blend",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.hermiteBlend(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "lerp", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 3, 3, "lerp",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.lerp(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat(), ((MoLangPrimitive) moLangElement[2]).asFloat())
                    );
                }),
                "lerprotate", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 3, 3, "lerprotate",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            //TODO: Implement correct function
                            0
                            //MathHelper.lerp(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get(), ((MoLangPrimitive) moLangElement[2]).get())
                    );
                }),
                "ln", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "ln",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.log(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "max", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "max",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            Math.max(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1]).asFloat()));
                }),
                "min", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "max",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            Math.min(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1]).asFloat()));
                }),
                "mod", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "mod",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            ((MoLangPrimitive) moLangElement[0]).asFloat() % ((MoLangPrimitive) moLangElement[1]).asFloat());
                }),
                "pi", new MoLangFunction(moLangElement -> {
                    return new MoLangPrimitive(
                            (float) Math.PI
                    );
                }),
                "pow", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "pow",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.pow(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat()));
                }),
                "random", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "pow",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.random(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat()));
                }),
                "random_integer", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 2, 2, "pow",
                            MoLangPrimitive.class,
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.randomInteger(((MoLangPrimitive) moLangElement[0]).asFloat(), ((MoLangPrimitive) moLangElement[1])
                                    .asFloat()));
                }),
                "round", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "round",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            Math.round(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "sin", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "sin",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.sin(Math.toRadians(((MoLangPrimitive) moLangElement[0]).asFloat()))
                    );
                }),
                "sqrt", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "sqrt",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            (float) Math.sqrt(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                }),
                "trunc", new MoLangFunction(moLangElement -> {
                    checkArgs(moLangElement, 1, 1, "trunc",
                            MoLangPrimitive.class
                    );
                    return new MoLangPrimitive(
                            MathHelper.truncate(((MoLangPrimitive) moLangElement[0]).asFloat())
                    );
                })
        );
    }

}
