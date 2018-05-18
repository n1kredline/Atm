package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.model.CardStore;
import com.n1kredline.atm.controller.model.InterfaceContainer;
import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopUpButtonListener implements ActionListener {

    private CardStore cardStore;
    private Atm atm;
    private InterfaceSwitcher interfaceSwitcher;
    private InterfaceContainer container;

    public TopUpButtonListener(CardStore cardStore, Atm atm, InterfaceSwitcher interfaceSwitcher, InterfaceContainer container) {
        this.cardStore = cardStore;
        this.atm = atm;
        this.interfaceSwitcher = interfaceSwitcher;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int value = Integer.parseInt(container.getFormattedTextField().getText());
        try {
            atm.topUp(value);
            container.getLabel().setText("     Ваш баланс:" + atm.getBalance());
            container.getFormattedTextField().setText("");
            container.getWindow().pack();

        } catch (IllegalArgumentException a) {
            container.getLabel().setText("Введённой карты не найденно");
            container.getFormattedTextField().setText("");
            container.getWindow().pack();
        }
    }
}