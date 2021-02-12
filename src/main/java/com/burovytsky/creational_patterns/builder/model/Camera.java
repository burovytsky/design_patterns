package com.burovytsky.creational_patterns.builder.model;

public class Camera {
    private String producer;
    private int pixels;
    private int aperture;

    public Camera(String producer, int pixels, int aperture) {
        this.producer = producer;
        this.pixels = pixels;
        this.aperture = aperture;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public int getAperture() {
        return aperture;
    }

    public void setAperture(int aperture) {
        this.aperture = aperture;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "producer='" + producer + '\'' +
                ", pixels=" + pixels +
                ", aperture=" + aperture +
                '}';
    }
}
