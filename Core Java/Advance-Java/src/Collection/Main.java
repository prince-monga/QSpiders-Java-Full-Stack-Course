package Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		Emp e1=new Emp(101,"Prince",6700,"Dev");
		Emp e2=new Emp(102,"Arun",4700,"WebDev");
		Emp e3=new Emp(78,"Sinesh",6900,"TL");
		Emp e4=new Emp(673,"Qwer",738,"Dev");
		Emp e5=new Emp(109,"Aj",3400,"Dev");
		 al.add(e1);
		 al.add(e2);
		 al.add(e3);
		 al.add(e4);
		 al.add(e5);
		 
		System.out.println(al);
		
		// Ascending Name
		System.out.println("Ascending name");
		
		SortByNameAsc s1 = new SortByNameAsc();
		
		Collections.sort(al, s1);
		
		System.out.println(al);
//
//		// Descending Name
//		System.out.println("Descending name");
//		SortByNameDsc s2 = new SortByNameDsc();
//		Collections.sort(al, s2);
//		System.out.println(al);
//		/
		
		Comparator<Emp> sortBysalAsc= (x,s)-> x.salary.compareTo(s.salary);
		System.out.println(sortBysalAsc);
		System.out.println(al);
		
//		ArrayList<Person> ls=new ArrayList<Person>();
//		Person p1=new Person("Prince",21,972838l,"Gurugram");	
//		Person p2=new Person("Ajay",25,9728338l,"banglor");	
//		Person p3=new Person("Sinesh",20,97298l,"Delhi");	
//		Person p4=new Person("Mukesh",16,872838l,"Noida");	
//		ls.add(p1);
//		ls.add(p2);
//		ls.add(p3);
//		ls.add(p4);
//		
//	
//		System.out.println(ls);
//		Collections.sort(ls);
//		System.out.println(ls);
	
	}

}
