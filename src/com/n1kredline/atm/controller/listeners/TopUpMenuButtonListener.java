package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopUpMenuButtonListener implements ActionListener {

    private InterfaceSwitcher interfaceSwitcher;

    public TopUpMenuButtonListener(InterfaceSwitcher interfaceSwitcher) {
        this.interfaceSwitcher = interfaceSwitcher;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        interfaceSwitcher.setTopUpScreen();
    }
}