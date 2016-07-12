package ch.lihsmi.effectivejava.chapter1.item3;

public enum SingletonWithEnum {

    INSTANCE;

    public String aMethod() {
        return "a value";
    }

}
