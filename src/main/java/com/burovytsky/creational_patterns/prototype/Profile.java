package com.burovytsky.creational_patterns.prototype;

import java.util.Objects;

public class Profile implements Copyable {
    private int id;
    private String name;
    private String info;

    public Profile(){}

    public Profile(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public Copyable getClone() {
        return new Profile(id, name, info);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return id == profile.id &&
                Objects.equals(name, profile.name) &&
                Objects.equals(info, profile.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, info);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

}
