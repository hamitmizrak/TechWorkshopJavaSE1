package com.hamitmizrak;

public class _10_1_Conditional {

    public static void main(String[] args) {
        int age = 18;

        // 1.YOL
        if (age >= 18) {
            System.out.println("Yaşınız 18 veya 18'den büyüktür.");
        } else {
            System.out.println("Yaşınız 18'den küçüktür.");
        }

        // 2.YOL (Ternary)
        String result = (age >= 18)? "Yaşınız 18 veya 18'den büyüktür." : "Yaşınız 18'den küçüktür.";
        System.out.println(result);
        System.out.println(result.toUpperCase());

        // 3. YOL (Switch Case)
        switch (age) {
            case 18:
                System.out.println("Yaşınız 18 veya 18'den büyüktür.");
                break;
            default:
                System.out.println("Yaşınız 18'den küçük.");
                break;
        }
    }
}
