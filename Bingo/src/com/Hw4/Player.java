package com.Hw4;

public class Player {
    private String name;
    private Card[] cards = new Card[1];

    public void addCard() {
        cards[0] = new Card();
    }

    public Card[] getCards() {
        return cards;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
