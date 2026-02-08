package Collection;
import java.util.LinkedList;

public class Q2LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList();
		
//		l.add("Prince");
		l.add(23);
		l.add(43);
		l.add(23);
		l.add(53);
//		l.add(false);
//		l.add(4.7);
//		l.add(null);
//		l.add(false);
		System.out.println(l);
		
		for(Integer x:l) {
			System.out.println(x);
		}

	}

}
