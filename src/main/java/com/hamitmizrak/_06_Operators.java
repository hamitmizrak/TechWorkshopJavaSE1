package com.hamitmizrak;

public class _06_Operators {
    public static void main(String[] args) {
        // + - * / %
        // &&=VE  ||=VEYA
        // !=Değil

        int number1=15,number2=2;
        System.out.println("1.sayı: " + number1+"\n2.sayı: " + number2+"\n");

        int sum=(number1+number2);
        System.out.println("Toplama: "+sum);

        int min=(number1-number2);
        System.out.println("Çıkarma: "+min);

        int mul=(number1*number2);
        System.out.println("Çarpma: "+mul);

        int div=(number1/number2);
        System.out.println("Bölme: "+div);

        int mod=(number1%number2);
        System.out.println("Kalan: "+mod);
    }
}
