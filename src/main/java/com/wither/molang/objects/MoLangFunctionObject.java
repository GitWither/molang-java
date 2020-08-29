package com.wither.molang.objects;

public class MoLangFunctionObject extends MoLangObject {

    public MoLangFunctionObject(Object... keyValuePairs) {
        super(keyValuePairs);
    }

    @SafeVarargs
    protected static void checkArgs(MoLangElement[] args, int min, int max, String funcName, Class<? extends MoLangElement>... types) {
        checkArgsCount(args, min, max, funcName);
        for (int i = 0; i < types.length; i++) {
            if (types[i] == null) {
                continue;
            }
            checkArgType(args, i, types[i], funcName);
        }
    }

    protected static void checkArgsCount(MoLangElement[] args, int min, int max, String funcName) {
        if (min == max && args.length != min) {
            throw new RuntimeException(
                    "Incorrect number of arguments for function " + funcName + "! Expected exactly " + min +
                            ", but got " + args.length);
        }
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

    protected static void checkArgType(MoLangElement[] args, int index, Class<? extends MoLangElement> clz, String funcName) {
        if (!clz.isInstance(args[index])) {
            throw new RuntimeException(
                    "Unexpected argument type for function " + funcName + "! Expected " + clz.getSimpleName() +
                            ", but got " + args[index].getClass().getSimpleName());
        }
    }
}
