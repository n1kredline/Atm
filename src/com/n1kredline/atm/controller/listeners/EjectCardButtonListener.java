package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjectCardButtonListener implements ActionListener {

    private InterfaceSwitcher interfaceSwitcher;
    private Atm atm;

    public EjectCardButtonListener(Atm atm, InterfaceSwitcher interfaceSwitcher) {
        this.atm = atm;
        this.interfaceSwitcher = interfaceSwitcher;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        interfaceSwitcher.setInsertCardScreen();
        atm.ejectCard();
    }
}
