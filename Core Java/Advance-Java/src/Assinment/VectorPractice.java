package Assinment;
import java.util.Vector;
import java.util.Iterator;
public class VectorPractice {

	public static void main(String[] args) {
		Vector<String> v=new Vector();
		
		v.add("Prince");
		v.add("Riya");
		v.add("Nothing any");
		
		Iterator i=v.iterator();
		if(i.next()=="Nothing any") {
			String s="Riya only";
		}
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String a:v){
			System.out.println(a);
		}

	}

}
