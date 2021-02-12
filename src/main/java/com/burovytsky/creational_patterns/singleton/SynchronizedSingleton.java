package com.burovytsky.creational_patterns.singleton;

/**
 * Одиночка — это порождающий паттерн, который гарантирует существование только одного объекта определённого
 * класса, а также позволяет достучаться до этого объекта из любого места программы.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
