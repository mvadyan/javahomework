package com.teiran.org.homework04072024;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        int[] ints = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        ints[0] = scanner.nextInt();

        System.out.println("Input secont number");
        ints[1] = scanner.nextInt();

        System.out.println("Input third number");
        ints[2] = scanner.nextInt();


        System.out.println("Max number is " + printMaxNumber(ints));
    }


    public static int printMaxNumber(int[] ints) {

        int temp = 0;
        for (int i = 0; i < ints.length; i++) {

            if (ints[i] > temp) {
                temp = ints[i];
            }
        }
        return temp;
    }


}
