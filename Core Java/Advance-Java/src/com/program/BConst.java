package com.program;

class Animal extends Object{
	Animal(int a){
		this();
		System.out.println(a);
		System.out.println("Animal");

	}
	Animal(){
		
	
	}
	
}

class Dog extends Animal{

	Dog(){
		super(10);
		System.out.println("Dog");
	}
	
}


public class BConst {
	
	

	public static void main(String[] args) {
		Dog d =new Dog();
	}

}


//10 example of consturctor channing and 5 this statement 5 super statement {parent absrct class }type name = new type();

println