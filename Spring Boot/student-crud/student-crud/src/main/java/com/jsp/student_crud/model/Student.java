package com.jsp.student_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
    @Id
    private int rol;
    private String name;
    private long phone;
    private  String email;
}
