package singleton.v5;

public enum Singleton {
    INSTANCE;

    public Singleton getInstance() {
        return INSTANCE;
    }
}