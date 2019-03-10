package ch.lihsmi.effectivejava.chapter1.item5;

public class UnnecessaryObjects {

    public static String dontDoThis() {
        /*
          since "stringcontent" itself is a string object, this
          creates an unnecessary object.
         */
        return new String("stringcontent");
    }

    public static String doThis() {
        String result = "stringcontent";
        return result;
    }

}
