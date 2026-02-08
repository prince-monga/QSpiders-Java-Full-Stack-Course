package com.inhertence;

public class MainClass {

	public static void main(String[] args) {
		// (Interface A) parent class ----->(Class B) Child class 
		System.out.println("Class B --Methods..."); //interface to class inhertitence using implemntion 
		B b=new B(); //Specalization--chlid class store refernce own class varible
		b.m1();
		//Animal parent Abstarct class ----> Dog Class
		System.out.println("Class Dog --  Methods...");
		
		//Up-Casting -----Anmail tye varible which store child class refence
		Animal1 d=new Dog1();//generalization (We can store the child refence in parent type varible because achiving the generaltzation )
		d.makeSound();
		
		System.out.println("Class Cat --  Methods...");		
	}
}
