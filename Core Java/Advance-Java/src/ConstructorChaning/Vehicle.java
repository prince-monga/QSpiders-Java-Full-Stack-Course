package ConstructorChaning;

public class Vehicle {
	 Vehicle() {
	        this("Unknown", 0);
	        System.out.println("Default Vehicle Constructor");
	    }

	    Vehicle(String model) {
	        this(model, 2024);
	        System.out.println("Vehicle Model Constructor");
	    }

	    Vehicle(String model, int year) {
	        System.out.println("Model: " + model + ", Year: " + year);
	    }

	    public static void main(String[] args) {
	        Vehicle v = new Vehicle();
	    }

}
