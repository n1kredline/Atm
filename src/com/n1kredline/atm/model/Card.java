package com.n1kredline.atm.controller.model;

public class Card {

    private int balance;
    private int cardNumber;
    private final int PIN;

    public Card(int cardNumber, int pin, int balance) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.PIN = pin;
    }

    public void topUp(int value) {
        balance += value;
    }

    public boolean startTransaction(int value) {
        if (value <= balance) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPIN() {
        return PIN;
    }
}