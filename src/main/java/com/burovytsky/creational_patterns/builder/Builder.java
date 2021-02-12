package com.burovytsky.creational_patterns.builder;
import com.burovytsky.creational_patterns.builder.model.*;


/**
 * Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные
 * объекты пошагово. Строитель даёт возможность использовать один и тот же код строительства для
 * получения разных представлений объектов.
 */
public interface Builder {
    void setPhoneType(PhoneType type);
    void setScreen(Screen screen);
    void setCamera(Camera camera);
    void setCPU(CPU cpu);
    void setBattery(Battery battery);
}
