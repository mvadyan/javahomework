package com.teiran.org.homework25062024;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first word with pair quantity of letters");
        String wordOne = scanner.next();
        System.out.println("Input second word with pair quantity of letters");
        String wordTwo = scanner.next();

        String substringWordOne = wordOne.substring(0, wordOne.length()/2);
        String substringWordTwo = wordTwo.substring(wordTwo.length()/2);

        System.out.println("-----------------------");
        System.out.println(substringWordOne);
        System.out.println(substringWordTwo);
        System.out.println(substringWordOne.concat(substringWordTwo));





    }
}
