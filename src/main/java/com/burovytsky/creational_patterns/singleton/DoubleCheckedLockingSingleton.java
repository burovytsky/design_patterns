package com.burovytsky.creational_patterns.singleton;

/**
 * Пусть мы создаем нового студента: Student s = new Student(), тогда
 *
 * 1) local_ptr = malloc(sizeof(Student)) // выделение памяти под сам объект;
 * 2) s = local_ptr // инициализация указателя;
 * 3) Student::ctor(s); // конструирование объекта (инициализация полей);
 *
 * Таким образом, между вторым и третьим этапом возможна ситуация, при которой другой поток может получить и
 * начать использовать (на основании условия, что указатель не нулевой) не полностью сконструированный объект.
 * На самом деле, эта проблема была частично решена в JDK 1.5 [5], однако авторы JSR-133 [5] рекомендуют
 * использовать volatile для Double Cheсked Lock
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    public static DoubleCheckedLockingSingleton getInstance() {
        DoubleCheckedLockingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return localInstance;
    }

}
