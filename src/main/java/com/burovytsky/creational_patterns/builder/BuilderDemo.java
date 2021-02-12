package com.burovytsky.creational_patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        Director director = new Director();

        PhoneBuilder phoneBuilder = new PhoneBuilder();
        director.createSmartphone(phoneBuilder);

        Phone newSmartphone = phoneBuilder.getSmartphone();
        System.out.println(newSmartphone);

        PhoneWarrantyBuilder phoneWarrantyBuilder = new PhoneWarrantyBuilder();
        director.createSmartphone(phoneWarrantyBuilder);

        Warranty warranty = phoneWarrantyBuilder.createWarranty();
        System.out.println(warranty.getWarranty());
    }
}
