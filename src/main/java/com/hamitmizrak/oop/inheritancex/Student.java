package com.hamitmizrak.oop.inheritancex;


public class Student extends Person{

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }

    @Override
    public void govdeliMethod(String data) {
        super.govdeliMethod(data);
    }
}
