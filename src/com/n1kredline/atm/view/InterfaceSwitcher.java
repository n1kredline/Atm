package com.n1kredline.atm.controller.view;

import com.n1kredline.atm.controller.model.Atm;
import com.n1kredline.atm.controller.model.InterfaceContainer;

public class InterfaceSwitcher {

    private InterfaceContainer container;
    private Atm atm;

    public InterfaceSwitcher(InterfaceContainer сontainer, Atm atm) {
        this.container = сontainer;
        this.atm = atm;
    }

    public void start() {
        setInsertCardScreen();
        container.getWindow().setVisible(true);
    }

    public void setInsertCardScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("Банкомат приветствует вас");

        container.getFormattedTextField().setText("");
        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getFormattedTextField());
        container.getPanel().add(container.getInsertCardButton());
        container.getPanel().add(container.getExitButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }

    public void setValidateCardScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("    Введите пин-код");

        container.getFormattedTextField().setText("");
        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getFormattedTextField());
        container.getPanel().add(container.getInsertPinCodeButton());
        container.getPanel().add(container.getEjectCardButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }

    public void setMainMenuScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("     Выберите действие");

        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getCheckBalanceButton());
        container.getPanel().add(container.getTopUpMenuButton());
        container.getPanel().add(container.getSubstractionMenuButton());
        container.getPanel().add(container.getEjectCardButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }

    public void setCheckBalanceScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("     Ваш баланс: " + atm.getBalance());

        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getMainMenuButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }

    public void setTopUpScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("Какую сумму зачислить?");

        container.getFormattedTextField().setText("");
        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getFormattedTextField());
        container.getPanel().add(container.getTopUpButton());
        container.getPanel().add(container.getMainMenuButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }

    public void setSubstractionScreen() {
        container.getPanel().removeAll();
        container.getLabel().setText("Какую сумму снять?");

        container.getFormattedTextField().setText("");
        container.getPanel().add(container.getLabel());
        container.getPanel().add(container.getFormattedTextField());
        container.getPanel().add(container.getSubstractionButton());
        container.getPanel().add(container.getMainMenuButton());
        container.getWindow().repaint();
        container.getWindow().validate();
        container.getWindow().pack();
    }
}