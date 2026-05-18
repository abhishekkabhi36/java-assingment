/*
Write a Java program to insert the specified element at the end of a linked list
(using l_listobj.offerLast("Pink"))
*/

package com.lab;

import java.util.*;

public class p8 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        // Insert element at the end using offerLast()
        ls.offerLast("Pink");

        System.out.println("After inserting at end: " + ls);
    }
}