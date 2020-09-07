package com.wither.molang;

public class Main {
    public static void main(String[] args) {
        MoLang moLang = new MoLang("math.pi");
        System.out.println(moLang.evaluate());
    }
}
