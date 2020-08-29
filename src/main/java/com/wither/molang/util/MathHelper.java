package com.wither.molang.util;

public class MathHelper {
    public static float clamp(float value, float min, float max) {
        return (value < min) ? min : (max < value) ? max : value;
    }

    public static float lerp(float a, float b, float t) {
        return (1 - t) * a + t * b;
    }

    public static float hermiteBlend(float value) {
        return (float) (Math.pow(3F * value, 2F) - Math.pow(2F * value, 3F));
    }

    //TODO: Implement die roll
    //TODO: Implement integer die roll
    //TODO: Implement lerprotate
    //TODO: Implement random integer range
    //TODO: Implement random float range
}
