package ch.lihsmi.effectivejava.chapter1.item1;

/**
 * Unlike constructors, static factory methods can have names.
 *
 * You can hide "strange" constructors (i.e. ones that have unused parameters)
 */
public class NamedConstructor {

    public static ClassWithMultipleConstructors getForColor(int color) {
        return new ClassWithMultipleConstructors(color);
    }

    public static ClassWithMultipleConstructors getForSize(int size) {
        return new ClassWithMultipleConstructors(size, 0);
    }



    public static class ClassWithMultipleConstructors {

        private final int color;

        private final int size;

        private ClassWithMultipleConstructors(int color) {
            this.color = color;
            this.size = 0;
        }

        private ClassWithMultipleConstructors(int size, int color) {
            this.color = color;
            this.size = size;
        }

        public int getColor() {
            return color;
        }

        public int getSize() {
            return size;
        }

    }

}
