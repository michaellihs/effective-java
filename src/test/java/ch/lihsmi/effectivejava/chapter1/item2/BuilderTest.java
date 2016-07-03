package ch.lihsmi.effectivejava.chapter1.item2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void builderCreatesExpectedObjectForEmptyParameterList() {
        Product product = new Product.Builder("attribute1").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals(null, product.getAttribute2());
        assertEquals(null, product.getAttribute3());
    }

}
