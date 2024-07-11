package com.hamitmizrak.oop.interfacex;

public class Database implements ICrud {

    // interface
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void find() {
        System.out.println("find");
    }

    @Override
    public void list() {
        System.out.println("list");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    public static void main(String[] args) {
        Database database=new Database();
        database.create();
        database.find();
        database.list();
        database.update();
    }
}
