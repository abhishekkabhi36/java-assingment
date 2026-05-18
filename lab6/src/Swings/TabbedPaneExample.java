package Swings;

import java.awt.Color;
import javax.swing.*;

/*
6b. Develop a Swing program in Java to create a Tabbed Pane of 
RED, BLUE and GREEN and display the concerned color whenever 
the specific tab is selected in the pane.
*/

public class TabbedPaneExample {

    JFrame f;

    TabbedPaneExample() {
        f = new JFrame("Tabbed Pane Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        // Add tabs
        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        // Add to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}