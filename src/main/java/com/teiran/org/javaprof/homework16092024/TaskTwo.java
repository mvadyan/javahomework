package com.teiran.org.javaprof.homework16092024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskTwo {

    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>();
        listOne.add("Berlin");
        listOne.add("Barcelona");
        listOne.add("Valencia");
        listOne.add("Paris");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("Bonn");
        listTwo.add("Düsseldorf");
        listTwo.add("Köln");
        listTwo.add("Amsterdam");

        Map<String, List<String>> map = new HashMap<>();

        map.put("Alex", listOne);
        map.put("Tomas", listTwo);


        addTouristTOMap(map, "John");

        map.forEach((k, v) -> {
            System.out.println(k + " === " + v);
        });
    }

    private static void addTouristTOMap(Map<String, List<String>> map, String tourist) {

        List<String> newList = new ArrayList<>();
        map.forEach((k, v) -> {
            newList.addAll(v);
        });

        map.put(tourist, newList);
    }
}
