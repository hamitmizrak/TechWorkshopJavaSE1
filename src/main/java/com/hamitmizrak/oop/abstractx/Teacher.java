package com.hamitmizrak.oop.abstractx;

public class Teacher  extends Person {

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    @Override
    public void govdeliMethod(String data) {
        super.govdeliMethod(data);
    }


    @Override
    public void govdesizMethod() {
        System.out.println("Teacher Gövdesiz method");
    }
}