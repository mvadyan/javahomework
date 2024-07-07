package com.teiran.org.homework27062024;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println(returnUpperCaseReverseString("I learn Java"));
    }


    public static String returnUpperCaseReverseString (String str) {
       return reverseString(str.toUpperCase() );
    };

    private static String reverseString (String str) {
        String rightString;
        String leftString;

        int length = str.length();

        if (length <= 1) {
            return str;
        }

        leftString = str.substring(0, length / 2);
        rightString = str.substring(length / 2, length);

        return reverseString(rightString) + reverseString(leftString);
    }
}
