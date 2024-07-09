package com.hamitmizrak;

enum ETicaret{
    SMALL, MEDIUM,LARGE, XLARGE
}



// PSVM
public class _12_Enum {
    public static void main(String[] args) {
        ETicaret eticaret = ETicaret.SMALL;
        System.out.println(eticaret);
        System.out.println(eticaret.hashCode());
        System.out.println(eticaret.ordinal());
        // String'e çevir
        String etic = ETicaret.XLARGE.toString();
        System.out.println(etic);
    }
}
