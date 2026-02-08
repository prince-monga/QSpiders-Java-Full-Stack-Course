package Collection;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayListCollections {

	public static void main(String[] args) {
	//Genrics-
	//We can make heterogeneous type ArrayList,it means we can store similar type of data value can store.
	ArrayList<Integer> ls=new ArrayList<Integer>();
	ls.add(50);
	ls.add(20);
	ls.add(10);
	ls.add(40);
	System.out.println(ls);
	
	Collections.sort(ls); //It is use for sort the ArrayList Elements.
	System.out.println(ls);
	Collections.reverse(ls);
	System.out.println(ls);  //It is use for reverse the ArrayList Elements.
	}

}
