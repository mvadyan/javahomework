package com.teiran.org.javaprof.homework21082024.cardsgame;

import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Rank;
import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Suit;
import com.teiran.org.javaprof.homework21082024.cardsgame.services.Initialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final int cardsForPlayer = 5;
    private int countPlayers;
    private List<Player> players = new ArrayList<>();
    private List<Card> cards = new ArrayList<>();
    private final int numberOfCards = Suit.values().length * Rank.values().length;

    public void start() {
        Initialization init = new Initialization();

        countPlayers = init.setCountPlayers(cardsForPlayer, numberOfCards);

        init.setPlayers(players, countPlayers);

        init.initCards(cards);

        Collections.shuffle(cards);
        Deck deck = new Deck(cards);

        init.dealCards(deck, players, cardsForPlayer);

        init.printDealOfCards(players);

    }

}
