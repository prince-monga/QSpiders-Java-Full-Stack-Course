package Assinment;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(45);
		ls.add(10);
		ls.add(39);
		
		//
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(int a: ls) {
			System.out.println(a);
		}
		

	}

}
