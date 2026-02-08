package ConstructorChaning;

abstract class Car {
    Car() {
        System.out.println("Car Abstract class constructor");
    }
}

class BMW extends Car {
    BMW() {
        super();
        System.out.println("BMW class constructor");
    }
}

public class AbCar {
    public static void main(String[] args) {
        BMW b = new BMW();
    }
}
