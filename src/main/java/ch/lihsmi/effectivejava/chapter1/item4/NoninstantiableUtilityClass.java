package ch.lihsmi.effectivejava.chapter1.item4;

public class NoninstantiableUtilityClass {

    private NoninstantiableUtilityClass() {
        // class should be non-instantiable
        throw new AssertionError();
    }

}
