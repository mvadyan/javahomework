package com.teiran.org.javaprof.homework21082024.cardsgame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards = new ArrayList<>();

    private String nickName;

    public Player(String nickName) {
        this.nickName = nickName;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
