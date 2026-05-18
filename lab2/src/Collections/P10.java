package Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
2. Include the following elements into the LinkedHashMap called programminglanguages 
and print all of them:

("Java", 1995), ("Python", 1991), ("JavaScript", 1995), ("C++", 1985)
*/

public class P10 {

    public static void main(String[] args) {

        Map<String, Integer> programminglanguages = new LinkedHashMap<>();

        programminglanguages.put("Java", 1995);
        programminglanguages.put("Python", 1991);
        programminglanguages.put("JavaScript", 1995);
        programminglanguages.put("C++", 1985);

        System.out.println("Programming Languages: " + programminglanguages);
    }
}