package com.redi;

public class Car {
    String name;
    int fuelLevel;
    int maxSpeed;
    boolean broken;

    public Car() {
    }

    public Car(String name, int fuelLevel, int maxSpeed, boolean broken) {
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.maxSpeed = maxSpeed;
        this.broken = broken;
    }

    void drive() {
        if (broken) {
            System.out.println("Car " + name + " is broken");
        } else if (fuelLevel > 0) {
            System.out.println("Car " + name + " is driving with speed " + maxSpeed);
            fuelLevel -= 50;
        } else {
            System.out.println("Out of fuel");
        }
    }

    void refuel() {
        System.out.println("Refueling the car " + name);
        fuelLevel = 100;
    }

}
