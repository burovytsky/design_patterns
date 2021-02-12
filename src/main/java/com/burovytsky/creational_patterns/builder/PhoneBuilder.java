package com.burovytsky.creational_patterns.builder;

import com.burovytsky.creational_patterns.builder.model.*;

public class PhoneBuilder implements Builder {
    private PhoneType phoneType;
    private Screen screen;
    private Camera camera;
    private CPU cpu;
    private Battery battery;

    public Phone getSmartphone() {
        return new Phone(phoneType, screen, camera, cpu, battery);
    }

    @Override
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
