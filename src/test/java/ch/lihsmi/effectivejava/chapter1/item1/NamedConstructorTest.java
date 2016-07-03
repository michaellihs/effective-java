package ch.lihsmi.effectivejava.chapter1.item1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamedConstructorTest {

    @Test
    public void getForColorReturnsExpectedObject() {
        NamedConstructor.ClassWithMultipleConstructors object = NamedConstructor.getForColor(50);
        assertEquals(50, object.getColor());
        assertEquals(0, object.getSize());
    }

    @Test
    public void getForSizeReturnsExpectedObject() {
        NamedConstructor.ClassWithMultipleConstructors object = NamedConstructor.getForSize(80);
        assertEquals(80, object.getSize());
        assertEquals(0, object.getColor());
    }

}