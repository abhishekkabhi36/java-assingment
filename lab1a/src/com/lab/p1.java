/*
Write a Java program for getting different colors through ArrayList interface 
and search whether the color "Red" is available or not.

(Hint: Use ArrayListObj.contains())
*/

package com.lab;

import java.util.*;

public class p1 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");

        System.out.println(ls);

        // Checking if "Red" is present
        if (ls.contains("Red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}