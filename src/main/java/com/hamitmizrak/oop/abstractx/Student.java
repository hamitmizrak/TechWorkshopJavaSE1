package com.hamitmizrak.oop.abstractx;


public class Student extends Person {

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }

    @Override
    public void govdeliMethod(String data) {
        super.govdeliMethod(data);
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Student Gövdesiz method");
    }
}
