package com.wither.molang.objects;

import java.util.HashMap;
import java.util.Map;

public class MoLangObject extends MoLangElement {

    private final Map<String, MoLangElement> properties = new HashMap<>();

    /**
     * @param keyValuePairs Pairs in the form of String key and MoLangElement value
     */
    public MoLangObject(Object... keyValuePairs) {
        if (keyValuePairs.length > 0) {
            if (keyValuePairs.length % 2 != 0) {
                throw new IllegalArgumentException("Incorrect number of arguments! This constructor accepts only pairs of String and MoLangElement.");
            }
            for (int i = 0; i < keyValuePairs.length; i += 2) {
                if (!(keyValuePairs[i] instanceof String)) {
                    throw new IllegalArgumentException("Key value at index " + i + " is not a string!");
                }
                if (!(keyValuePairs[i + 1] instanceof MoLangElement)) {
                    throw new IllegalArgumentException("Key value at index " + (i + 1) + " is not a MoLangElement!");
                }
                set((String) keyValuePairs[i], (MoLangElement) keyValuePairs[i + 1]);
            }
        }
    }

    public MoLangElement get(String name) {
        return properties.get(name.toLowerCase());
    }

    public void set(String name, MoLangElement value) {
        properties.put(name, value);
    }

    @Override
    public String getTypeName() {
        return "object";
    }

}
