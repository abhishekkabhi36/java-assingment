/*
Write a Java program to iterate a linked list in reverse order 
(using objlist.descendingIterator())
*/

package com.lab;

import java.util.*;

public class p7 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        // Reverse iteration using descendingIterator()
        Iterator<String> iterator = ls.descendingIterator();

        System.out.println("Reverse Order:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}