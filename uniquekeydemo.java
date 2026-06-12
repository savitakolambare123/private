import java.util.*;

public class UniqueDataDemo {
    public static void main(String[] args) {
        // Using HashMap to store unique key-value pairs
        Map<Integer, String> students = new HashMap<>();

        // Adding data (duplicate keys will overwrite old values)
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(102, "David"); // duplicate key, replaces "Bob"

        // Displaying data (only unique keys remain)
        System.out.println("Students (Unique IDs):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
