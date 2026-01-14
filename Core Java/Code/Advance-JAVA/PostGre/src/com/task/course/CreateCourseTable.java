package com.task.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCourseTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student",
                "postgres",
                "root"
            );

            Statement st = con.createStatement();

            st.execute(
                "CREATE TABLE course(" +
                "course_id INT PRIMARY KEY, " +
                "course_name VARCHAR(40), " +
                "duration_months INT)"
            );

            System.out.println("Course table created");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

