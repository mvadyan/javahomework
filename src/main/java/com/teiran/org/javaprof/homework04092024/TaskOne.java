package com.teiran.org.javaprof.homework04092024;

import java.util.*;

public class TaskOne {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 500; i++) {
            int temp = random.nextInt(10);
            integers.add(temp);
        }

        Set<Integer> treeSetIntegers = new TreeSet<>();
        Set<Integer> hashSatIntegers = new HashSet<>();

        for (Integer integer : integers) {
            treeSetIntegers.add(integer);
            hashSatIntegers.add(integer);
        }

        System.out.println("Sorted unique elements " + treeSetIntegers);
        System.out.println("Unique elements " + hashSatIntegers);

    }
}
