package com.wither.molang.objects;

public abstract class MoLangElement {

    public static final MoLangElement VOID = new MoLangElement() {
        @Override
        public String getTypeName() {
            return "void";
        }
    };

    public abstract String getTypeName();
}
