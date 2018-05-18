package com.n1kredline.atm.controller.model;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class InterfaceContainer {

    private JFrame window;

    private JPanel panel;

    private JLabel label;

    private JFormattedTextField formattedTextField;

    private JButton exitButton;
    private JButton ejectCardButton;
    private JButton mainMenuButton;
    private JButton insertCardButton;
    private JButton insertPinCodeButton;
    private JButton checkBalanceButton;
    private JButton substractionButton;
    private JButton topUpButton;
    private JButton topUpMenuButton;
    private JButton substractionMenuButton;

    public InterfaceContainer() {
        createMenuElements();
        createPanels();
        createFrame();
    }

    public void createMenuElements(){

        Dimension dimension = new Dimension(300,200);

        exitButton = new JButton("Завершить работу");
        exitButton.setMaximumSize(dimension);

        ejectCardButton = new JButton("Извлечь карту");
        ejectCardButton.setMaximumSize(dimension);

        mainMenuButton = new JButton("Меню");
        mainMenuButton.setMaximumSize(dimension);

        insertCardButton = new JButton("Ввести карту");
        insertCardButton.setMaximumSize(dimension);

        insertPinCodeButton = new JButton("Ввести пин-код");
        insertPinCodeButton.setMaximumSize(dimension);

        checkBalanceButton = new JButton("Отобразить баланс");
        checkBalanceButton.setMaximumSize(dimension);

        substractionButton = new JButton("Снять");
        substractionButton.setMaximumSize(dimension);

        topUpButton = new JButton("Зачислить");
        topUpButton.setMaximumSize(dimension);

        topUpMenuButton = new JButton("Пополнить баланс");
        topUpMenuButton.setMaximumSize(dimension);

        substractionMenuButton = new JButton("Снять со счёта");
        substractionMenuButton.setMaximumSize(dimension);

        formattedTextField = new JFormattedTextField(new DecimalFormat("########"));

        label = new JLabel();
        label.setMaximumSize(dimension);
    }

    public void createPanels(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    }

    public void createFrame() {

        window = new JFrame("Банкомат");
        window.setResizable(false);
        window.setBounds(600, 200, 300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(panel);

    }

    public JFrame getWindow() {
        return window;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getLabel() {
        return label;
    }

    public JTextField getFormattedTextField() {
        return formattedTextField;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getEjectCardButton() {
        return ejectCardButton;
    }

    public JButton getMainMenuButton() {
        return mainMenuButton;
    }

    public JButton getInsertCardButton() {
        return insertCardButton;
    }

    public JButton getInsertPinCodeButton(){
        return insertPinCodeButton;
    }

    public JButton getCheckBalanceButton(){
        return checkBalanceButton;
    }

    public JButton getTopUpMenuButton(){
        return topUpMenuButton;
    }

    public JButton getSubstractionMenuButton(){
        return substractionMenuButton;
    }

    public JButton getSubstractionButton() {
        return substractionButton;
    }

    public JButton getTopUpButton() {
        return topUpButton;
    }
}