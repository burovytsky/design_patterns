package com.burovytsky.creational_patterns.builder.model;

public class Screen {
    private int size;
    private String type;
    private boolean isProtected;

    public Screen(int size, String type, boolean isProtected) {
        this.size = size;
        this.type = type;
        this.isProtected = isProtected;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", isProtected=" + isProtected +
                '}';
    }
}
