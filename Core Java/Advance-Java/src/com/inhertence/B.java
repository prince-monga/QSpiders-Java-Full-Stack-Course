package com.inhertence;

public class B  implements A{
	public void m1() {
		System.out.println("Hey,Implemention");
	}

	public static void main(String[] args) {
		B obj=new B();
		obj.m1();

	}

}
