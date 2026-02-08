package Collection;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListPractice {

	public static void main(String[] args) {
		//create a LinkedList
		LinkedList ls=new LinkedList();
		//Add elements in LinkedList--- 
		ls.add(10);
		ls.add(40);
		ls.add(20);
		ls.add(30);
		
		System.out.println(ls);
		
		//---Important
		System.out.println(ls.indexOf(20)); 
		//---It store only [previous Node refer],[Data(Element)],[next node refer]
		
		
		//Remove
		ls.remove(2);
		System.out.println(ls);
		
		ls.add(60);
		ls.add(70);
		
		
		System.out.println(ls.get(2));
		ls.set(1,78);
		System.out.println(ls);
		
		//--Methods--
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println(ls);
		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
		
		ls.addLast(45);
		System.out.println(ls);
	}
	

}
