package com.hamitmizrak;

public class _05_WrapperType {

    public static void main(String[] args) {
        // wrapper
        // OOP için çok daha uygundur.
        // null değer verebilirsiniz. => Integer data=null
        // Heap memory
        // Tamsayılar: Byte<Short<Integer<Long
        // Virgüllü  : Float<Double
        // Boolean: true/false
        // Character: '*'

        // Tamsayılar: Byte<Short<Integer<Long
        // byte (8-bit signed integer)
        Byte b = 127; // -128<byte<127
        System.out.println("Byte: " + b);

        // short (16-bit signed integer)
        Short s = 32767;
        System.out.println("Short: " + s);

        // int (32-bit signed integer)
        Integer i = 2147483647;
        System.out.println("Integer: " + i);

        // long (64-bit signed integer)
        Long l = 9223372036854775807L;
        System.out.println("Long: " + l);

        // Virgüllü  : float<double
        // float (32-bit floating-point number)
        Float f = 3.14f;
        System.out.println("Float: " + f);

        Double d2 = 3.14;
        System.out.println("Double: " + d2);

        // boolean (true/false)
        Boolean bool = true;
        System.out.println("Boolean: " + bool);

        // char (16-bit Unicode character)
        Character c = 'A';
        System.out.println("Character: " + c);

        // Boxing
        int primitiveType1=44;
        System.out.println("primitive: "+primitiveType1);
        Integer boxedType1=primitiveType1;
        //boxedType1=null;
        System.out.println("wrapper: "+boxedType1);

        // null new(instance) zero
        // new: Çocuk dünyaya geldi(instance)
        // null: Vefat
        // zero: Dünyada ancak bir değeri

        // UnBoxing
        Integer boxedType2=23;
        System.out.println("wrapper: "+boxedType2);
        int primitiveType2=boxedType2;
        System.out.println("primitive: "+primitiveType2);
    }
}
