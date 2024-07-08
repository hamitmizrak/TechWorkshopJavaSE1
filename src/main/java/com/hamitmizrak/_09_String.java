package com.hamitmizrak;

public class _09_String {

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
        System.out.println(value.contains("ÖĞReniyoRUM"));
        System.out.println(value.indexOf("java"));
        System.out.println(value.lastIndexOf("java"));
    }
}
