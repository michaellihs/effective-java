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

    @Test
    public void builderCreatesExpectedObjectIfOnlyAttribute2IsGiven() {
        Product product = new Product.Builder("attribute1").withAttribute2("attribute2").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals("attribute2", product.getAttribute2());
        assertEquals(null, product.getAttribute3());
    }

    @Test
    public void builderCreatesExpectedObjectIfOnlyAttribute3IsGiven() {
        Product product = new Product.Builder("attribute1").withAttribute3("attribute3").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals(null, product.getAttribute2());
        assertEquals("attribute3", product.getAttribute3());
    }

    @Test
    public void builderCreatesExpectedObjectIfAllAttributesAreGiven() {
        Product product = new Product.Builder("attribute1").withAttribute2("attribute2").withAttribute3("attribute3").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals("attribute2", product.getAttribute2());
        assertEquals("attribute3", product.getAttribute3());
    }

}
