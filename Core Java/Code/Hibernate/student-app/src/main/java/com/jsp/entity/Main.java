package com.jsp.entity;

import com.jsp.exception.StudentNotFoundException;

public class Main {

	public static void main(String[] args) {
		StudentDao dao= new StudentDao();
		
		Student student=new Student(12,"Prince","pri@gmail.com",78992733l,"pri343","Gurugram");
		try {
			dao.save(student);
		} catch (StudentNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
