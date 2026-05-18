/*
Write a Java program for getting different colors through ArrayList interface 
and remove the 2nd element and color "Blue" from the ArrayList 
(using remove by index and remove by object)
*/

package com.lab;

import java.util.*;

public class P2 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        // Remove 2nd element (index 1)
        ls.remove(1);
        System.out.println("After removing 2nd element: " + ls);

        // Remove "Blue" using object
        ls.remove("Blue");
        System.out.println("After removing Blue: " + ls);
    }
}