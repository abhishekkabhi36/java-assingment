package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
4. Add elements in the same order in the LinkedHashMap using for() loop and put()

String[] keys = {"C", "A", "B", "E", "D"};
Integer[] values = {3, 1, 2, 5, 4};
*/

public class P12 {

    public static void main(String[] args) {

        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        Map<String, Integer> lMap = new LinkedHashMap<>();

        // Adding elements using for loop
        for (int i = 0; i < keys.length; i++) {
            lMap.put(keys[i], values[i]);
        }

        // Printing LinkedHashMap
        System.out.println("LinkedHashMap: " + lMap);
    }
}