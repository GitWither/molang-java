package com.wither.molang.objects;

public class MoLangQuery extends MoLangObject {

    public MoLangQuery() {
        super(
                "count", new MoLangFunction(moLangElement -> {
                    return new MoLangPrimitive(
                            moLangElement.length
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
