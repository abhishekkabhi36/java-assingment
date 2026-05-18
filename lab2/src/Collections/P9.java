package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
1. Write a Java program to traverse / iterate all the keys with the specified value 
in a LinkedHashMap (1,"Apple"), (2,"Strawberry"), (3,"Pear"), (4,"Cucumber"), (5,"Grapes") 
and display only eldest entered 4 elements.

[Hint: use removeEldestEntry()]
*/

public class P9 {

    public static void main(String[] args) {

        System.out.println("=== LinkedHashMap Demonstration ===");

        // LinkedHashMap with limit of 4 elements
        Map<Integer, String> map = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 4; // keep only 4 elements
            }
        };

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes"); // this will remove the eldest (1=Apple)

        // Iterating entries
        System.out.println("\nIterating over entries:");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Final map after removing eldest
        System.out.println("\nAfter adding 5 (eldest removed): " + map);
    }
}