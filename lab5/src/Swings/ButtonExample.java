/*
5b. Develop a Swing program in Java to display a message 
“Srilanka is pressed” or “India is pressed” depending upon the JButton 
either Srilanka or India is pressed by implementing the event handling 
mechanism with addActionListener().
*/
package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonExample {

    JLabel l1;

    ButtonExample() {
        JFrame f = new JFrame("Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 500, 80);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));

        // Buttons
        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Srilanka");

        b1.setBounds(50, 150, 120, 40);
        b2.setBounds(200, 150, 120, 40);

        // Action for India button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Action for Srilanka button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Srilanka is pressed");
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
        new ButtonExample();
    }
}