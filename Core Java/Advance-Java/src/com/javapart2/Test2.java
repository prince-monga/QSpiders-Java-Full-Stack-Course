package com.javapart2;

class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    int speed = 100;
}

class Bike extends Vehicle {
    int speed = 60;
}

public class Test2 {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // upcasting
        
        if(v instanceof Bike) {
            Bike b = (Bike)v;
            System.out.println("Bike speed = " + b.speed);
        }
        if(v instanceof Car) {
            Car c = (Car)v;
            System.out.println("Car speed = " + c.speed);
        }
    }
}

