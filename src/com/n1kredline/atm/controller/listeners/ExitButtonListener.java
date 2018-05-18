package com.n1kredline.atm.controller.listeners;

import com.n1kredline.atm.controller.model.InterfaceContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonListener implements ActionListener {

    private InterfaceContainer container;

    public ExitButtonListener(InterfaceContainer container) {
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        container.getWindow().setVisible(false);
        System.exit(0);
    }
}