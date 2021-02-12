package com.burovytsky.creational_patterns.builder;

import com.burovytsky.creational_patterns.builder.model.*;

public class Warranty {
    private final PhoneType phoneType;
    private final Screen screen;
    private final Camera camera;
    private final CPU cpu;
    private final Battery battery;

    public Warranty(PhoneType phoneType, Screen screen, Camera camera, CPU cpu, Battery battery) {
        this.phoneType = phoneType;
        this.screen = screen;
        this.camera = camera;
        this.cpu = cpu;
        this.battery = battery;
    }


    public String getWarranty(){
         return "Warranty{" +
                "phoneType=" + phoneType +
                 System.lineSeparator()+
                ", screen=" + screen +
                 System.lineSeparator()+
                ", camera=" + camera +
                 System.lineSeparator()+
                ", cpu=" + cpu +
                 System.lineSeparator()+
                ", battery=" + battery +
                '}';
    }
}
