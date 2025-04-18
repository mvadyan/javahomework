package com.teiran.org.javaprof.algorithms.homework10102024;

/*
* Дан односвязный список. Написать функцию или блок схему, определяющую,
* образуют ли его элементы симметричную последовательность.
*  Для решения задачи использовать стек и очередь.
*  Функция будет возвращать значение true,
*  если список является симметричным, false – в противном случае.
По определению пустой список является симметричным.
*  Поэтому, если список пуст, то возвращаем значение true.
*  Для проверки симметричности списка нужно проверить на равенство все пары элементов,
*  равноотстоящих от середины списка.
*  Каждая пара содержит один элемент из первой половины списка и один – из второй.
*  Элементы первой половины списка последовательно заносятся в очередь, второй половины в стек.
*  Если количество элементов списка будет нечетным,
* то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь, ни в стек.
* */


import java.util.*;

public class TaskTwo {

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1));

        System.out.println( checkSynchronized(integerList));
    }

    private static boolean checkSynchronized(List<Integer> integerList) {
        int startMiddle = integerList.size() % 2 > 0 ? integerList.size() / 2 + 1 : integerList.size() / 2;

        Queue<Integer> integerQueue = new ArrayDeque<>();
        Stack<Integer> integerStack = new Stack<>();


        for (int i = 0; i < integerList.size() / 2; i++) {
            integerQueue.add(integerList.get(i));
        }

        for (int i = startMiddle; i < integerList.size(); i++) {
            integerStack.push(integerList.get(i));
        }

        while (!integerQueue.isEmpty()) {
            boolean isSynchronized = integerQueue.poll().equals(integerStack.pop()) ;

            if (!isSynchronized) {
                return false;
            }
        }

        return true;
    }

}

