package com.wither.molang.util;

public enum VariableType {
    VARIABLE("variable"),
    TEMP("temp"),
    CONTEXT("context");

    private String id;

    VariableType(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
