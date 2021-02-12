package com.burovytsky.creational_patterns.prototype;

/**
 * Прототип — это порождающий паттерн проектирования, который позволяет копировать объекты,
 * не вдаваясь в подробности их реализации.
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Profile mainProfile = new Profile(1, "name", "info Main");
        Profile clone = (Profile) mainProfile.getClone();
        System.out.println(mainProfile.equals(clone));
        System.out.println(clone);
    }
}
