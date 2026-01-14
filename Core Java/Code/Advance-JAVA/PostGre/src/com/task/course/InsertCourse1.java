package com.task.course;
import java.sql.*;

public class InsertCourse1 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/student";
            Connection con=DriverManager.getConnection(url,"postgres","root");
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO course VALUES (1,'Java',6)");
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
