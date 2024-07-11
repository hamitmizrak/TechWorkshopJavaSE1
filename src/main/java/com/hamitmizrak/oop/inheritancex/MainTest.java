package com.hamitmizrak.oop.inheritancex;

public class MainTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("person adı-1");
        person.setSurname("person soyadı-1");
        System.out.println(person);
        person.govdeliMethod("person 44");
        System.out.println("***********");

        Student student = new Student();
        student.setName("Öğrenci adı-1");
        student.setSurname("Öğrenci soyadı-1");
        System.out.println(student);
        student.govdeliMethod("person 44");
        System.out.println("***********");

        Teacher teacher = new Teacher();
        teacher.setName("Teacher adı-1");
        teacher.setSurname("Teacher soyadı-1");
        System.out.println(teacher);
        teacher.govdeliMethod("teacher 44");
    }
}
