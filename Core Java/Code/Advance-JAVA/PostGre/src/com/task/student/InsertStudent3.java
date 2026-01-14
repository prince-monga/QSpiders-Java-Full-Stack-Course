package com.task.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent3 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO studentdata VALUES (3,'Neha',19)");
            System.out.println("scucessfully");
            con.close();
        } catch (Exception e) {
        	 System.out.println("fail");
            e.printStackTrace();
        }
    }
}
