package Collection;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//1. Create ArrayList Object
		ArrayList a=new ArrayList();
		
		//2. Add Elements in ArrayList
		a.add("hey");
		a.add("Prince");
		a.add(5.5);
		a.add(true);
		a.add(23);
		a.add(23);
		a.add(null);
		
		System.out.println(a);
		
		//Check Size
		System.out.println(a.size());  //7
		//Check empty or not
		System.out.println(a.isEmpty());
		
		for(Object x:a) {
			System.out.println(x+" ");
		}
		
		
		//1. Array list <Interger> it store only integer values
		ArrayList<Integer> aInt=new ArrayList();
		//2. Add Elements in ArrayList
				aInt.add(45);
				aInt.add(67);
				aInt.add(34);
				aInt.add(23);
				aInt.add(null);
		System.out.println(aInt);
		
		//2. Array list <Float> it store only Float values
		ArrayList<Float> af=new ArrayList();
		// Add Elements in ArrayList
				af.add(45.4f);
				af.add(67.3f);
				af.add(34.2f);
				af.add(23.45f);
				af.add(null);
		System.out.println(af);
				


	}

}
