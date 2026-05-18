package Collections;

import java.util.TreeMap;

/*
4. Write a Java program to get the first (lowest) key and the last (highest) key 
currently in the following TreeMap:

("C2", "Red"), ("C1", "Green"), ("C4", "Black"), ("C3", "White")

[Hint: firstKey() and lastKey()]
*/

public class P8 {

    public static void main(String[] args) {

        TreeMap<String, String> map1 = new TreeMap<>();

        map1.put("C2", "Red");
        map1.put("C1", "Green");
        map1.put("C4", "Black");
        map1.put("C3", "White");

        System.out.println("TreeMap (sorted): " + map1);

        System.out.println("The first (lowest) key is: " + map1.firstKey());
        System.out.println("The last (highest) key is: " + map1.lastKey());
    }
}