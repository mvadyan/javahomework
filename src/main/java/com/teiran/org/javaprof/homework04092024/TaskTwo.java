package com.teiran.org.javaprof.homework04092024;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {
    public static void main(String[] args) {

        String strOne = "s[sodjirfmdfkduwekdc;lbg;jhgutryafsd,ladfs;dfslfgj";

        String strTwo = "qowivnbftgcvtydjm,eklfvujrfhfhbvukoklsldldf";

        Set<Character> characters = new HashSet<>();

        addCharToList(characters, strOne);
        addCharToList(characters, strTwo);

        System.out.println(characters);

    }

    private static void addCharToList(Set<Character> characters, String str) {

        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
    }
}
