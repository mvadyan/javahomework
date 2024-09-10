package com.teiran.org.javaprof.homework21082024.cardsgame;

import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Rank;
import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Suit;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return  rank.getDesc() + " " +  suit.getDesc();
    }
}
