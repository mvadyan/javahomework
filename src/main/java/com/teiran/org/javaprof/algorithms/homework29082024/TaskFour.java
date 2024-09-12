package com.teiran.org.javaprof.algorithms.homework29082024;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string:");
        String str = scanner.next();

        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome ? " It is Palindrome" : " It isn't Palindrome ");
    }

    public static boolean isPalindrome(String str) {

        String string = str.toLowerCase();

        if (string.length() == 1) {
            return true;
        }

        Character firstChar = string.charAt(0);
        Character lastChar = string.charAt(str.length() - 1);

        if (!(firstChar.equals(lastChar))) {
            return false;
        } else {

            string = string.substring(1, string.length() - 1);
            isPalindrome(string);
        }

        return true;
    }
}
