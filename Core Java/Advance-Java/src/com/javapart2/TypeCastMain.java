package com.javapart2;

public class TypeCastMain {

	public static void main(String[] args) {
		//create object Class A
		
		A a1=new A();
		System.out.println(a1.a);  //10
		System.out.println(a1.b);  //20
		a1.m1();    //class A
		
		////Create object Class B
		B b1=new B();
		System.out.println(b1.a);  //10
		System.out.println(b1.b);  //20
		System.out.println(b1.c);  //30
		System.out.println(b1.d);  //40
		b1.m1();   //Class B
		
		
		System.out.println("Upcasting");
		//Upcasting ----Child property can not acces by Parent class only Override value access
		A a2=new B();   //Up casting B class object create and store in A (Parent) type varible
		System.out.println(a2.a);  //10
		System.out.println(a2.b);  //20
		//System.out.println(b1.c);  //error
		//System.out.println(b1.d);  //error
		b1.m1();   //Class B
		
		
		//Downcasting 
		
		A a=new B();
		
		B b=(B)a;
		System.out.println(b.a);  //10
		System.out.println(b.b);  //20
		System.out.println(b.c);  //30
		System.out.println(b.d);  //40
		b.m1();   //Class B
		
		
		
	}

}

class A{
	int a=10;
	int b=20;
	void m1() {
		System.out.println("Class A");
	}
}


class B extends A{
	int c=30;
	int d=40;
	void m1() {
		System.out.println("Class B");
	}
}


class C extends A{
	int e=50;
	int f=60;
	void m1() {
		System.out.println("Class C");
	}
}