package Collections;

import java.util.HashMap;
import java.util.Map;

/*
4. Write a Java program to check whether a map contains Key-Value mappings (empty) or not 
after adding all the following elements into HashMap and after removing all the elements.

(1, "Red"), (2, "Green"), (3, "Black"), (4, "White"), (5, "Blue")
*/

public class P4 {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        // Adding elements
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "White");
        map1.put(5, "Blue");

        // Check before removing
        boolean res = map1.isEmpty();
        System.out.println("Before removing elements, is map empty? " + res);

        // Removing all elements
        map1.clear();

        // Check after removing
        res = map1.isEmpty();
        System.out.println("After removing elements, is map empty? " + res);
    }
}