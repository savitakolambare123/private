import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap stores data in sorted order by key
        Map<Integer, String> students = new TreeMap<>();
        Map<Integer, String> employees = new TreeMap<>();
        Map<Integer, String> patients = new TreeMap<>();

        // Adding sample data
        students.put(103, "Charlie");
        students.put(101, "Alice");
        students.put(102, "Bob");

        employees.put(203, "Frank");
        employees.put(201, "David");
        employees.put(202, "Eva");

        patients.put(302, "Hannah");
        patients.put(301, "George");
        patients.put(303, "Irene");

        // Displaying data in sorted order by key
        System.out.println("Students (Sorted by ID):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nEmployees (Sorted by ID):");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nPatients (Sorted by ID):");
        for (Map.Entry<Integer, String> entry : patients.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
