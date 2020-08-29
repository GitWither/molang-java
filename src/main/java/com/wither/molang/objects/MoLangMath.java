package com.wither.molang.objects;

import com.wither.molang.util.MathHelper;

public class MoLangMath extends MoLangObject {

    public MoLangMath() {
        super(
                "abs", new MoLangFunction(moLangElement -> {
                   checkArgsCount(moLangElement, 1, 1, "abs");
                   checkArgType(moLangElement, 0, MoLangPrimitive.class);
                   return new MoLangPrimitive(
                     Math.abs(((MoLangPrimitive) moLangElement[0]).get())
                   );
                }),
                "acos", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "acos");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.acos(((MoLangPrimitive) moLangElement[0]).get()))
                    );
                }),
                "asin", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "asin");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.asin(((MoLangPrimitive) moLangElement[0]).get()))
                    );
                }),
                "atan", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "atan");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.atan(((MoLangPrimitive) moLangElement[0]).get()))
                    );
                }),
                "atan2", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "atan2");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.toDegrees(Math.atan2(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get()))
                    );
                }),
                "ceil", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "ceil");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.ceil(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "clamp", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 3, 3, "clamp");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    checkArgType(moLangElement, 2, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            MathHelper.clamp(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get(), ((MoLangPrimitive) moLangElement[2]).get())
                    );
                }),
                "cos", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "cos");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.cos(Math.toRadians(((MoLangPrimitive) moLangElement[0]).get()))
                    );
                }),
                "exp", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "exp");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.pow(Math.E, ((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "floor", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "floor");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.floor(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "hermite_blend", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "hermite_blend");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            MathHelper.hermiteBlend(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "lerp", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 3, 3, "lerp");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    checkArgType(moLangElement, 2, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            MathHelper.lerp(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get(), ((MoLangPrimitive) moLangElement[2]).get())
                    );
                }),
                "lerprotate", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 3, 3, "lerprotate");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    checkArgType(moLangElement, 2, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            //TODO: Implement correct function
                            0
                            //MathHelper.lerp(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get(), ((MoLangPrimitive) moLangElement[2]).get())
                    );
                }),
                "ln", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "ln");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.log(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "max", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "max");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            Math.max(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get()));
                }),
                "min", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "max");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            Math.min(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get()));
                }),
                "mod", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "mod");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            ((MoLangPrimitive) moLangElement[0]).get() % ((MoLangPrimitive) moLangElement[1]).get());
                }),
                "pi", new MoLangFunction(moLangElement -> {
                    //FIXME: Molang has a constant called Math.pi however this fails unit tests
                    return new MoLangPrimitive(
                            (float) Math.PI
                    );
                }),
                "pow", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "pow");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.pow(((MoLangPrimitive) moLangElement[0]).get(), ((MoLangPrimitive) moLangElement[1]).get()));
                }),
                "round", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "round");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            Math.round(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "sin", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "sin");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.sin(Math.toRadians(((MoLangPrimitive) moLangElement[0]).get()))
                    );
                }),
                "sqrt", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "sqrt");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            (float) Math.sqrt(((MoLangPrimitive) moLangElement[0]).get())
                    );
                }),
                "trunc", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 1, 1, "trunc");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            MathHelper.truncate(((MoLangPrimitive) moLangElement[0]).get())
                    );
                })
        );
    }

    private static void checkArgsCount(MoLangElement[] args, int min, int max, String funcName) {
        if (args.length < min) {
            throw new RuntimeException(
                    "Incorrect number of arguments for function " + funcName + "! Expected at least " + min +
                            ", but got " + args.length);
        }
        if (args.length > max) {
            throw new RuntimeException(
                    "Incorrect number of arguments for function " + funcName + "! Expected at most " + max +
                            ", but got " + args.length);
        }
    }

    private static void checkArgType(MoLangElement[] args, int index, Class<? extends MoLangElement> clz) {
        if (!clz.isInstance(args[index])) {
            //TODO: Exceptions should have their own types and be a bit more descriptive
            throw new RuntimeException("Unexpected type");
        }
    }

}
