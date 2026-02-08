package Assinment;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(45);
		ls.add(10);
		ls.add(39);
		
		System.out.println(ls);
		
		Iterator i=ls.iterator();
		
			
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//using For loop
		for(int a : ls) {
			System.out.println(a);
		}
		

	}

}

