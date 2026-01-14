package com.task.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent1 {
    public static void main(String[] args) {
        try {
            // 1️ Load PostgreSQL Driver -Database driver is loaded
            Class.forName("org.postgresql.Driver");

            // 2️ Create Connection - java connects to database
            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            // 3️ Create Statement - Sql query is written
            Statement st = con.createStatement();

            // 4️ Execute SQL -query runs on database
            
            st.executeUpdate("INSERT INTO studentdata VALUES (1,'Aman',20)");
            System.out.println("scucessfully");
            
            // 5️ Close connection
            con.close();

        } catch (Exception e) {
        	System.out.println("fail");
            e.printStackTrace();
        }
    }
}
