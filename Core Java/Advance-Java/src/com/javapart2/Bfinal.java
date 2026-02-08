package com.javapart2;

public class Bfinal /* extends Afinal */ {   //we can't inherit final class
	public void m1() {
		System.out.println("B");	
		}
	int a=10;
	int c=20;

	public static void main(String[] args) {
		final Bfinal b=new Bfinal();
		System.out.println(b.a);
		System.out.println(b.c);
		b.a=30;
		b.c=40;
		System.out.println(b.a);
		System.out.println(b.c);
	
		Afinal a1=new Afinal();
		System.out.println(a1.num);
		System.out.println(a1.s);
		
//final class --it can't inheritance
//String is the final class
		
		//final method-we can't modify or override.
}
}