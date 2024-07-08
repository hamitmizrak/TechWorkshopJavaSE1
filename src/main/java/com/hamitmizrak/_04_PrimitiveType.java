package com.hamitmizrak;

public class _04_PrimitiveType {

    public static void main(String[] args) {
        // primitive
        // null değer veremezsiniz. => int data=null;
        // Stack memory
        // Tamsayılar: byte<short<int<long
        // Virgüllü  : float<double
        // boolean: true/false
        // char: '*'

        // Tamsayılar: byte<short<int<long
        // byte (8-bit signed integer)
        byte b = 127; // -128<byte<127
        System.out.println("byte: " + b);

        // short (16-bit signed integer)
        short s = 32767;
        System.out.println("short: " + s);

        // int (32-bit signed integer)
        int i = 2147483647;
        System.out.println("int: " + i);

        // long (64-bit signed integer)
        long l = 9223372036854775807L;
        System.out.println("long: " + l);

        // Virgüllü  : float<double
        // float (32-bit floating-point number)
        float f = 3.14f;
        System.out.println("float: " + f);

        double d2 = 3.14;
        System.out.println("double: " + d2);

        // boolean (true/false)
        boolean bool = true;
        System.out.println("boolean: " + bool);

        // char (16-bit Unicode character)
        char c = 'A';
        System.out.println("char: " + c);
    }
}
