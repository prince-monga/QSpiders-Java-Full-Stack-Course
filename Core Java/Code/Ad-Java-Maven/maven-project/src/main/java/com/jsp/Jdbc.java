package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
	   //JDBC 5 steps
		
		
		try {
			//1. load class
			Class.forName("org.postgresql.Driver");
			
			//2. Create Connection
			String url="jdbc:postgresql://localhost:5432/student";
		    String user= "postgres";
		    String password="root";
		    
		    Connection con=DriverManager.getConnection(url,user,password);
			
		    //3. create statement
		    Statement st=con.createStatement();		
		    
		    st.execute(
		    	    "INSERT INTO studentdata (id, name, marks) VALUES (1, 'Amit', 85)"
		    	);
		    System.out.println("Insert Sucessfully!");
		    //5. connection close
		    con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
