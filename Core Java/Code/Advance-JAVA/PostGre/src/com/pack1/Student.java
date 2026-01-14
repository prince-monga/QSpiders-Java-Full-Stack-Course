package com.pack1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

public class Student {

	public static void main(String[] args) {
		//url:- jdbc:database_type://host:port/database_name
		String url="jdbc:postgresql://localhost:5432/student";
		//user
		String user="postgres";
		//password
		String password="root";
		
		try {
			//establish connection
			java.sql.Connection connection=DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			//create statement
			Statement statement=connection.createStatement();
			
			//excection 
			statement.execute("create table studentdetails(id INTEGER,name VARCHAR(50),marks int);");
			
			//close connection
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
