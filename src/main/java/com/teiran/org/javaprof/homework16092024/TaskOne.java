package com.teiran.org.javaprof.homework16092024;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
        Random random = new Random();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            Integer temp = random.nextInt(500);

            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                Integer count = map.get(temp);
                count++;
                map.put(temp, count);
            }
        }

        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
