package b09.b3;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(", World!");
        System.out.println("Appended String: " + sb.toString());

        // Insert
        sb.insert(5, " Java");
        System.out.println("Inserted String: " + sb.toString());

        // Replace
        sb.replace(6, 10, "C++");
        System.out.println("Replaced String: " + sb.toString());

        // Delete
        sb.delete(6, 10);
        System.out.println("Deleted String: " + sb.toString());

        // Reverse
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());

        // Length and Capacity
        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);
    }
}

