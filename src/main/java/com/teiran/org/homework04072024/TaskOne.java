package com.teiran.org.homework04072024;

public class TaskOne {
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean isBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("I can buy food, it is " + isBuy);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return (isEdekaOpen || isReweOpen);
    }
}
