package ch.lihsmi.effectivejava.chapter1.item2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void builderCreatesExpectedObjectForEmptyParameterList() {
        ProductWithManyConstructorParameters product = ProductWithManyConstructorParameters.builder("attribute1").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals(null, product.getAttribute2());
        assertEquals(null, product.getAttribute3());
    }

    @Test
    public void builderCreatesExpectedObjectIfOnlyAttribute2IsGiven() {
        ProductWithManyConstructorParameters product = ProductWithManyConstructorParameters.builder("attribute1").withAttribute2("attribute2").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals("attribute2", product.getAttribute2());
        assertEquals(null, product.getAttribute3());
    }

    @Test
    public void builderCreatesExpectedObjectIfOnlyAttribute3IsGiven() {
        ProductWithManyConstructorParameters product = ProductWithManyConstructorParameters.builder("attribute1").withAttribute3("attribute3").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals(null, product.getAttribute2());
        assertEquals("attribute3", product.getAttribute3());
    }

    @Test
    public void builderCreatesExpectedObjectIfAllAttributesAreGiven() {
        ProductWithManyConstructorParameters product = ProductWithManyConstructorParameters.builder("attribute1").withAttribute2("attribute2").withAttribute3("attribute3").build();
        assertEquals("attribute1", product.getAttribute1());
        assertEquals("attribute2", product.getAttribute2());
        assertEquals("attribute3", product.getAttribute3());
    }

}
