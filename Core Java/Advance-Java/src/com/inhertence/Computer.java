package com.inhertence;

public class Computer {
    String brand;
    int ram;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
    }
}

class Laptop extends Computer {
    float weight;

    void showLaptopDetails() {
        System.out.println("Laptop Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();

        
        l.brand = "HP";
        l.ram = 16;
        l.weight = 1.8f;

        // using methods
        l.showDetails();           
        l.showLaptopDetails();  
    }
}
