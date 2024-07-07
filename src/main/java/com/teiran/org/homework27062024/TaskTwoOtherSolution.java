package com.teiran.org.homework27062024;

public class TaskTwoOtherSolution {

    public static void main(String[] args) {
        System.out.println(returnUpperCaseReverseString("I learn Java"));
    }


    public static String returnUpperCaseReverseString (String str) {
        return reverseString(str.toUpperCase() );
    };

    private static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
