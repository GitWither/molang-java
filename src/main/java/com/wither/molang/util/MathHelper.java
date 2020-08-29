package com.wither.molang.util;

public class MathHelper {
    public static float clamp(float value, float min, float max) {
        return (value < min) ? min : (max < value) ? max : value;
    }

    public static float lerp(float a, float b, float t) {
        return (1 - t) * a + t * b;
    }

    public static float hermiteBlend(float value) {
        return (float) (3 * Math.pow(value, 2) - 2 * Math.pow(value, 3F));
    }

    public static float truncate(float value) {
        return (float)((value < 0) ? Math.ceil(value) : Math.floor(value));
    }

    //TODO: Implement die roll
    //TODO: Implement integer die roll
    //TODO: Implement lerprotate
    //TODO: Implement random integer range
    //TODO: Implement random float range
}
