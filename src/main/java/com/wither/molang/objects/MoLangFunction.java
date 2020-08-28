package com.wither.molang.objects;

import java.util.function.Function;

public class MoLangFunction extends MoLangElement {

    private final Function<MoLangElement[], MoLangElement> func;

    public MoLangFunction(Function<MoLangElement[], MoLangElement> func) {
        this.func = func;
    }

    public MoLangElement get(MoLangElement[] arguments) {
        return func.apply(arguments);
    }

    @Override
    public String getTypeName() {
        return "function";
    }

}
