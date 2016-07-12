package ch.lihsmi.effectivejava.chapter1.item3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonWithEnumTest {

    @Test
    public void enumElementReturnsExpectedSingleton() {
        SingletonWithEnum singletonWithEnum1 = SingletonWithEnum.INSTANCE;
        SingletonWithEnum singletonWithEnum2 = SingletonWithEnum.INSTANCE;

        assertEquals(singletonWithEnum1, singletonWithEnum2);
    }

    @Test
    public void enumSingletonWorksAsExpected() {
        SingletonWithEnum singletonWithEnum = SingletonWithEnum.INSTANCE;
        assertEquals("a value", singletonWithEnum.aMethod());
    }

}
