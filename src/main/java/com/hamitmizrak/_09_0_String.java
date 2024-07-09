package com.hamitmizrak;

public class _09_0_String {

    public static void main(String[] args) {
        String value="java ÖĞReniyoRUM java ";
        System.out.println(value);

        System.out.println(value.length());
        System.out.println(value.trim().length());

        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());

        System.out.println(value.concat("-son"));

        System.out.println(value.startsWith("java"));
        System.out.println(value.endsWith(" "));

        System.out.println(value.indexOf("java"));
        System.out.println(value.lastIndexOf("java"));

        System.out.println(value.charAt(0));
        System.out.println(value.replace(value,"java ÖĞReniyoRUM javaee"));

        System.out.println(value.substring(0,4)); // 0<=DATA<=4-1
        System.out.println(value.substring(4)); //

        System.out.println(value.isEmpty());
        System.out.println(value.contains("ÖĞReniyoRUM"));
        System.out.println(value.equals("java ÖĞReniyoRUM java "));

        // CAST
        float f1=14.53f;
        long l1=151551515151L;

        // String'ten Tam sayıya çevir
        String number1="44";
        int toChange=Integer.valueOf(number1);
        System.out.println(number1+16);
        System.out.println(toChange+16);

        // Tam sayıyadan String'e çevir
        int number2=50;
        String toChange2=String.valueOf(number2);
        System.out.println(number2+20);
        System.out.println(toChange2+20);

    }
}
