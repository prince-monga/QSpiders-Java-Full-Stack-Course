package Assinment;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(34);
		h.add(21);
		h.add(45);
		
		Iterator i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int a:h) {
			System.out.println(a);
		}
	}
	

}
