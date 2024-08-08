package com.teiran.org.homework01082024;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        int index = sb.indexOf("?");
        sb.replace(index, index + 1, "e");

        System.out.println(sb);
    }
}
