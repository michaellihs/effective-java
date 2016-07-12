package ch.lihsmi.effectivejava.chapter1.item3;

public class SingletonWithStaticFactory {

    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    public static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    private SingletonWithStaticFactory() {}

}
