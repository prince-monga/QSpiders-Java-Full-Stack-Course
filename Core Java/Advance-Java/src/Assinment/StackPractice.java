package Assinment;
import java.util.Iterator;
import java.util.Stack;
public class StackPractice {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack();
		s.push(20);
		s.push(45);
		s.push(56);
		s.push(67);
		s.push(45);
		System.out.println(s);
		System.out.println("Iterator");
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("For Loop");
		for(int a:s) {
			System.out.println(a);
		}
		
	}
	

}
