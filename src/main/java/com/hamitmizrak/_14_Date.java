package com.hamitmizrak;

public class _14_Date {

    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("1. "+date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getMonth()); //aylar sıfırdan başlar saymaya
        System.out.println(date.getYear()); // 1900 + -
        System.out.println(date.getYear()+1900); // 1900 + -

        date.setYear(120); // 1900 + -
        System.out.println(date.getYear()+1900); // 1900 + -


        System.out.println("**********************************");
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println("2. "+sqlDate);

        java.time.LocalDate localDate = java.time.LocalDate.now();
        System.out.println("3. "+localDate);

        java.time.LocalTime localTime = java.time.LocalTime.now();
        System.out.println("4. "+localTime);

        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
        System.out.println("5. "+localDateTime);

        java.time.ZonedDateTime zonedDateTime = java.time.ZonedDateTime.now();
        System.out.println("6. "+zonedDateTime);
    }
}
