package com.wither.molang.objects;

import java.util.HashMap;
import java.util.Map;

public class MoLangObject {

    private final Map<String, MoLangElement> properties = new HashMap<>();

    public MoLangElement get(String name) {
        return properties.get(name);
    }

    public void set(String name, MoLangElement value) {
        properties.put(name, value);
    }

}
