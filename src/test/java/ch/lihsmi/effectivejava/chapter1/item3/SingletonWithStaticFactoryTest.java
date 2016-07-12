package ch.lihsmi.effectivejava.chapter1.item3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonWithStaticFactoryTest {

    @Test
    public void staticFactoryReturnsSingletonInstanceAsExpected() {
        SingletonWithStaticFactory singletonWithStaticFactory1 = SingletonWithStaticFactory.getInstance();
        SingletonWithStaticFactory singletonWithStaticFactory2 = SingletonWithStaticFactory.getInstance();

        assertEquals(singletonWithStaticFactory1, singletonWithStaticFactory2);
    }

}
