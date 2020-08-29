package com.wither.molang.util;

public class MathHelper {
    public static float Clamp(float value, float min, float max) {
        return (value < min) ? min : (max < value) ? max : value;
    }

    public static float Lerp(float a, float b, float t) {
        return (1 - t) * a + t * b;
    }

    public static float HermiteBlend(float value) {
        return (float) (Math.pow(3F * value, 2F) - Math.pow(2F * value, 3F));
    }
}
