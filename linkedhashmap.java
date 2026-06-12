import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap preserves insertion order
        Map<Integer, String> students = new LinkedHashMap<>();
        Map<Integer, String> employees = new LinkedHashMap<>();
        Map<Integer, String> patients = new LinkedHashMap<>();

        // Adding sample data
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        employees.put(201, "David");
        employees.put(202, "Eva");
        employees.put(203, "Frank");

        patients.put(301, "George");
        patients.put(302, "Hannah");
        patients.put(303, "Irene");

        // Displaying data in insertion order
        System.out.println("Students (Insertion Order):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nEmployees (Insertion Order):");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("\nPatients (Insertion Order):");
        for (Map.Entry<Integer, String> entry : patients.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
