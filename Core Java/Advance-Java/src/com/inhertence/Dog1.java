package com.inhertence;

public class Dog1 extends Animal1{
	void makeSound() {
		System.out.println("Bow! bow!");
	}
	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.makeSound();
	}
	
}
