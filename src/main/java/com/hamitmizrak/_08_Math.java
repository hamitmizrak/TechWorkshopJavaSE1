package com.hamitmizrak;

import java.util.Random;

public class _08_Math {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.min(2,900));
        System.out.println(Math.max(2,900));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-44));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.floor(7.9));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.round(2.4));
        System.out.println(Math.round(2.5));

        System.out.println("////////////////////////");
        System.out.println(Math.random()*3+1);
        System.out.println(Math.floor(Math.random()*10+1));

        System.out.println("////////////////////////////");
        Random rand = new Random();
        int rast= rand.nextInt(10)+1;
        System.out.println(rast);
    }
}
