package com.car;

public class Bus extends Car {
    protected Integer seatNumber;
    protected Integer doorNumber;

    protected Bus(String name, String color, int maxSpeed, String seatMaterial, int seatNumber, int doorNumber) {
        super(name, color, maxSpeed, seatMaterial);
        this.seatNumber = seatNumber;
        this.doorNumber = doorNumber;
    }

    @Override
    protected void carInfo() {
        System.out.println("Name: " + this.name + " Color: " + this.color + " maxSpeed: " + this.maxSpeed +
                " seatMaterial: " + this.seatMaterial + " seatNumber: " + this.seatNumber + " doorNumber: " + this.doorNumber);
    }
}
