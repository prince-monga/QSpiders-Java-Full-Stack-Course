package com.program;

import java.util.HashMap;

public class FreqHash {

	public static void main(String[] args) {
		String s="hello world";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
