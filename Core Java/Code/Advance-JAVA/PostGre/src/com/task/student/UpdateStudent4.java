package com.task.student
;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent4 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();
            st.executeUpdate("UPDATE studentdata SET name='Pooja Singh' WHERE id=4");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
