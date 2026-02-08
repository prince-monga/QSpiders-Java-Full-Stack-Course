package Collection;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add(10);
		s.add(45);
		s.add(10);
		s.add(23);
		s.add(67);
		s.add(78);
		s.add(34);
		s.add(11);
		
		System.out.println(s);
		
		//Iterator using --travse the set
	
		Iterator i=s.iterator();		
		System.out.println(i.next()); //It give 1st eleemnt of the set (LinkedhashSet)--
		
		while(i.hasNext()) {
			System.out.println("- "+i.next());
		
		}
		
		//using foreach loop
		for(int a:s) {
			System.out.println(a);
		}
		
	}
//differnce bettween array and arryalist
//differnce array and collection
//differnce bettwen list and set
//diff arrya=list and linkedlist
//diff arraylist and vector
// diff stack and queue
// diff between hastset and linkedhash set
//diff between hashset and treeSet
	
}
