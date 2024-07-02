package com.teiran.org.homework21062024;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();

        System.out.println( divideNumber (number) );

    }

    public static String divideNumber (int number) {

        int hundreds =  number/100;

        int tens = (number - hundreds*100)/10;

        int ones = number - hundreds*100 - tens*10;

        return  "Число " + number +" -> "+ + hundreds + "," + tens+ "," +ones;
    }
}
