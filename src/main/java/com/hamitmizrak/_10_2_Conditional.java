package com.hamitmizrak;
import java.util.Scanner;

public class _10_2_Conditional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age = Math.abs(scanner.nextInt());

        // 1.YOL
        if (age == 1) {
            System.out.println("Yaşınız 1");
        } else if (age == 2) {
            System.out.println("Yaşınız 2.");
        } else if (age == 3) {
            System.out.println("Yaşınız 3");
        } else if (age == 4) {
            System.out.println("Yaşınız 4");
        } else if (age == 5) {
            System.out.println("Yaşınız 5");
        } else if (age == 6) {
            System.out.println("Yaşınız 6");
        } else {
            System.out.println("Yaşınız büyük ihtimalle 6 büyüktür.");
        }

        //2.YOL
        switch (age) {
            case 5:
                System.out.println("Yaşınız 5");
                break;
            case 1:
                System.out.println("Yaşınız 1");
                break;
            case 2:
                System.out.println("Yaşınız 2");
                break;
            case 3:
                System.out.println("Yaşınız 3");
                break;
            case 4:
                System.out.println("Yaşınız 4");
                break;
            case 6:
                System.out.println("Yaşınız 6");
                break;
            default:
                System.out.println("Yaşınız büyük ihtimalle 6 büyüktür.");
                break;

        }

    }
}
