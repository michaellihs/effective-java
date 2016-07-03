package ch.lihsmi.effectivejava.chapter1.item1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorsTest {

    @Test
    public void blueHasExpectedColorValues() {
        Colors.Color blue = Colors.blue();
        assertEquals(255, blue.blue());
        assertEquals(0, blue.green());
        assertEquals(0, blue.red());
    }

    @Test
    public void redHasExpectedColorValues() {
        Colors.Color red = Colors.red();
        assertEquals(255, red.red());
        assertEquals(0, red.blue());
        assertEquals(0, red.green());
    }

    @Test
    public void greenHasExpectedColorValues() {
        Colors.Color green = Colors.green();
        assertEquals(255, green.green());
        assertEquals(0, green.red());
        assertEquals(0, green.blue());
    }

    @Test
    public void greenReturnsTheSameObjectTwice() {
        Colors.Color green1 = Colors.green();
        Colors.Color green2 = Colors.green();
        assertSame(green1, green2);
    }

    @Test
    public void blueReturnsTheSameObjectTwice() {
        Colors.Color blue1 = Colors.blue();
        Colors.Color blue2 = Colors.blue();
        assertSame(blue1, blue2);
    }

    @Test
    public void redReturnsTheSameObjectTwice() {
        Colors.Color red1 = Colors.red();
        Colors.Color red2 = Colors.red();
        assertSame(red1, red2);
    }

}