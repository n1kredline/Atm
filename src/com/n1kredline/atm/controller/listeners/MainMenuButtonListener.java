package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.view.InterfaceSwitcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuButtonListener implements ActionListener {

    private InterfaceSwitcher interfaceSwitcher;

    public MainMenuButtonListener(InterfaceSwitcher interfaceSwitcher) {
        this.interfaceSwitcher = interfaceSwitcher;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        interfaceSwitcher.setMainMenuScreen();
    }
}