package com.teiran.org.javaprof.homework21082024.cardsgame.services;

import com.teiran.org.javaprof.homework21082024.cardsgame.Card;
import com.teiran.org.javaprof.homework21082024.cardsgame.Deck;
import com.teiran.org.javaprof.homework21082024.cardsgame.Player;
import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Rank;
import com.teiran.org.javaprof.homework21082024.cardsgame.enums.Suit;

import java.util.List;
import java.util.Scanner;

public class Initialization {

    public int setCountPlayers(int cardsForPlayer, int numberOfCards) {
        final Scanner sc = new Scanner(System.in);
        int countPlayers = 0;

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                countPlayers = sc.nextInt();
                if (cardsForPlayer * countPlayers <= numberOfCards) {
                    break;
                } else {
                    if (countPlayers == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (countPlayers < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        return countPlayers;
    }

    public void setPlayers(List<Player> players, int countPlayers) {

        for (int i = 1; i <= countPlayers; i++) {
            players.add(new Player("player" + i));
        }
    }

    public void initCards(List<Card> cards) {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void dealCards(Deck deck, List<Player> players, int cardsForPlayer) {
        for (Player player : players) {
            for (int i = 1; i <= cardsForPlayer; i++) {
                player.getCards().add(deck.getCards().getLast());
                deck.getCards().removeLast();
            }
        }
    }

    public void printDealOfCards(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.getNickName());
            System.out.println(player.getCards());
            System.out.println("-------------------------------------------------");

        }
    }
}
