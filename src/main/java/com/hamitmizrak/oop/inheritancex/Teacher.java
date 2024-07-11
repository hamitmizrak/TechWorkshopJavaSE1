package com.hamitmizrak.oop.inheritancex;

public class Teacher  extends Person{

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    @Override
    public void govdeliMethod(String data) {
        super.govdeliMethod(data);
    }
}