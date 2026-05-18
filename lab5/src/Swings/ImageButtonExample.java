package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
1. Develop a Swing program in Java to display a message 
“Digital Clock is pressed” or “Hour Glass is pressed” 
depending upon the JButton with image either Digital Clock 
or Hour Glass is pressed by implementing the event handling 
mechanism with addActionListener().
*/

public class ImageButtonExample {

    JLabel l1;

    ImageButtonExample() {
        JFrame f = new JFrame("Image Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 400, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 18));

        // Load images (make sure images exist in project folder)
        ImageIcon clockIcon = new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\lab5\\src\\Swings\\clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\lab5\\src\\Swings\\hourglass.png");

        // Buttons with images
        JButton b1 = new JButton(clockIcon);
        JButton b2 = new JButton(hourGlassIcon);

        b1.setBounds(50, 120, 120, 120);
        b2.setBounds(200, 120, 120, 120);

        // Action for Digital Clock
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        // Action for Hour Glass
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}