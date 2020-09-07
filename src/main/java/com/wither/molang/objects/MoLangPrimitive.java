package com.wither.molang.objects;

public class MoLangPrimitive extends MoLangElement {

    private float value;

    public MoLangPrimitive(float value) {
        this.value = value;
    }

    public float asFloat() {
        return value;
    }

    public int asInt() {
        return (int) value;
    }

    public boolean asBoolean() {
        return value != 0f;
    }

    public void set(float value) {
        this.value = value;
    }

    @Override
    public String getTypeName() {
        return "number";
    }

}
