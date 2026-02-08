package Collection;
import java.util.ArrayList;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		//create a array list
		ArrayList ls=new ArrayList();
		//1. Add element in array list --.char type
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		System.out.println(ls);
		
		//2. Check ArrayList empty or not
		System.out.println(ls.isEmpty());
		
		//3. Size of ArrayLsit 
		System.out.println(ls.size());
		
		//4.contains method --check the element present or not
		System.out.println(ls.contains('Z'));
		System.out.println(ls.contains('A'));
		
		//5. addAll methods
		ArrayList newls=new ArrayList();
		newls.add('R');
		newls.add('P');
		System.out.println(newls);
		newls.addAll(ls);  //add all elements of list
		System.out.println(newls);
		
		//6. get() - index through values
		System.out.println(newls.get(4)); //'C'
		
		//7. set() -set/replace the value specfic index --Not add it replace the element
		System.out.println(newls.set(1, 'X'));
		System.out.println(newls);
		
		//8. add(index, value) -add the value in specfic index and other values shift the next index
		newls.add(1, 'H');
		System.out.println(newls);
		
		//9. indexof() -check index of particular element
		System.out.println(newls.indexOf('C'));
		
		//10.remove
		newls.remove(2);
		System.out.println(newls);
	}

}
