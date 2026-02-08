package com.javapart2;



public class M2 {

	public static void main(String[] args) {
		Engine e=new Engine();
		
		Car c=new Car("BMW","Black",e);
		
		System.out.println(c);
		System.out.println(c.engine);
	}

}
class Car{
	String brand;
	String color;
	Engine engine;
	
	public Car(String brand,String color,Engine engine) {
		this.brand=brand;
		this.color=color;
		this.engine=engine;
		
		}
	
}
class Engine{
	int cc;
	
}