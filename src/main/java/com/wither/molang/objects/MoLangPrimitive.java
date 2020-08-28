package com.wither.molang.objects;

public class MoLangPrimitive extends MoLangElement {

    private float value;

    public MoLangPrimitive(float value) {
        this.value = value;
    }

    public float get() {
        return value;
    }

    public void set(float value) {
        this.value = value;
    }

}
