package com.teiran.org.javaprof.homework21082024.cardsgame.enums;

public enum Suit {

    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private String desc;

    Suit(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
