package com.n1kredline.atm.controller.model;

public class Atm {
    private int cash;
    private boolean isCardInserted;
    private Card currentCard;
    private boolean isPINCorrect;

    public Atm(int cash) {
        this.cash = cash;
    }

    public void insertCard(Card card) {
        currentCard = card;
        isCardInserted = true;
    }

    public void ejectCard() {
        currentCard = null;
        isCardInserted = false;
    }

    public boolean substraction(int value) throws IllegalStateException {
        if (isCardInserted) {
            if (value <= cash) {
                if (currentCard.startTransaction(value)) {
                    cash -= value;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void topUp(int value) throws IllegalStateException {
        if (isCardInserted) {
            cash += value;
            currentCard.topUp(value);
        } else {
            throw new IllegalStateException();
        }
    }

    public int getBalance() throws IllegalStateException {
        if (isCardInserted) {
            return currentCard.getBalance();
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean checkPIN(int value) {
        if (currentCard.getPIN() == value) {
            isPINCorrect = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean getIsPINCorrect() {
        return isPINCorrect;
    }

    public void setIsPINCorrect(boolean isPINCorrect) {
        this.isPINCorrect = isPINCorrect;
    }
}