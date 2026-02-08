package com.inhertence;

public class AnimalClass {
	 void makeSound() {
		System.out.println("Animal making Sound");
	}
}

public class Cat extends AnimalClass{
	void makeSound() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Cat c=new Cat();
		c.makeSound();
		
	}
}
