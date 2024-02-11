package com.car;


public class Car extends Auto {
    protected String seatMaterial;

    protected Car(String name, String color, int maxSpeed, String seatMaterial) {
        super(name, color, maxSpeed);
        this.seatMaterial = seatMaterial;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    protected void carInfo() {
        System.out.println("Name: " + this.name + " Color: " + this.color + " maxSpeed: " + this.maxSpeed + " seatMaterial: " + seatMaterial);
    }
}
