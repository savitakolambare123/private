import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store paired data (ID → Name)
        Map<Integer, String> students = new HashMap<>();
        Map<Integer, String> employees = new HashMap<>();
        Map<Integer, String> patients = new HashMap<>();

        // Add sample data
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        employees.put(201, "David");
        employees.put(202, "Eva");
        employees.put(203, "Frank");

        patients.put(301, "George");
        patients.put(302, "Hannah");
        patients.put(303, "Irene");

        // Retrieve and display data (random order due to HashMap)
        System.out.println("Students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nEmployees:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nPatients:");
        for (Map.Entry<Integer, String> entry : patients.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
