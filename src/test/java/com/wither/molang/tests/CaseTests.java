package com.wither.molang.tests;

import com.wither.molang.MoLang;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseTests {
    @Test
    public void caseInsensitive() {
        MoLang moLang = new MoLang("MaTh.CoS(60) + mAtH.sIn(30) + math.round(0.5) + MATH.TRUNC(0.5) + qUeRy.cOuNt(2, 2, 2)");

        assertEquals(5, moLang.evaluate(), 0);
    }
}
