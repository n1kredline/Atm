package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.model.CardStore;
import com.n1kredline.atm.controller.model.InterfaceContainer;
import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertCardButtonListener implements ActionListener {

    private CardStore cardStore;
    private Atm atm;
    private InterfaceSwitcher interfaceSwitcher;
    private InterfaceContainer container;

    public InsertCardButtonListener(CardStore cardStore, Atm atm, InterfaceSwitcher interfaceSwitcher, InterfaceContainer container) {
        this.cardStore = cardStore;
        this.atm = atm;
        this.interfaceSwitcher = interfaceSwitcher;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int value = Integer.parseInt(container.getFormattedTextField().getText());
        try {
            atm.insertCard(cardStore.getCard(value));
            interfaceSwitcher.setValidateCardScreen();
        } catch (IllegalArgumentException a) {
            container.getLabel().setText("Введённой карты не найденно");
            container.getFormattedTextField().setText("");
            container.getWindow().pack();
        }
    }
}