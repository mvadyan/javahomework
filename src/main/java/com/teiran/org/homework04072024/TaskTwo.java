package com.teiran.org.homework04072024;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any year");
        int year = scanner.nextInt();

        System.out.println(year + " year " + (isLeap(year)? "is leap" : "is not leap"));
    }

    public static boolean isLeap (int Year) {
        return (Year % 4 == 0 && (Year % 400 == 0 || Year % 100 != 0) );
    }
}
