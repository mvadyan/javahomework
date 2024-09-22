package com.teiran.org.javaprof.algorithms.homework12092024;

/*
* Решите задачу: Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй. Полученные данные напечатайте.
  На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)
* */

import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {
        String inputStr = "poiuytrewqlkjhgfdsamnbvcxz";

        char[] charArray = inputStr.toCharArray();

        quickSortArray(charArray, 0, inputStr.length() - 1);

        String sortString = String.valueOf(charArray).toUpperCase();

        System.out.println(sortString);

    }


    private static void quickSortArray(char[] charArray, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int pivot = charArray[endIndex];
        int i = startIndex;
        int j = startIndex;

        while (i < endIndex) {

            if (charArray[i] <= pivot) {
                swap(charArray, j, i);
                j++;
                i++;
            } else {
                i++;
            }
        }
        if (i == endIndex) {
            swap(charArray, j, endIndex);
        }

        quickSortArray(charArray, startIndex, j - 1);
        quickSortArray(charArray, j + 1, endIndex);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
