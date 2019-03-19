package ch.lihsmi.effectivejava.chapter2.item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverrideToStringTest {

    @Test
    public void toStringReturnsExpectedValueForEmptyObject() {
        OverrideToString overrideToString = new OverrideToString();
        assertEquals("{ \"field1\": null, \"field2\": null }", overrideToString.toString());
    }

    @Test
    public void toStringReturnsFieldsAsJson() {
        OverrideToString overrideToString = new OverrideToString("value1", "value2");
        assertEquals("{ \"field1\": \"value1\", \"field2\": \"value2\" }", overrideToString.toString());
    }

}