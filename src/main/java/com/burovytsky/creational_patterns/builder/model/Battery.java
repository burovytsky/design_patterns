package com.burovytsky.creational_patterns.builder.model;

public class Battery {
    private int capacity;
    private String producer;
    private String type;

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                ", producer='" + producer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Battery(int capacity, String producer, String type) {
        this.capacity = capacity;
        this.producer = producer;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
