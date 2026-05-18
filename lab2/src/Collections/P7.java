package Collections;

import java.util.Map;
import java.util.TreeMap;

/*
3. Remove all elements from the TreeMap, then verify that its size is zero.
Include once again the following elements and iterate them and check its size:

(1,"Banana"), (2,"Orange"), (3,"Guava"), (4,"Pomegranate"), (5,"Amla")

[Hint: clear(), size(), put()]
*/

public class P7 {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        // Initial elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Remove all elements
        map.clear();
        System.out.println("After removing all elements, size: " + map.size());

        // Add new elements
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Iterate elements
        System.out.println("\nIterating elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check size again
        System.out.println("\nAfter adding elements, size: " + map.size());
    }
}