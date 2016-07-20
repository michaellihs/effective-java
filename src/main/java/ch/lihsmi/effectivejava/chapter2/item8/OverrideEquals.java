package ch.lihsmi.effectivejava.chapter2.item8;

public class OverrideEquals {

    public static ValueClass getValueClassFor(int value) {
        return new ValueClass(value);
    }

    public static class ValueClass {

        private final int value;

        public ValueClass(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof ValueClass) {
                return ((ValueClass) o).value == value;
            }
            return false;
        }

    }

}
