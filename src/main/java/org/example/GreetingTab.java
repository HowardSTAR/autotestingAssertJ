package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GreetingTab {
    public static JPanel createGreetingTab() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Нажми меня");
        button.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Привет, это Swing!"));
        panel.add(button);
        return panel;
    }
}