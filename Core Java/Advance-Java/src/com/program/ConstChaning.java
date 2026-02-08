package com.program;

public class ConstChaning {
	
	ConstChaning(){
		System.out.println("HEy");
		
	}
	ConstChaning(int a){
		this();           
		System.out.println(a);
		
	}

	ConstChaning(double a,int b){
		this(b);
		System.out.println(a+b);
		
	}
	ConstChaning(double a,int b, float c){
		this(a,b);
		System.out.println(c+a+b);
		
	}
//	ConstChaning(double d,int e, float z){
//		this(d,e);
//		System.out.println(d+e+z);
//		
//	}
	
	
	
	public static void main(String[] args) {
		ConstChaning c=new ConstChaning(2,4,23.54f);
		
		
	}

}
