package ch.lihsmi.effectivejava.chapter2.item9;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverridingHashCodeTest {

    @Test
    public void hashCodeReturnsEquivalentValueForEqualObjects() {
        OverridingHashCode obj1 = new OverridingHashCode(10, "name");
        OverridingHashCode obj2 = new OverridingHashCode(10, "name");
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }

    @Test
    public void hashCodeReturnsDifferentValueForDifferentObjects() {
        OverridingHashCode obj1 = new OverridingHashCode(10, "name");
        OverridingHashCode obj2 = new OverridingHashCode(11, "name");
        assertNotEquals(obj1.hashCode(), obj2.hashCode());

        OverridingHashCode obj3 = new OverridingHashCode(10, "namee");
        OverridingHashCode obj4 = new OverridingHashCode(10, "name");
        assertNotEquals(obj3.hashCode(), obj4.hashCode());
    }

}