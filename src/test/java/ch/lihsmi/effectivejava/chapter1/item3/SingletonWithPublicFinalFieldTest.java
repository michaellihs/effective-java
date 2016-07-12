package ch.lihsmi.effectivejava.chapter1.item3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonWithPublicFinalFieldTest {

    @Test
    public void publicFinalFieldReturnsExpectedSingletonInstance() {
        SingletonInstance singletonInstance1 = SingletonInstance.INSTANCE;
        SingletonInstance singletonInstance2 = SingletonInstance.INSTANCE;

        assertEquals(singletonInstance1, singletonInstance2);
    }

}
