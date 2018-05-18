package com.n1kredline.atm.controller.model;

import java.util.ArrayList;

public class CardStore {

    ArrayList<Card> cardBase;

    public CardStore() {
        initializeCardBase();
    }

    public void initializeCardBase() {
        cardBase = new ArrayList<Card>();
        cardBase.add(new Card(12345678, 1111, 10));
        cardBase.add(new Card(87654321, 2222, 20));
        cardBase.add(new Card(12348765, 3333, 30));
        cardBase.add(new Card(87651234, 4444, 40));
        cardBase.add(new Card(56781234, 5555, 50));
        cardBase.add(new Card(43218765, 6666, 60));
        cardBase.add(new Card(43217856, 7777, 70));
        cardBase.add(new Card(56784321, 8888, 80));
        cardBase.add(new Card(87653421, 9999, 90));
        cardBase.add(new Card(13245678, 1234, 100));
    }

    public Card getCard(int value) throws IllegalArgumentException {
        for (Card cardX : cardBase) {
            if (cardX.getCardNumber() == value) {
                return cardX;
            }
        }
        throw new IllegalArgumentException();
    }
}
