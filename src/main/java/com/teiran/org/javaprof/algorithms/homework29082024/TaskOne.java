package com.teiran.org.javaprof.algorithms.homework29082024;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число");
        int num = scanner.nextInt();

        isFullPowerOfNUmber(num, 2);
    }

    public static void isFullPowerOfNUmber(int num, int power) {
        int a = power;

        if (a > num) {
            System.out.println("NO");
            return;
        }

        a = a * 2;

        if (a == num) {
            System.out.println("YES");
            return;
        }

        isFullPowerOfNUmber(num, a);
    }
}
