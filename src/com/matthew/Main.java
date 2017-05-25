package com.matthew;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame("Hi-ADSD Aplication");
                mainFrame.pack();
                mainFrame.setVisible(true);
            }
        });
    }
}
