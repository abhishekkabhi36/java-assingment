package Collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
1. Write a Java program to traverse / iterate all the keys with the specified value 
in a TreeMap (1,"Apple"), (2,"Strawberry"), (3,"Pear"), (4,"Cucumber"), (5,"Grapes")

[Hint: use put(), entrySet(), getKey() and getValue()]
*/

public class P5 {

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        System.out.println("Iterating over TreeMap entries:");

        for (Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               " -> Value: " + entry.getValue());
        }
    }
}