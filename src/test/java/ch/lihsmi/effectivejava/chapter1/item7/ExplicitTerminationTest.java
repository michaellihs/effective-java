package ch.lihsmi.effectivejava.chapter1.item7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExplicitTerminationTest {

    @Test
    public void terminateExplicitly() throws Exception {
        ExplicitTermination explicitTermination = new ExplicitTermination();
        explicitTermination.terminateExplicitly();
        assertTrue(explicitTermination.getTerminatedClass().wasTerminated());
    }

}