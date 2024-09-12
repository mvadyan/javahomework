package com.teiran.org.javaprof.algorithms.homework29082024;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число");
        int num = scanner.nextInt();

        int res = sumDigitsOfNUmber(num);

        System.out.println("sum digits of number is " + res);
    }

    public static int sumDigitsOfNUmber(int num) {
        if (num%10 == 0 && num < 10) {
            return 0;
        }

        return num%10 + sumDigitsOfNUmber(num/10);
    }
}
