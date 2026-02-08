package Assinment;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l=new LinkedHashSet();
		l.add(120);
		l.add(34);
		l.add(637);
		l.add(45);
		
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int a:l) {
			System.out.println(a);
		}
	}

	}


