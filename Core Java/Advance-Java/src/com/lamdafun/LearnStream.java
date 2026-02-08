package com.lamdafun;

import java.util.ArrayList;

public class LearnStream {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList();
		ls.add(45);
		ls.add(34);
		ls.add(15);
		ls.add(94);
		ls.add(49);
		ls.add(64);
		System.out.println(ls);   
		ls.stream().forEach((x)->System.out.println(x));
		
		
		ArrayList<String> ls2=new ArrayList();
		ls2.add("Prince");
		ls2.add("aJay");
		ls2.add("SINESH");
		System.out.println(ls2); 
		//ls2.stream().forEach(ls)-> System.out.println(y.toUpperCase());
		ls2.stream().forEach(y -> System.out.println(y.toUpperCase()));
		ls2.stream().forEach(y -> System.out.println(y.toLowerCase()));
		ls2.stream().forEach(y->System.out.println(y.length()));
	}
}
