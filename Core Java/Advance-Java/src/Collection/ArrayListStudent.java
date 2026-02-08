package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListStudent {

	public static void main(String[] args) {
		//create student obj
		ArrayList student=new ArrayList();
		//add student values
		student.add("prince");
		student.add(21);
		student.add("Java Full-Stack Course");
		student.add("Sirsa");
		
		System.out.println(student);
		
		//size
		System.out.println(student.size());
		
		//check empty
		System.out.println(student.isEmpty());
		
		//check contain 
		System.out.println(student.contains("prince"));
		
		//indexof()
		System.out.println(student.indexOf("Sirsa"));
		
		//get()
		System.out.println(student.get(2));
		
		//set()
		student.set(1,25);
		System.out.println(student);
		
		//add
		student.set(1,"passing year 2022");
		System.out.println(student);
		
		//remove
		student.remove(3);
		System.out.println(student);
		//addAll
		ArrayList FullDetailsStudent=new ArrayList();
		FullDetailsStudent.add("Total Marks: 500");
		FullDetailsStudent.add("Obtain Marks: 450");
		FullDetailsStudent.addAll(student);
		
		System.out.println(FullDetailsStudent);
		
		
		
		
	}

}
