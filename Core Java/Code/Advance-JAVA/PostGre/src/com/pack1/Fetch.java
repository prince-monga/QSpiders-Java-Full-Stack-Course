package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			 // 2️ Create Connection
            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, user, password);
            
            Statement statement =connection.createStatement();
            
            ResultSet resultSet=statement.executeQuery("Select * from student");
            System.out.println(resultSet);
            while(resultSet.next()) {
            	System.out.print(resultSet.getInt("id")+" | ");
            	System.out.print(resultSet.getString(2)+" | ");
            	System.out.print(resultSet.getInt("marks")+" | ");
            	System.out.print(resultSet.getString(4)+" | "
            			);
            	System.out.println();          
            	}
            connection.close();
		} 	
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
