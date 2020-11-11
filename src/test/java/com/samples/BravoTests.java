package com.samples;

import com.samples.category.BravoCategory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(BravoCategory.class)
public class BravoTests {

    @Test
    public void testSetterAndGetterForId() {
        Bravo bravo = new Bravo("1", "bravo");
        assertEquals("1", bravo.getId());
        assertEquals("bravo", bravo.getName());
        bravo.setId("2");
        assertEquals("2", bravo.getId());
        assertEquals("bravo", bravo.getName());
    }

    @Test
    public void testSetterAndGetterForName() {
        Bravo bravo = new Bravo("1", "bravo");
        assertEquals("1", bravo.getId());
        assertEquals("bravo", bravo.getName());
        bravo.setName("bravo-new");
        assertEquals("1", bravo.getId());
        assertEquals("bravo-new", bravo.getName());
    }
}
