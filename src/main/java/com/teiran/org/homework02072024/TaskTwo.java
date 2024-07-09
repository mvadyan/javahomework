package com.teiran.org.homework02072024;

import java.util.Random;

public class TaskTwo {

    public static void main(String[] args) {
        Random random = new Random();

        int time = random.nextInt(28800);
        System.out.println(time);
        System.out.println(printRestWorkTime(time));

    }

    public static String printRestWorkTime(int time) {

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;

        return hours + " hours " + minutes + " minutes";

    }

    ;


}


