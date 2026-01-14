package com.task;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	 public static Connection getConnection() {

	        Connection con = null;

	        try {
	            String url = "jdbc:postgresql://localhost:5432/student";
	            String user = "postgres";
	            String password = "root";

	            con = DriverManager.getConnection(url, user, password);
	        } catch (SQLException e) {
	            System.out.println("Connection Failed");
	            e.printStackTrace();
	        }

	        return con;
	    }
}
