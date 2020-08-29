package com.wither.molang.tests;

import com.wither.molang.MoLang;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueryTests {

    @Test
    public void queryCount() {
        MoLang moLang = new MoLang("query.count(5, 6, 2, 5)");
        //TODO: Implement test for arrays too

        assertEquals(4, moLang.evaluate(), 0);
    }
}
