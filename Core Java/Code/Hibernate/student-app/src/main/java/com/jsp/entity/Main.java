package com.jsp.entity;

import com.jsp.exception.StudentNotFoundException;

public class Main {

	public static void main(String[] args) {
		StudentDao dao= new StudentDao();
		
//		Student student=new Student(12,"Prince","pri@gmail.com",78992733l,"pri343","Gurugram");
//		Student student2=new Student(15,"Karan","karan@gmail.com",988792733l,"k546","Sirsa");
//		Student student3=new Student(07,"Sinesh","Sin@gmail.com",8756274555l,"sin4765","Delhi");
//		Student student4=new Student(34,"Himanshu","Him@gmail.com",9748374783l,"him3464","Jaipu");
//	try {
//			dao.save(student3);
//			dao.save(student2);
//			dao.save(student4);
//		} catch (StudentNotFoundException e) {
//		e.printStackTrace();
//	}
		
	dao.findAll(); 
	dao.findParticulare();
		
	}
	

}
 