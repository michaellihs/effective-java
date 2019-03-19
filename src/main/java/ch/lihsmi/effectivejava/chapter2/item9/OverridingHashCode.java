package ch.lihsmi.effectivejava.chapter2.item9;

public class OverridingHashCode {

    // enables caching of hashCode
    private volatile int hashCode;     // `volatile` guarantees that variable is read from RAM, not from CPU cache

    private final int size;
    private final String name;

    public OverridingHashCode(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 17;                     // make hash value influenced of field returning 0 in later steps
            result = 31 * result + size;    // 31 is chosen since it can be calculated as i * 31 == (i << 5) - i
            result = 31 * result + name.hashCode();
            hashCode = result;
        }
        return result;
    }

}
