package com.inhertence;

public class Shape {
	 void draw() {
	        System.out.println("Drawing a shape...");
	    }
}

class Circle extends Shape{
	 void area(double radius) {
	        double result = 3.14 * radius * radius;
	        System.out.println("Area of Circle: " + result);
	    }

	    public static void main(String[] args) {
	        Circle c = new Circle();
	        c.draw();      // inherited method
	        c.area(5);     // child class method
	    }
	
}