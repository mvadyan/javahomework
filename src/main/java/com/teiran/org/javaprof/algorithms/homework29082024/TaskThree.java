package com.teiran.org.javaprof.algorithms.homework29082024;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");

        int num = scanner.nextInt();

        System.out.println("Numbers of Fibonacci till " + num + " value are: ");
        printFibonacci(num, 0);
    }

    public static int getFibonacci(int num) {

        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        return getFibonacci(num - 1) + getFibonacci(num - 2);

    }

    public static void printFibonacci(int num, int start) {

        if (num < start) {
            return;
        }
        System.out.print(getFibonacci(start) + ", ");
        printFibonacci(num, start + 1);

    }
}





