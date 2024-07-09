package com.hamitmizrak;

public class _11_Loop {

    public static void main(String[] args) {
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        // Toplama Etkisiz Eleman: 0
        // Çarpmada Etkisiz Eleman: 1

        // i++
        // i=i+1;
        // i+=1;

        // i++;
        // ++i;

        // FOR
        int forSum = 0; //initial
        for (int i = 1; i <= 10; i++) {
            forSum = forSum + i;
        }
        System.out.println("for toplam: " + forSum);
        // sonsuz döngü for(;;){}

        // WHILE
        int whileSum = 0; //initial
        int w = 1;
        while (w <= 10) {
            whileSum +=w;
            w++;
        }
        System.out.println("while toplam: " + whileSum);
        // sonsuz döngü while(true){}


        // DO-WHILE
        int dowhileSum = 0; //initial
        int d = 1;
        do{
            dowhileSum +=d;
            d++;
        } while (d <= 10);
        System.out.println("do-while toplam: " + dowhileSum);
        // sonsuz döngü while(true){}
    }
}
