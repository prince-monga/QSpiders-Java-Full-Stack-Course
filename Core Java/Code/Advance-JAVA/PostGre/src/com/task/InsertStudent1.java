package com.task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent1 {
	 public static void main(String[] args) throws Exception {
		 try {
	        Connection con = DbConnection.getConnection();
	        Statement st = con.createStatement();

	        st.executeUpdate("INSERT INTO studentdata VALUES(1,'Prince',85)");

	        System.out.println("1 Record Inserted");
	        con.close();
		 }
	        catch (SQLException e) {
	            System.out.println("Insert Failed");
	            e.printStackTrace();
	        }
	    }
}
