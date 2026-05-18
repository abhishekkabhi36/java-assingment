package Collections;
import java.util.Map;
import java.util.TreeMap;

/*
2. Write a Java program to search for keys C4 and C5 are present or not 
in the following TreeMap:

("C1", "Red"), ("C2", "Green"), ("C3", "Black"), ("C4", "White")
*/

public class p6 {

    public static void main(String[] args) {

        Map<String, String> map1 = new TreeMap<>();

        map1.put("C1", "Red");
        map1.put("C2", "Green");
        map1.put("C3", "Black");
        map1.put("C4", "White");

        System.out.println("Whether it contains C4 or not: " + map1.containsKey("C4"));
        System.out.println("Whether it contains C5 or not: " + map1.containsKey("C5"));
    }
}