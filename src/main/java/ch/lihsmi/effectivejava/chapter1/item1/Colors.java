package ch.lihsmi.effectivejava.chapter1.item1;

/**
 * Factories are not required to return a new object INSTANCE every time they are invoked
 *
 * - Allows immutable classes
 * - Allows singleton instances
 * - Enables guarantee that no two equal instances exist
 */
public class Colors {

    private static Color red = new Color(255,0,0);

    private static Color green = new Color(0,255,0);
    
    private static Color blue = new Color(0,0,255);
    
    public static Color blue() {
        return blue;
    }
    
    public static Color red() {
        return red;
    }
    
    public static Color green() {
        return green;
    }


    public static class Color {

        private final int blue;

        private final int green;

        private final int red;

        private Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public int red() {
            return red;
        }

        public int green() {
            return green;
        }

        public int blue() {
            return blue;
        }

    }

}
