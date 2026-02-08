package com.inhertence;

public class Vechicle {
	void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vechicle{
	void drive() {
        System.out.println("Car is driving...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // inherited from Vehicle
        c.drive();  // method of Car
    }
}