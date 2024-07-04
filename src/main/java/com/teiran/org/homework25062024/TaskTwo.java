package com.teiran.org.homework25062024;

public class TaskTwo {

    public static void main(String[] args) {
        String str = "study Basic Java!";
        changeString(str);
    }

    public static void changeString (String str) {
        System.out.println(str.charAt(str.length()-1));
        boolean isContain = str.contains("Java");
        System.out.println("Input string is contains  string 'Java'? - " + isContain  );

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String pattern = "Java";
        String beforePattern = str.substring(0, str.indexOf(pattern));
        String afterPattern = str.substring(str.indexOf(pattern) + pattern.length() );

        System.out.println(beforePattern.concat(afterPattern));
    }
}


