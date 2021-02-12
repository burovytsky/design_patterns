package com.burovytsky.creational_patterns.builder;

import com.burovytsky.creational_patterns.builder.model.*;

public class Phone {
    private final PhoneType phoneType;
    private final Screen screen;
    private final Camera camera;
    private final CPU cpu;
    private final Battery battery;

    public Phone(PhoneType phoneType, Screen screen, Camera camera, CPU cpu, Battery battery) {
        this.phoneType = phoneType;
        this.screen = screen;
        this.camera = camera;
        this.cpu = cpu;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone " + phoneType ;
    }
}
