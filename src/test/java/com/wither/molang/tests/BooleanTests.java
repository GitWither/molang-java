package com.wither.molang.tests;

import com.wither.molang.MoLang;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleanTests {
    @Test
    public void greaterThan() {
        MoLang molang1 = new MoLang("5 > 4");
        MoLang molang2 = new MoLang("-1 > -5");

        MoLang molang3 = new MoLang("-5 > -1");
        MoLang molang4 = new MoLang("1 > 5");


        assertEquals(1.0, molang1.evaluate(), 0);
        assertEquals(1.0, molang2.evaluate(), 0);

        assertEquals(0.0, molang3.evaluate(), 0);
        assertEquals(0.0, molang4.evaluate(), 0);
    }

    @Test
    public void lessThan() {
        MoLang molang1 = new MoLang("4 < 5");
        MoLang molang2 = new MoLang("-5 < -1");

        MoLang molang3 = new MoLang("-1 < -5");
        MoLang molang4 = new MoLang("5 < 1");


        assertEquals(1.0, molang1.evaluate(), 0);
        assertEquals(1.0, molang2.evaluate(), 0);

        assertEquals(0.0, molang3.evaluate(), 0);
        assertEquals(0.0, molang4.evaluate(), 0);
    }

    @Test
    public void greaterOrEqual() {
        MoLang molang1 = new MoLang("5 >= 4");
        MoLang molang2 = new MoLang("-1 >= -5");

        MoLang molang3 = new MoLang("-5 >= -1");
        MoLang molang4 = new MoLang("1 >= 5");

        MoLang molang5 = new MoLang("5 >= 5");


        assertEquals(1.0, molang1.evaluate(), 0);
        assertEquals(1.0, molang2.evaluate(), 0);

        assertEquals(0.0, molang3.evaluate(), 0);
        assertEquals(0.0, molang4.evaluate(), 0);

        assertEquals(1.0, molang5.evaluate(), 0);
    }

    @Test
    public void lessOrEqual() {
        MoLang molang1 = new MoLang("4 <= 5");
        MoLang molang2 = new MoLang("-5 <= -1");

        MoLang molang3 = new MoLang("-1 <= -5");
        MoLang molang4 = new MoLang("5 <= 1");

        MoLang molang5 = new MoLang("5 <= 5");

        assertEquals(1.0, molang1.evaluate(), 0);
        assertEquals(1.0, molang2.evaluate(), 0);

        assertEquals(0.0, molang3.evaluate(), 0);
        assertEquals(0.0, molang4.evaluate(), 0);

        assertEquals(1.0, molang5.evaluate(), 0);
    }
}
