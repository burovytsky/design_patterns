package com.burovytsky.creational_patterns.builder;

import com.burovytsky.creational_patterns.builder.model.*;

public class Director {

    public void createGSMPhone(Builder builder){
        builder.setPhoneType(PhoneType.CELLPHONE);
        builder.setScreen(new Screen(3, "IPS", true));
        builder.setCamera(new Camera("sony", 12, 2));
        builder.setCPU(CPU.MEDIATEK);
        builder.setBattery(new Battery(2000, "bt", "li-ion"));
    }

    public void createSmartphone(Builder builder){
        builder.setPhoneType(PhoneType.SMARTPHONE);
        builder.setScreen(new Screen(6, "AMOLED", true));
        builder.setCamera(new Camera("samsung", 64, 1));
        builder.setCPU(CPU.EXYNOS);
        builder.setBattery(new Battery(5000, "bt", "li-ion"));
    }
}
