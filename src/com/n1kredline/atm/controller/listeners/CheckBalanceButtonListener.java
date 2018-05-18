package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBalanceButtonListener implements ActionListener {

    private InterfaceSwitcher interfaceSwitcher;

    public CheckBalanceButtonListener(InterfaceSwitcher interfaceSwitcher) {
        this.interfaceSwitcher = interfaceSwitcher;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        interfaceSwitcher.setCheckBalanceScreen();
    }
}