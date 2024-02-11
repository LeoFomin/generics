package com.car;

public abstract class Auto {
    protected String name;
    protected String color;
    protected int maxSpeed;

    protected Auto(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    protected void carInfo() {}
}
