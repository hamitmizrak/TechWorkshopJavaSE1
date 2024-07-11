package com.hamitmizrak.oop;

import java.io.Serializable;

// POJO: Variable+gettersetter
public class Student implements Serializable {

    public static final Long serialVersionUID =1L;

    // Variables
    private String name;
    private String surname;
    private int number;

    // Constructor (Parametresiz)
    public Student(){
        this.name = "Adınızı girmediniz";
        this.surname = "Soyadınızı girmediniz";
        this.number = 0;
    }

    public Student(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    // @toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        // 1.Student
        Student student = new Student();
        student.setName("Hamit");
        student.setSurname("Mizrak");
        student.setNumber(1);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Surname: " + student.getSurname());
        System.out.println("Student Number: " + student.getNumber());
        System.out.println("");

        // 2.Student
        Student student2 = new Student();
        student2.setSurname("Mizrak");

        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Surname: " + student2.getSurname());
        System.out.println("Student Number: " + student2.getNumber());
        System.out.println("");

        // 3.Student
        Student student3 = new Student("Hamit","Mizrak",3);

        System.out.println("Student Name: " + student3.getName());
        System.out.println("Student Surname: " + student3.getSurname());
        System.out.println("Student Number: " + student3.getNumber());
        System.out.println("");
    }
}

