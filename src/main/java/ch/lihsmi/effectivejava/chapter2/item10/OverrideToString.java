package ch.lihsmi.effectivejava.chapter2.item10;

import java.util.HashMap;
import java.util.Map;

public class OverrideToString {

    private final String field1, field2;

    public OverrideToString(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public OverrideToString() {
        this(null, null);
    }

    @Override
    public String toString() {
        Map<String, String> map = new HashMap<>();
        return "{ \"field1\": " + stringifyField(field1) + ", \"field2\": " + stringifyField(field2) + " }";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private static String stringifyField(String field1) {
        return field1 == null ? "null" : "\"" + field1 +"\"";
    }

}
