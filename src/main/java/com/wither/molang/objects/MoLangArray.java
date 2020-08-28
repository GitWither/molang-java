package com.wither.molang.objects;

import java.util.ArrayList;
import java.util.List;

public class MoLangArray extends MoLangElement {

    private final List<MoLangElement> items = new ArrayList<>();

    public MoLangElement get(int index) {
        return items.get(index);
    }

    public void set(int index, MoLangElement value) {
        items.set(index, value);
    }

    @Override
    public String getTypeName() {
        return "array";
    }
}
