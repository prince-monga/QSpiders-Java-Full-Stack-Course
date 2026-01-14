package com.task.course;

public class UpdateCourse1 {
 public static void main(String[] args) {
	
	 try {
		 //1. load drivers
		Class.forName("org.postgresql.Driver");
		
		//create connection 
		String url="JDBC://localhost:5432/student";
		
		
	 } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
 }
}
