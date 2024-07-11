package com.hamitmizrak.collectionx;

import java.util.*;

public class DataSet {

    public static void main(String[] args) {
        // HashSet
        Set<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        //System.out.println(list);
        //System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        list.forEach(System.out::println);

    }

}
