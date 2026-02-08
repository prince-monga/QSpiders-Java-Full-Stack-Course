package com.javapart2;

final class Afinal {
	String s="Prince"; //String is final class
	final int num=45;

	
	final void m1() {
		System.out.println("Final method ");
	}
	
//	void m1() {
//		System.out.println("Final method it can't override"); //overridde
	
//	}
	
	public static void main(String[] args) {
		final Afinal a=new Afinal();
		a.m1();
//		num=34; //we can't re-initialize
		a.s="Arora"; 
		
		System.out.println(a.num);
		System.out.println(a.s);
		
		
	}

}
