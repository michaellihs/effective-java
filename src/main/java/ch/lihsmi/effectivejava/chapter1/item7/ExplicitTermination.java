package ch.lihsmi.effectivejava.chapter1.item7;

public class ExplicitTermination {

    TerminatedClass terminatedClass = new TerminatedClass();

    public void terminateExplicitly() {
        try {
            // do something...
        } finally {
            terminatedClass.terminate();
        }
    }


    public TerminatedClass getTerminatedClass() {
        return terminatedClass;
    }


    public static class TerminatedClass {

        private boolean wasTerminated = false;

        public void terminate() {
            wasTerminated = true;
        }

        public boolean wasTerminated() {
            return wasTerminated;
        }

    }

}
