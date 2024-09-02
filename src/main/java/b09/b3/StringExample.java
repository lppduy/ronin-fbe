package b09.b3;

public class StringExample {
    public static void main(String[] args) {
        // Creating a String
        String str = "Hello, World!";

        // String Length
        int length = str.length();
        System.out.println("Length: " + length);

        // Substring
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);

        // Concatenation
        String concatStr = str.concat(" Welcome to Java.");
        System.out.println("Concatenated String: " + concatStr);

        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        // Convert to Uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);

        // Convert to Lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);

        // Character at Index
        char charAt = str.charAt(1);
        System.out.println("Character at index 1: " + charAt);
    }
}
