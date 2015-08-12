package com.dark_matter;

import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame {
    private JPanel contentPane;
    private JButton newGameButton;
    private JButton optionsButton;
    private JButton exitButton;

    public MainMenu() {
        setContentPane(contentPane);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        getRootPane().setDefaultButton(newGameButton);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addListeners();
    }

    /**
     *  Add listeners
     */
    private void addListeners() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onExit();
            }
        });

        newGameButton.addActionListener(e -> onNewGame());
        contentPane.registerKeyboardAction(e -> onExit(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        exitButton.addActionListener(e -> onExit());
    }

    private void onNewGame() {

    }

    private void onExit() {
        int option = JOptionPane.showConfirmDialog(
                this,
                "Are you sure?",
                "You are about to exit app",
                JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MainMenu mainFrame = new MainMenu();
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}
