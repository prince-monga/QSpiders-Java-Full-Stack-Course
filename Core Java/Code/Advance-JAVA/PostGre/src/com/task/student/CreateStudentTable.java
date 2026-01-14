package com.task.student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.task.DbConnection;

public class CreateStudentTable {

	public static void main(String[] args) {
		 try {
			// 1️ Load PostgreSQL Driver
 		 	
			Class.forName("org.postgresql.Driver");
			
			 Connection con = DbConnection.getConnection();
	            
	            Statement st = con.createStatement();

	            st.executeUpdate("CREATE TABLE studentdata(id INT, name VARCHAR(50), marks INT)");

	            System.out.println("Student Table Created");

	            con.close();
	        } catch (SQLException e) {
	            System.out.println("Table Creation Failed");
	            e.printStackTrace();
	        }
		 catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}                                                                                                                                                                                                                                                                         
	}
}
