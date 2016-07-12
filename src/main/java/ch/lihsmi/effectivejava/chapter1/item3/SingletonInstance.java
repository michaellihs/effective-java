package ch.lihsmi.effectivejava.chapter1.item3;

public class SingletonInstance {

    public static final SingletonInstance INSTANCE = new SingletonInstance();

    private SingletonInstance() {}

}
