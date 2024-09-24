package com.teiran.org.javaprof.homework03092024;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10000000; i++) {
            integers.add(i, random.nextInt());
        }


        long start = System.currentTimeMillis();
        // 1 for-each loop
        for (Integer elm : integers) {
            int temp = elm;
        }

        long end = System.currentTimeMillis();
        System.out.println("time execute for first foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");


         start = System.currentTimeMillis();
        //2 classic for и вызываем внутри цикла list.size() для каждой итерации
        for (int i = 0; i < integers.size(); i++) {
            int temp = i;
            integers.size();
        }
         end = System.currentTimeMillis();
        System.out.println("time execute for second foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");


         start = System.currentTimeMillis();
        //3 classic for, но list.size() определяем в переменную
        for (int i = 0; i < integers.size(); i++) {
            int temp = integers.size();
        }
         end = System.currentTimeMillis();
        System.out.println("time execute for third foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");


          start = System.currentTimeMillis();
        //4 classic for, list.size() определяем в переменную, перебираем с конца (i--)
        for (int i = integers.size() -1; i > 0; i--) {
            int temp = integers.size();
        }
         end = System.currentTimeMillis();
        System.out.println("time execute for fourth foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");

         start = System.currentTimeMillis();
        //5 используя Itertor
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }

         end = System.currentTimeMillis();
        System.out.println("time execute for fifth foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");

         start = System.currentTimeMillis();
        //6 используя ListIterator
        ListIterator<Integer> listIterator = integers.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
         end = System.currentTimeMillis();
        System.out.println("time execute for sixth foreach is: " + (end - start));
        System.out.println("---------------------------------------------------");

    }
}
