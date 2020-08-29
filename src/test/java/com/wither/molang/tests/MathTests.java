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
}
