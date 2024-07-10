package com.hamitmizrak;

public class _13_Array {

    public static void main(String[] args) {
        try{
            // 5 elemanlı bir dizi oluştur
            // 0 başlar saymaya
            int[] numbers = new int[6];
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            numbers[3] = 40;
            numbers[4] = 50;
            numbers[5] = 60;

            // dizi elemanları yazdırma
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]+" ");
            }

            System.out.println("");
            /////////////////////////////////////////////
            // forEach element
            for (int number : numbers) {
                System.out.print(number+" ");
            }
            System.out.println("");
            System.out.println(numbers[0]);

            System.out.println(numbers[5-1]);
            System.out.println(numbers[numbers.length-1]);
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("son satır");


        int[][] matrix = new int[3][3];
        matrix[0][0] =1;
        matrix[0][1] =2;
        matrix[0][2] =3;
        matrix[1][0] =4;
        matrix[1][1] =5;
        matrix[1][2] =6;
        matrix[2][0] =7;
        matrix[2][1] =8;
        matrix[2][2] =9;
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int j = 0; j < matrix[i].length; j++) { //sutun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
