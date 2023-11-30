package org.example;

import javax.swing.*;
import java.awt.*;

public class CalculatorTab {
    public static JPanel createCalculatorTab() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel calculatorPanel = createCalculatorPanel();
        panel.add(calculatorPanel, BorderLayout.CENTER);
        return panel;
    }

    private static JPanel createCalculatorPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField display = new JTextField();
        display.setEditable(false);
        panel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new CalculatorButtonListener(display));
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        return panel;
    }
}