package com.task.course;
import java.sql.*;
public class InsertCourse3 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/student","postgres","root");
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO course VALUES (3,'DBMS',4)");
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}

