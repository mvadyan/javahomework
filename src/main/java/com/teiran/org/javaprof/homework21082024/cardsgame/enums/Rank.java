package com.teiran.org.javaprof.homework21082024.cardsgame.enums;

public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");

    private String desc;

    Rank(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
