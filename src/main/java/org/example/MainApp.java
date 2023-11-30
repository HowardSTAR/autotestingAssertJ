package org.example;

import javax.swing.*;

public class MainApp extends JFrame {
    public MainApp() {
        super("Swing приложение с вкладками");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();

        setSize(400, 300);
        setVisible(true);
    }

    private void initUI() {
        TabbedSwingApp tabbedSwingApp = new TabbedSwingApp();
        JTabbedPane tabbedPane = tabbedSwingApp.createTabbedPane();
        getContentPane().add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}