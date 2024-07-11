package com.hamitmizrak.oop;

import lombok.*;

import java.io.Serializable;

// LOMBOK
//@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentLombok  implements Serializable {

    public static final Long serialVersionUID =1L;

    // Variables
    private String name;
    private String surname;
    private int number;


    public static void main(String[] args) {
        // 1.Student
        StudentLombok student = StudentLombok.builder().name("adı").surname("soyadı").number(44).build();
        System.out.println(student);

        // 2.Student
        StudentLombok student2 = new StudentLombok();
        System.out.println(student2);

        // 3.Student
        StudentLombok student3 = new StudentLombok();
        System.out.println(student3);

    }
}

