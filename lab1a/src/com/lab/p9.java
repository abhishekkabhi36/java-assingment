/*
Write a Java program to display elements and their positions in a linked list 
(using l_listobj.get(p))
*/

package com.lab;

import java.util.*;

public class p9 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Display elements with their positions
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Position: " + i + " Value: " + ls.get(i));
        }
    }
}