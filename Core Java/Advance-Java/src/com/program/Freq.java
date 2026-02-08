package com.program;

public class Freq {

	public static void main(String[] args) {
		 String s="Java is programming";
		 int[] a=new int[256]; 
		 
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 a[c]++;
		 }
		 for(int j=0;j<a.length;j++) {
			 
			 if(a[j]==1) {
				 System.out.println((char) j );
			 }
//			 if(a[j]>0) {
//				 
////				 System.out.print((char) j +":");
////				 System.out.println(a[j]);
//			 }
		 }

	}

}
