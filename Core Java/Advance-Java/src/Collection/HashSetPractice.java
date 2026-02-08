package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;


public class HashSetPractice {

	public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(5);
	hs.add(10); //Duplicate not allowed, it add only one time "10"-Multiple 10 not allowed
	hs.add(37);
	hs.add(23);
	hs.add(10);
	System.out.println(hs);
	hs.add(5);
	System.out.println(hs);
	
	//Remove element in a set using remove([element]) --method
	hs.remove(20);
	System.out.println(hs);
	
	//Size of set means how many element are present
	System.out.println(hs.size());
	
	//Contains -it checks the value present or not
	System.out.println(hs.contains(23));
	
	//isEmpty- use for check empty or not
	System.out.println(hs.isEmpty());
	
	System.out.println(hs.iterator().next() +" --"); //Only 1st element element
	
	System.out.println("Travsing the elements  in set Using Iterator");
	Iterator i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
//using foreach loop
	System.out.println("Using Foreach loop");
	for(int a:hs) {
		System.out.println(a+"-");
	}
	//linkedlist,vector,arryalist --- foreach and Iterator use
	ArrayList al=new ArrayList(hs);
	
	System.out.println(al.get(1));
	

	
	//
	
	}

}
