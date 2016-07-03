package ch.lihsmi.effectivejava.chapter1.item1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtypesTest {

    @Test
    public void one() throws Exception {
        Subtypes one = Subtypes.one();
        assertEquals("one", one.type());
    }

    @Test
    public void two() throws Exception {
        Subtypes two = Subtypes.two();
        assertEquals("two", two.type());
    }

    @Test
    public void three() throws Exception {
        Subtypes three = Subtypes.three();
        assertEquals("three", three.type());
    }

}