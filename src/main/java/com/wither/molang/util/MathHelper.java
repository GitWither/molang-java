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

    public static float random(float min, float max) {
        return (float) (min + Math.random() * (max - min));
    }

    public static float randomInteger(float min, float max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static float dieRoll(float number, float min, float max) {
        float result = 0;
        for (int i = 0; i < number; i++) {
            result += random(min, max);
        }
        return result;
    }

    public static float dieRollInteger(float number, float min, float max) {
        float result = 0;
        for (int i = 0; i < number; i++) {
            result += randomInteger(min, max);
        }
        return (int) result;
    }
    //TODO: Implement lerprotate
}
