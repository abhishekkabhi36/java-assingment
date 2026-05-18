/*
3a. Develop a Java program for performing various string operations with different 
string handling functions directed as follows:

String Creation and Basic Operations, Length and Character Access, 
String Comparison, String Searching, Substring Operations, 
String Modification, Whitespace Handling, String Concatenation, 
String Splitting, StringBuilder Demo, String Formatting, 
Validate Email with contains() and startsWith() and endsWith()
*/

package String_Functions;

public class StringHandlingDemo {

    public static void main(String[] args) {

        // Basic String Creation
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 4: " + str1.charAt(4));

        // String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // String Searching
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // Substring Operations
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring (7): " + str1.substring(7));
        System.out.println("Substring (0,5): " + str1.substring(0, 5));

        // String Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // Whitespace Handling
        System.out.println("\n=== Whitespace Handling ===");
        String spaced = "   Example   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // String Concatenation
        System.out.println("\n=== String Concatenation ===");
        String a = "Hello";
        String b = "World";
        System.out.println("Using + : " + a + " " + b);
        System.out.println("Using concat(): " + a.concat(" ").concat(b));

        // String Splitting
        System.out.println("\n=== String Splitting ===");
        String csv = "Java,Python,C++";
        String[] arr = csv.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // StringBuilder Demo
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("After append: " + sb);
        sb.insert(5, "Core ");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // String Formatting
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(formatted);

        // Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        boolean isValid = email.contains("@") &&
                          email.contains(".") &&
                          email.startsWith("user") &&
                          email.endsWith(".com");

        System.out.println("Email: " + email);
        System.out.println("Valid: " + isValid);
    }
}