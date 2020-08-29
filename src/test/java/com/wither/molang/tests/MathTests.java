package com.wither.molang.tests;

import com.wither.molang.MoLang;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTests {

    @Test
    public void mathAbs() {
        MoLang molang = new MoLang("math.abs(-5)");

        assertEquals(5, molang.Evaluate(), 0);
    }

    @Test
    public void mathAcos() {
        MoLang molang = new MoLang("math.acos(0.5)");

        assertEquals(60, molang.Evaluate(), 0);
    }

    @Test
    public void mathAsin() {
        MoLang molang = new MoLang("math.asin(0.5)");

        assertEquals(30, molang.Evaluate(), 0);
    }

    @Test
    public void mathAtan() {
        MoLang molang = new MoLang("math.atan(1)");

        assertEquals(45, molang.Evaluate(), 0);
    }

    @Test
    public void mathAtan2() {
        MoLang molang = new MoLang("math.atan2(5, 5)");

        assertEquals(45, molang.Evaluate(), 0);
    }

    @Test
    public void mathCeil() {
        MoLang molang = new MoLang("math.ceil(5.5)");

        assertEquals(6, molang.Evaluate(), 0);
    }

    @Test
    public void mathClamp() {
        MoLang molang1 = new MoLang("math.clamp(55, 0, 5)");
        MoLang molang2 = new MoLang("math.clamp(-55, 0, 5)");

        assertEquals(5, molang1.Evaluate(), 0);
        assertEquals(0, molang2.Evaluate(), 0);
    }

    @Test
    public void mathCos() {
        MoLang molang = new MoLang("math.cos(60)");

        assertEquals(0.5, molang.Evaluate(), 0);
    }

    @Test
    public void mathExp() {
        MoLang molang = new MoLang("math.exp(5)");

        assertEquals((float)Math.pow(Math.E, 5), molang.Evaluate(), 0);
    }

    @Test
    public void mathFloor() {
        MoLang molang = new MoLang("math.floor(5.5)");

        assertEquals(5, molang.Evaluate(), 0);
    }

    @Test
    public void mathHermiteBlend() {
        MoLang molang = new MoLang("math.hermite_blend(5)");

        assertEquals(-175, molang.Evaluate(), 0);
    }

    @Test
    public void mathLerp() {
        MoLang molang1 = new MoLang("math.lerp(0, 1, 1)");
        MoLang molang2 = new MoLang("math.lerp(0, 1, 0)");
        MoLang molang3 = new MoLang("math.lerp(0, 50, 0.5)");

        assertEquals(1, molang1.Evaluate(), 0);
        assertEquals(0, molang2.Evaluate(), 0);
        assertEquals(25, molang3.Evaluate(), 0);
    }

    @Test
    public void mathLn() {
        MoLang molang1 = new MoLang("math.ln(5)");
        assertEquals((float) Math.log(5), molang1.Evaluate(), 0);
    }

    @Test
    public void mathMax() {
        MoLang molang = new MoLang("math.max(1, 5)");
        assertEquals(5, molang.Evaluate(), 0);
    }

    @Test
    public void mathMin() {
        MoLang molang = new MoLang("math.min(1, 5)");
        assertEquals(1, molang.Evaluate(), 0);
    }

    @Test
    public void mathMod() {
        MoLang molang1 = new MoLang("math.mod(8, 5)");
        MoLang molang2 = new MoLang("math.mod(8, 4)");

        assertEquals(3, molang1.Evaluate(), 0);
        assertEquals(0, molang2.Evaluate(), 0);
    }

    @Test
    public void mathPi() {
        //MoLang molang = new MoLang("math.pi");


        //assertEquals((float)Math.PI, molang.Evaluate(), 0);
    }

    @Test
    public void mathPow() {
        MoLang molang = new MoLang("math.pow(2, 3)");

        assertEquals(8, molang.Evaluate(), 0);
    }

    @Test
    public void mathRound() {
        MoLang molang1 = new MoLang("math.round(2.5)");
        MoLang molang2 = new MoLang("math.round(2.4)");

        assertEquals(3, molang1.Evaluate(), 0);
        assertEquals(2, molang2.Evaluate(), 0);
    }

    @Test
    public void mathSin() {
        MoLang molang = new MoLang("math.sin(30)");

        assertEquals(0.5, molang.Evaluate(), 0);
    }

    @Test
    public void mathSqrt() {
        MoLang molang1 = new MoLang("math.sqrt(4)");
        MoLang molang2 = new MoLang("math.sqrt(16)");
        MoLang molang3 = new MoLang("math.sqrt(64)");

        assertEquals(2, molang1.Evaluate(), 0);
        assertEquals(4, molang2.Evaluate(), 0);
        assertEquals(8, molang3.Evaluate(), 0);
    }

    @Test
    public void mathTrunc() {
        MoLang molang1 = new MoLang("math.trunc(1.5)");
        MoLang molang2 = new MoLang("math.trunc(-1.5)");

        assertEquals(1, molang1.Evaluate(), 0);
        assertEquals(-1, molang2.Evaluate(), 0);
    }


}
