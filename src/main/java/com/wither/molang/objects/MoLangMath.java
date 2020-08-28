package com.wither.molang.objects;

public class MoLangMath extends MoLangObject {

    public MoLangMath() {
        super(
                "mod", new MoLangFunction(moLangElement -> {
                    checkArgsCount(moLangElement, 2, 2, "mod");
                    checkArgType(moLangElement, 0, MoLangPrimitive.class);
                    checkArgType(moLangElement, 1, MoLangPrimitive.class);
                    return new MoLangPrimitive(
                            ((MoLangPrimitive) moLangElement[0]).get() % ((MoLangPrimitive) moLangElement[1]).get());
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
