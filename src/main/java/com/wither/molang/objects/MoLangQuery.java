package com.wither.molang.objects;

public class MoLangQuery extends MoLangFunctionObject {

    public MoLangQuery() {
        super(
                "count", new MoLangFunction(moLangElement -> {
                    return new MoLangPrimitive(
                            moLangElement.length
                    );
                })
        );
    }

}
