package Assinment;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent{

	public static void main(String[] args) {
	ArrayList<Student> ls=new ArrayList<Student>();
	Student s1=new Student(109,"Prince","Sirsa",5622.24);
	Student s2=new Student(321,"Harsh","Delhi",7372.24);
	Student s3=new Student(102,"Ajay","gurugram",6622.24);
	Student s4=new Student(104,"Arun","Noida",2622.24);
	Student s5=new Student(169,"Riya","Sirsa",5622.24);

	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
	ls.add(s4);
	ls.add(s5);
	
	System.out.println(ls);
	
	//Collections.sort(ls,n);
	//System.out.println(ls);
//	NameDscStudent n=new NameDscStudent();
//	Collections.sort(ls,n);
//	System.out.println(ls);
//	NameDscStudent n = new NameDscStudent();
	//Collections.sort(ls, n);
	//System.out.println(ls);
	
	Collections.sort(ls, (n1, n2) -> n1.name.compareTo(n2.name));

	System.out.println(ls);
	
	}


}
