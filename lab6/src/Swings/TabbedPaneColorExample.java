package Swings;

import java.awt.Color;
import javax.swing.*;

/*
6d. Develop a Swing program in Java to create a Tabbed Pane of 
Cyan, Magenta and Yellow and display the concerned color 
whenever the specific tab is selected in the pane.
*/

public class TabbedPaneColorExample {

    JFrame f;

    TabbedPaneColorExample() {
        f = new JFrame("Tabbed Pane Color Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        // Add tabs
        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Add to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneColorExample();
    }
}