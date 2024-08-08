package com.teiran.org.homework01082024;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(concatReversStr("Hallo", "Java"));
    }

    public static String concatReversStr (String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str1).append(" ").append(str2).reverse().toString();
    }

}
