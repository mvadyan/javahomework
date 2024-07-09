package com.teiran.org.homework02072024;

import java.util.Scanner;

import static java.lang.Math.abs;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        double m = scanner.nextDouble();

        System.out.println("Input Second number");
        double n = scanner.nextDouble();

        System.out.println(findNearestNumberToTEn(m,n) + " nearest to 10");

    }

    public static double findNearestNumberToTEn(double m, double n) {

        if (abs(10 - m) > abs(10 - n)) {
            return n;
        }

        if (abs(10 - m) < abs(10 - n)) {
            return m;
        } else {
            return n;
        }
    }


}
