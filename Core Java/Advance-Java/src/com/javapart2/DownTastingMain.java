package com.javapart2;

interface Fruits{
	void printName();
	}

class Apple implements Fruits{
	int price=10;
	public void printName() {
		System.out.println("Apple");
		
	}
}
class Mango implements Fruits{
	int price=30;
	public void printName() {
		System.out.println("Mango");
		
	}
}
class Orange implements Fruits{
	int price=40;
	public void printName() {
		System.out.println("Orange");
		
	}
}
public class DownTastingMain {

	public static void main(String[] args) {
		Fruits f=new Mango();
		f.printName();
		//System.out.println(f.price); //error beacuse it can not define in interface
		
		//Downcasting
		if (f instanceof Orange ) { 
			Orange o =(Orange)f;
			System.out.println(o.price);
		}
		if (f instanceof Mango ) {
			Mango m =(Mango)f;
			System.out.println(m.price);
		}
		if (f instanceof Apple ) {
			Apple  a =(Apple )f;
			System.out.println(a.price);
		}
		
	}

}
