/*
Write a Java program for getting different colors through ArrayList interface 
and sort them using Collections.sort(ArrayListObj)
*/

package com.lab;

import java.util.*;

public class p3 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the list
        Collections.sort(ls);

        System.out.println("After sorting:");
        System.out.println(ls);
    }
}