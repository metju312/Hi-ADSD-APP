package com.matthew;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title) throws HeadlessException {
        super(title);
        setupFrameAttributes();
        addPanel();

    }

    private void addPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("button");
        panel.add(button);
        add(panel);
    }

    private void setupFrameAttributes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1366,786));
    }
}
