package ch.lihsmi.effectivejava.chapter1.item5;

public class UnnecessaryObjects {

    public static String dontDoThis() {
        return new String("stringcontent");
    }

    public static String doThis() {
        String result = "stringcontent";
        return "result";
    }

}
