package com.teiran.org.homework01082024;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        String str = "I like Java";

          String reverseString = printReverseStringFromArray(splitString(str, ' '));
          System.out.println(reverseString);
    }

    public static String[] splitString(String str, char pattern) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        if (sb.charAt(sb.length() - 1) != pattern) {
            sb.append(pattern);
        }

        int index = sb.length();

        char[] chars = new char[index];
        sb.getChars(0, sb.length(), chars, 0);

        int countPatternsInString = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == pattern) {
                countPatternsInString++;
            }
        }

        String[] resArray = new String[countPatternsInString];
        int resArrayIndex = 0;

        int start = 0;
        int end;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == pattern) {
                end = i;
                resArray[resArrayIndex] = sb.substring(start, end).trim();
                resArrayIndex++;
                start = i+1;
            }
        }

        return resArray;
    }

    public static String printReverseStringFromArray(String[] strs) {

        StringBuilder sb = new StringBuilder();


        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]).append(" ");
        }

        return sb.toString();
    }

}
