/*
Write a Java program to iterate through all elements in a linked list 
starting at the specified position (2nd) using iterator 
(hint: Iterator iteratorobj = listobj.listIterator(1))
*/

package com.lab;

import java.util.*;

public class p6 {

    public static void main(String[] args) {

        List<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        // Start iteration from 2nd position (index 1)
        Iterator<String> iterator = ls.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}