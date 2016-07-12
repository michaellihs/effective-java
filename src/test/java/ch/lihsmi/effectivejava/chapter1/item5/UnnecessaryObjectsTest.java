package ch.lihsmi.effectivejava.chapter1.item5;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnnecessaryObjectsTest {

    @Test
    public void dontDoThis() throws Exception {
        String firstInstance = UnnecessaryObjects.dontDoThis();
        String secondInstance = UnnecessaryObjects.dontDoThis();

        assertEquals(firstInstance, secondInstance);
        assertNotSame(firstInstance, secondInstance);
    }

    @Test
    public void doThis() throws Exception {
        String firstInstance = UnnecessaryObjects.doThis();
        String secondInstance = UnnecessaryObjects.doThis();

        assertEquals(firstInstance, secondInstance);
        assertSame(firstInstance, secondInstance);
    }

}