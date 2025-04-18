package com.teiran.org.javaprof.algorithms.homework10102024;

/*
 * Последовательность ([{}]) является правильной, а последовательности ([)], {()] правильными не являются.
 *  Докажите это используя стек!
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TaskOne {
    static Map<Character, Character> pairOfBrackets = new HashMap<>();
    static Map<Character, Character> reversePairOfBrackets = new HashMap<>();

    public static void main(String[] args) {
        pairOfBrackets.put('[', ']');
        pairOfBrackets.put('(', ')');
        pairOfBrackets.put('{', '}');

        reversePairOfBrackets.put(']', '[');
        reversePairOfBrackets.put(')', '(');
        reversePairOfBrackets.put('}', '{');

        String stringOne = "([{}])";
        String stringTwo = "([)]";
        String stringThree = "{()]";

        System.out.println(check(stringOne));
        System.out.println(check(stringTwo));
        System.out.println(check(stringThree));
    }

    public static boolean check(String checkingString) {
        Stack<Character> brackets = new Stack<>();
        char[] elements = checkingString.toCharArray();

        for (int i = 0; i < elements.length; i++) {
            char element = elements[i];
            if (pairOfBrackets.containsKey(element)) {
                brackets.push(element);
            }

            if (pairOfBrackets.containsValue(element) &&
                    brackets.contains(reversePairOfBrackets.get(element))) {
                brackets.pop();
            }
        }

        return brackets.isEmpty();
    }
}
