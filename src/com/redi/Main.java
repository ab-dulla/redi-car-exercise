package com.redi;

public class Main {

    public static void main(String[] args) {

        // Creating an object from the class Car using a custom constructor
        Car mini = new Car("Mini Cooper", 50, 210, false);

        // using the Car object `mini`
        mini.drive();


        // Creating another object from the class Car using the default constructor
        Car ferrari = new Car();
        ferrari.maxSpeed = 340;
        ferrari.name = "Ferrari GTS";
        ferrari.broken = true;
        ferrari.fuelLevel = 100;

        // Using the Car object `ferrari`
        ferrari.drive();
        mini.refuel();

    }
}
