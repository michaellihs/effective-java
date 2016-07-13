package ch.lihsmi.effectivejava.chapter1.item6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryEffectiveStackTest {

    @Test
    public void elementCanBePushedToStack() {
        MemoryEffectiveStack<Integer> stack = new MemoryEffectiveStack<>();
        stack.push(1);
    }

    @Test
    public void elementCanBePoppedFromStack() {
        MemoryEffectiveStack<Integer> stack = new MemoryEffectiveStack<>();
        stack.push(1);

        Integer pop = stack.pop();
        Integer expected = 1;

        assertEquals(expected, pop);
    }

    @Test
    public void stackGrowsAboveInitialSize() {
        MemoryEffectiveStack<Integer> stack = new MemoryEffectiveStack<>();

        for (int i = 1; i < 30; i++) {
            stack.push(i);
        }
    }

    @Test
    public void elementsArePoppedAsExpected() {
        MemoryEffectiveStack<Integer> stack = new MemoryEffectiveStack<>();

        for (int i = 1; i < 30; i++) {
            stack.push(i);
        }

        for (int i = 29; i > 0; i--) {
            Integer expected = i;
            assertEquals(expected, stack.pop());
        }
    }

}