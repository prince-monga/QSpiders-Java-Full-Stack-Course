package com.program;

public class ReverseString {

	public static void main(String[] args) {
		
		String[] s= {"Hey Prince"};
		int i = 0;
		int j = s.length - 1;
		
		while(i < j) {
			
		    char temp = s[i];
		    s[i] = s[j];
		    s[j] = temp;
		    i++; j--;
		}

	}

}
