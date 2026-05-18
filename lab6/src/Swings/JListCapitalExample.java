package Swings;

import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
6c. Develop a Swing program in Java to add the countries 
USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
Japan, Africa, Greenland, Singapore into a JList and display 
the capital of the countries on console whenever the countries 
are selected on the list.
*/

public class JListCapitalExample extends JFrame {

    private JList<String> countryList;

    public JListCapitalExample() {

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Capital mapping
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selected = countryList.getSelectedValuesList();

                    for (String country : selected) {
                        String capital = capitals.get(country);
                        System.out.println("Capital of " + country + " is: " + capital);
                    }
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capitals");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListCapitalExample();
    }
}