/*
Write a Java program for getting different colors through ArrayList interface 
and extract the elements 1st and 2nd from the ArrayList object by using subList()
*/

package com.lab;

import java.util.*;

public class p4 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        System.out.println("Using subList (1st and 2nd elements):");

        // Extracting 1st and 2nd elements → index 0 to 2 (2 is exclusive)
        System.out.println(ls.subList(0, 2));
    }
}