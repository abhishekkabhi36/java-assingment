/*
Write a Java program that swaps two elements (first and third elements) 
in a linked list (using Collections.swap(l_list, 0, 2))
*/

package com.lab;

import java.util.*;

public class p10 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Before swapping:");
        System.out.println(ls);

        // Swap 1st and 3rd elements → index 0 and 2
        Collections.swap(ls, 0, 2);

        System.out.println("After swapping:");
        System.out.println(ls);
    }
}