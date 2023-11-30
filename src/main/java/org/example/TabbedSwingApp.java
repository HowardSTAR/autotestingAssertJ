package org.example;

import javax.swing.*;

public class TabbedSwingApp {
    public JTabbedPane createTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane();

        GreetingTab greetingTab = new GreetingTab();
        tabbedPane.addTab("Приветствие", greetingTab.createGreetingTab());

        CalculatorTab calculatorTab = new CalculatorTab();
        tabbedPane.addTab("Калькулятор", calculatorTab.createCalculatorTab());

        return tabbedPane;
    }
}