package ch.lihsmi.effectivejava.chapter1.item1;

/**
 * Static factory methods allow the return of any subtype
 */
public abstract class Subtypes {

    public static Subtypes one() {
        return new SubtypeOne();
    }

    public static Subtypes two() {
        return new SubtypeTwo();
    }

    public static Subtypes three() {
        return new SubtypeThree();
    }

    abstract public String type();

    private static class SubtypeOne extends  Subtypes {

        @Override
        public String type() {
            return "one";
        }
    }

    private static class SubtypeTwo extends  Subtypes {


        @Override
        public String type() {
            return "two";
        }
    }

    private static class SubtypeThree extends Subtypes {

        @Override
        public String type() {
            return "three";
        }
    }

}
