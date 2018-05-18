package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.model.CardStore;
import com.n1kredline.atm.controller.model.InterfaceContainer;
import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubstractionButtonListener implements ActionListener {

    private CardStore cardStore;
    private Atm atm;
    private InterfaceSwitcher interfaceSwitcher;
    private InterfaceContainer container;

    public SubstractionButtonListener(CardStore cardStore, Atm atm, InterfaceSwitcher interfaceSwitcher, InterfaceContainer container) {
        this.cardStore = cardStore;
        this.atm = atm;
        this.interfaceSwitcher = interfaceSwitcher;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int value = Integer.parseInt(container.getFormattedTextField().getText());
        try {
            if (!atm.substraction(value)) {
                container.getLabel().setText("Операция не удалась");
                container.getFormattedTextField().setText("");
                container.getWindow().pack();
            } else {
                container.getLabel().setText("     Ваш баланс:" + atm.getBalance());
                container.getFormattedTextField().setText("");
                container.getWindow().pack();
            }
        } catch (IllegalArgumentException a) {
            container.getLabel().setText("Введённой карты не найденно");
            container.getFormattedTextField().setText("");
            container.getWindow().pack();
        }
    }
}