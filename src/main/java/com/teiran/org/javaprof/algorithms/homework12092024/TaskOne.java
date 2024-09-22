package com.teiran.org.javaprof.algorithms.homework12092024;

/*
Задача:
Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
* */


import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

        int[] resArr = mergeArrays(arr1, arr2);

        quickSortArray(resArr, 0, resArr.length - 1);

        printArrayElement(resArr);


    }

    private static void quickSortArray(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int pivot = arr[endIndex];
        int i = startIndex;
        int j = startIndex;

        while (i < endIndex) {

            if (arr[i] <= pivot) {
                swap(arr, j, i);
                j++;
                i++;
            } else {
                i++;
            }
        }

        if (i == endIndex) {
            swap(arr, j, endIndex);
        }

        quickSortArray(arr, startIndex, j - 1);
        quickSortArray(arr, j + 1, endIndex);

    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int[] resArr = new int[lengthArr1 + lengthArr2];

        System.arraycopy(arr1, 0, resArr, 0, lengthArr1);
        System.arraycopy(arr2, 0, resArr, lengthArr1, lengthArr2);

        return resArr;
    }

    private static void printArrayElement(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number from 1 to " + arr.length);

        int index = scanner.nextInt();

        if (index > arr.length) {
            System.out.println("Input value out of bounds");
            System.out.println("Input number from 1 to " + arr.length);
            index = scanner.nextInt();
        }

        System.out.println("Output: " + arr[index - 1]);
    }
}
