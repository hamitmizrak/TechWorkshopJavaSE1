package com.hamitmizrak.collectionx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataList {

    public static void main(String[] args) {
        // LinkedList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

       /* list.remove(0);
        System.out.println(list);

        list.set(0, "Grape");
        System.out.println(list);*/

        System.out.println("var mı?"+list.contains("Apple"));

        System.out.println("soldan arama "+list.indexOf("Apple"));

        System.out.println("sağdan arama "+list.lastIndexOf("Apple"));

        // Küçükten büyüğe doğru sıralama yapılacak
        Collections.sort(list);
        System.out.println(list);

        // Karma olarak
        Collections.shuffle(list);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }

}
