package com.wither.molang.exceptions;

public class MoLangUndefinedFieldException extends MoLangException {

    public MoLangUndefinedFieldException(String fieldName) {
        super("Undefined field " + fieldName);
    }
}
