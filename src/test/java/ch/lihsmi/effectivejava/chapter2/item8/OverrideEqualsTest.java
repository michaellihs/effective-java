package ch.lihsmi.effectivejava.chapter2.item8;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverrideEqualsTest {

    @Test
    public void overridenEqualsIsReflexive() {
        OverrideEquals.ValueClass x = OverrideEquals.getValueClassFor(10);
        assertTrue(x.equals(x));
    }

    @Test
    public void overridenEqualsIsSymmetric() {
        int value = 100;
        OverrideEquals.ValueClass x = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass y = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass z = OverrideEquals.getValueClassFor(value + 1);

        assertTrue(x.equals(y) && y.equals(x));
        assertFalse(x.equals(z) || z.equals(x));
    }

    @Test
    public void overrideEqualsIsTransitive() {
        int value = 101;
        OverrideEquals.ValueClass x = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass y = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass z = OverrideEquals.getValueClassFor(value);

        OverrideEquals.ValueClass w = OverrideEquals.getValueClassFor(value + 1);

        assertTrue(!(x.equals(y) && y.equals(z)) || x.equals(z));
        assertTrue(!(x.equals(y) && y.equals(w)) || x.equals(w));
    }

    @Test
    public void overriddenEqualsIsConsistent() {
        int value = 100;
        OverrideEquals.ValueClass x = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass y = OverrideEquals.getValueClassFor(value);
        OverrideEquals.ValueClass z = OverrideEquals.getValueClassFor(value + 1);

        assertTrue(x.equals(y));
        assertTrue(x.equals(y));
        assertTrue(x.equals(y));

        assertFalse(x.equals(z));
        assertFalse(x.equals(z));
        assertFalse(x.equals(z));
    }

    @Test
    public void notNullNeverEqualsNull() {
        OverrideEquals.ValueClass x = OverrideEquals.getValueClassFor(10);
        assertFalse(x.equals(null));
    }

}