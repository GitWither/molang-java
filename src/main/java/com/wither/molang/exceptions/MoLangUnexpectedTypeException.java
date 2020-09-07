package com.wither.molang.exceptions;

import com.wither.molang.objects.*;

import java.util.HashMap;
import java.util.Map;

public class MoLangUnexpectedTypeException extends MoLangException {

    private static final Map<Class<? extends MoLangElement>, String> typeNameMap = new HashMap<>();

    static {
        typeNameMap.put(MoLangPrimitive.class, "primitive");
        typeNameMap.put(MoLangObject.class, "object");
        typeNameMap.put(MoLangFunction.class, "function");
        typeNameMap.put(MoLangArray.class, "array");
    }

    public MoLangUnexpectedTypeException(Class<? extends MoLangElement> expected, MoLangElement actual) {
        super("Expected type " + typeNameMap.get(expected) + ", but got " + typeNameMap.get(actual.getClass()));
    }
}
