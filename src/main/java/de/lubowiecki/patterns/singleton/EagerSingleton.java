package de.lubowiecki.patterns.singleton;

public class EagerSingleton {

    // Hält eine statische Referenz auf ein Objekt von sich selbst
    private static final EagerSingleton instance = new EagerSingleton();

    private int count;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void up() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
