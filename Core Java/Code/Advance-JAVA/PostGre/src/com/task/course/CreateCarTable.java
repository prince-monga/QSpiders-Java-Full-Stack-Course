package com.task.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCarTable {

	public static void main(String[] args) {
		
		try {
			//1..Load the drivers
			Class.forName("org.postgresql.Driver");
			
			//2..Create connection Using getConnetion funtion 
			String url="jdbc:postgresql://localhost:5432/student";
			String user="postgres";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,user,password);
			
			//3..Create statement for perform query
			Statement st=con.createStatement();
			
			//4. Execute Query
			st.execute("CREATE TABLE S1(car_name VARCHAR(50),car_model VARCHAR(50)");
			System.out.println("Table create successfully!");
			//5. CLOSE connection
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

}
