package com.teiran.org.homework27062024;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number one");
        int numOne = scanner.nextInt();
        System.out.println("Input number two");
        int numTwo = scanner.nextInt();

        System.out.println("Sum : " + sumNumbers(numOne, numTwo));
        System.out.println("Difference : " + subtractNumbers(numOne, numTwo));
        System.out.println("Multiplication : " + multiplyNumbers(numOne, numTwo));

        if (numTwo == 0) {
            System.out.println("Cannot divide by zero, please input number > 0");
            numTwo = scanner.nextInt();
        }

        System.out.println("Dividing : " + divideNumbers(numOne, numTwo));


    }

    public static int sumNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subtractNumbers(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int multiplyNumbers(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int divideNumbers(int numOne, int numTwo) {
        return numOne / numTwo;
    }
}
