package com.wither.molang.tests;

import com.wither.molang.MoLang;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTests {

    @Test
    public void addition() {
        MoLang molang = new MoLang("5 + 2");

        assertEquals(7, molang.evaluate(), 0);
    }

    @Test
    public void subtraction() {
        MoLang molang = new MoLang("5 - 2");

        assertEquals(3, molang.evaluate(), 0);
    }

    @Test
    public void multiply() {
        MoLang molang = new MoLang("5 * 2");

        assertEquals(10, molang.evaluate(), 0);
    }

    @Test
    public void divide() {
        MoLang molang = new MoLang("10 / 2");

        assertEquals(5, molang.evaluate(), 0);
    }

    @Test
    public void simpleExpression() {
        MoLang molang = new MoLang("5 + 2 - 3 + 8 * 4 / 5 * 3");

        assertEquals(23.2, molang.evaluate(), 0);
    }

    @Test
    public void complexExpression() {
        MoLang molang = new MoLang("math.pow(math.clamp(234251345, 0, 3), 3)");

        assertEquals(27, molang.evaluate(), 0);
    }

    @Test
    public void mathAbs() {
        MoLang molang = new MoLang("math.abs(-5)");

        assertEquals(5, molang.evaluate(), 0);
    }

    @Test
    public void mathAcos() {
        MoLang molang = new MoLang("math.acos(0.5)");

        assertEquals(60, molang.evaluate(), 0);
    }

    @Test
    public void mathAsin() {
        MoLang molang = new MoLang("math.asin(0.5)");

        assertEquals(30, molang.evaluate(), 0);
    }

    @Test
    public void mathAtan() {
        MoLang molang = new MoLang("math.atan(1)");

        assertEquals(45, molang.evaluate(), 0);
    }

    @Test
    public void mathAtan2() {
        MoLang molang = new MoLang("math.atan2(5, 5)");

        assertEquals(45, molang.evaluate(), 0);
    }

    @Test
    public void mathCeil() {
        MoLang molang = new MoLang("math.ceil(5.5)");

        assertEquals(6, molang.evaluate(), 0);
    }

    @Test
    public void mathClamp() {
        MoLang molang1 = new MoLang("math.clamp(55, 0, 5)");
        MoLang molang2 = new MoLang("math.clamp(-55, 0, 5)");

        assertEquals(5, molang1.evaluate(), 0);
        assertEquals(0, molang2.evaluate(), 0);
    }

    @Test
    public void mathCos() {
        MoLang molang = new MoLang("math.cos(60)");

        assertEquals(0.5, molang.evaluate(), 0);
    }

    @Test
    public void mathDieRoll() {
        //Can't really test random huh
        MoLang molang1 = new MoLang("math.die_roll(5, 0, 5)");
        MoLang molang2 = new MoLang("math.die_roll(5, 0, 5)");
        MoLang molang3 = new MoLang("math.die_roll(5, 0, 5)");
        MoLang molang4 = new MoLang("math.die_roll(5, 0, 5)");
        MoLang molang5 = new MoLang("math.die_roll(5, 0, 5)");

        float result1 = molang1.evaluate();
        float result2 = molang2.evaluate();
        float result3 = molang3.evaluate();
        float result4 = molang4.evaluate();
        float result5 = molang5.evaluate();

        assertEquals(true, (result1 >= 0 && result1 <= 25));
        assertEquals(true, (result2 >= 0 && result2 <= 25));
        assertEquals(true, (result3 >= 0 && result3 <= 25));
        assertEquals(true, (result4 >= 0 && result4 <= 25));
        assertEquals(true, (result5 >= 0 && result5 <= 25));
    }

    @Test
    public void mathDieRollInteger() {
        //Can't really test random huh

        MoLang molang1 = new MoLang("math.die_roll_integer(5, 0, 5)");
        MoLang molang2 = new MoLang("math.die_roll_integer(5, 0, 5)");
        MoLang molang3 = new MoLang("math.die_roll_integer(5, 0, 5)");
        MoLang molang4 = new MoLang("math.die_roll_integer(5, 0, 5)");
        MoLang molang5 = new MoLang("math.die_roll_integer(5, 0, 5)");

        float result1 = molang1.evaluate();
        float result2 = molang2.evaluate();
        float result3 = molang3.evaluate();
        float result4 = molang4.evaluate();
        float result5 = molang5.evaluate();

        assertEquals(true, (result1 >= 0 && result1 <= 25 && (result1 - (int)result1 == 0)));
        assertEquals(true, (result2 >= 0 && result2 <= 25 && (result2 - (int)result2 == 0)));
        assertEquals(true, (result3 >= 0 && result3 <= 25 && (result3 - (int)result3 == 0)));
        assertEquals(true, (result4 >= 0 && result4 <= 25 && (result4 - (int)result4 == 0)));
        assertEquals(true, (result5 >= 0 && result5 <= 25 && (result5 - (int)result5 == 0)));
    }

    @Test
    public void mathExp() {
        MoLang molang = new MoLang("math.exp(5)");

        assertEquals((float)Math.pow(Math.E, 5), molang.evaluate(), 0);
    }

    @Test
    public void mathFloor() {
        MoLang molang = new MoLang("math.floor(5.5)");

        assertEquals(5, molang.evaluate(), 0);
    }

    @Test
    public void mathHermiteBlend() {
        MoLang molang = new MoLang("math.hermite_blend(5)");

        assertEquals(-175, molang.evaluate(), 0);
    }

    @Test
    public void mathLerp() {
        MoLang molang1 = new MoLang("math.lerp(0, 1, 1)");
        MoLang molang2 = new MoLang("math.lerp(0, 1, 0)");
        MoLang molang3 = new MoLang("math.lerp(0, 50, 0.5)");

        assertEquals(1, molang1.evaluate(), 0);
        assertEquals(0, molang2.evaluate(), 0);
        assertEquals(25, molang3.evaluate(), 0);
    }

    @Test
    public void mathLn() {
        MoLang molang1 = new MoLang("math.ln(5)");
        assertEquals((float) Math.log(5), molang1.evaluate(), 0);
    }

    @Test
    public void mathMax() {
        MoLang molang = new MoLang("math.max(1, 5)");
        assertEquals(5, molang.evaluate(), 0);
    }

    @Test
    public void mathMin() {
        MoLang molang = new MoLang("math.min(1, 5)");
        assertEquals(1, molang.evaluate(), 0);
    }

    @Test
    public void mathMod() {
        MoLang molang1 = new MoLang("math.mod(8, 5)");
        MoLang molang2 = new MoLang("math.mod(8, 4)");

        assertEquals(3, molang1.evaluate(), 0);
        assertEquals(0, molang2.evaluate(), 0);
    }

    @Test
    public void mathPi() {
        //MoLang molang = new MoLang("math.pi");


        //assertEquals((float)Math.PI, molang.Evaluate(), 0);
    }

    @Test
    public void mathPow() {
        MoLang molang = new MoLang("math.pow(2, 3)");

        assertEquals(8, molang.evaluate(), 0);
    }

    @Test
    public void mathRandom() {
        //Can't really test random huh

        MoLang molang = new MoLang("math.random(1, 5)");

        float result = molang.evaluate();
        assertEquals(true, (result >= 1 && result <= 5));
    }

    @Test
    public void mathRandomInteger() {
        //Can't really test random huh

        MoLang molang = new MoLang("math.random_integer(1, 5)");

        float result = molang.evaluate();
        assertEquals(true, (result >= 1 && result <= 5 && (result - (int)result == 0)));
    }

    @Test
    public void mathRound() {
        MoLang molang1 = new MoLang("math.round(2.5)");
        MoLang molang2 = new MoLang("math.round(2.4)");

        assertEquals(3, molang1.evaluate(), 0);
        assertEquals(2, molang2.evaluate(), 0);
    }

    @Test
    public void mathSin() {
        MoLang molang = new MoLang("math.sin(30)");

        assertEquals(0.5, molang.evaluate(), 0);
    }

    @Test
    public void mathSqrt() {
        MoLang molang1 = new MoLang("math.sqrt(4)");
        MoLang molang2 = new MoLang("math.sqrt(16)");
        MoLang molang3 = new MoLang("math.sqrt(64)");

        assertEquals(2, molang1.evaluate(), 0);
        assertEquals(4, molang2.evaluate(), 0);
        assertEquals(8, molang3.evaluate(), 0);
    }

    @Test
    public void mathTrunc() {
        MoLang molang1 = new MoLang("math.trunc(1.5)");
        MoLang molang2 = new MoLang("math.trunc(-1.5)");

        assertEquals(1, molang1.evaluate(), 0);
        assertEquals(-1, molang2.evaluate(), 0);
    }


}
