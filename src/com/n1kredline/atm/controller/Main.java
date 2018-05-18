package com.n1kredline.atm.controller;

import com.n1kredline.atm.controller.listeners.*;
import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.model.CardStore;
import com.n1kredline.atm.controller.model.InterfaceContainer;
import com.n1kredline.atm.controller.view.InterfaceSwitcher;

public class Main {

    public static void main(String[] args) {

        CardStore cardStore = new CardStore();
        Atm atm = new Atm(500);
        InterfaceContainer container = new InterfaceContainer();
        InterfaceSwitcher interfaceSwitcher = new InterfaceSwitcher(container,atm);

        setControllers(cardStore, atm, interfaceSwitcher, container);

        interfaceSwitcher.start();
    }

    public static void setControllers(CardStore cardStore, Atm atm, InterfaceSwitcher interfaceSwitcher, InterfaceContainer container) {

        container.getInsertCardButton().addActionListener(new InsertCardButtonListener(cardStore, atm, interfaceSwitcher, container));
        container.getInsertPinCodeButton().addActionListener(new InsertPinCodeButtonListener(cardStore, atm, interfaceSwitcher, container));
        container.getExitButton().addActionListener(new ExitButtonListener(container));
        container.getEjectCardButton().addActionListener(new EjectCardButtonListener(atm, interfaceSwitcher));
        container.getMainMenuButton().addActionListener(new MainMenuButtonListener(interfaceSwitcher));
        container.getCheckBalanceButton().addActionListener(new CheckBalanceButtonListener(interfaceSwitcher));
        container.getTopUpMenuButton().addActionListener(new TopUpMenuButtonListener(interfaceSwitcher));
        container.getTopUpButton().addActionListener(new TopUpButtonListener(cardStore, atm, interfaceSwitcher, container));
        container.getSubstractionMenuButton().addActionListener(new SubstractionMenuButtonListener(interfaceSwitcher));
        container.getSubstractionButton().addActionListener(new SubstractionButtonListener(cardStore, atm, interfaceSwitcher, container));

    }
}