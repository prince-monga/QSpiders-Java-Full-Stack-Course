package Collection;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack s=new Stack();
		//Add the element using push() method--it add the element top of the stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println("pop(Remove) top element: "+ s.pop()); //It is use for remove the element from top of the stack
		
		System.out.println(s);
		
		System.out.println("check top element:"+s.peek()); //it is use for retrieve the top of the element in stack
		
		System.out.println(s.size());
	}
 
}
