package com.samples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphaTests {

    @Test
    public void testSetterAndGetterForId() {
        Alpha alpha = new Alpha("1", "alpha");
        assertEquals("1", alpha.getId());
        assertEquals("alpha", alpha.getName());
        alpha.setId("2");
        assertEquals("2", alpha.getId());
        assertEquals("alpha", alpha.getName());
    }

    @Test
    public void testSetterAndGetterForName() {
        Alpha alpha = new Alpha("1", "alpha");
        assertEquals("1", alpha.getId());
        assertEquals("alpha", alpha.getName());
        alpha.setName("alpha-new");
        assertEquals("1", alpha.getId());
        assertEquals("alpha-new", alpha.getName());
    }
}
