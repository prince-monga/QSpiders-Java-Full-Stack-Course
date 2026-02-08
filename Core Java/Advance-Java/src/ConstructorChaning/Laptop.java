package ConstructorChaning;

public class Laptop {
	  Laptop() {
	        this("HP", 50000);
	        System.out.println("Default Laptop Constructor");
	    }

	    Laptop(String brand) {
	        this(brand, 60000);
	        System.out.println("Laptop Brand Constructor");
	    }

	    Laptop(String brand, int price) {
	        System.out.println("Brand: " + brand + ", Price: " + price);
	    }

	    public static void main(String[] args) {
	        Laptop l = new Laptop();
	    }
}
