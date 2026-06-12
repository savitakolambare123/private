import java.util.*;

public class CollectionOperationsDemo {
    public static void main(String[] args) {
        // STORAGE using ArrayList
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // STORAGE using HashSet (avoids duplicates)
        Set<String> employees = new HashSet<>();
        employees.add("David");
        employees.add("Eva");
        employees.add("Frank");
        employees.add("Eva"); // duplicate ignored

        // STORAGE using HashMap (key-value pairs)
        Map<Integer, String> patients = new HashMap<>();
        patients.put(301, "George");
        patients.put(302, "Hannah");
        patients.put(303, "Irene");

        // RETRIEVAL
        System.out.println("Retrieve student at index 1: " + students.get(1));
        System.out.println("Check if 'Eva' is an employee: " + employees.contains("Eva"));
        System.out.println("Retrieve patient with ID 302: " + patients.get(302));

        // TRAVERSAL
        System.out.println("\nTraversing Students (ArrayList):");
        for (String s : students) {
            System.out.println(s);
        }

        System.out.println("\nTraversing Employees (HashSet):");
        for (String e : employees) {
            System.out.println(e);
        }

        System.out.println("\nTraversing Patients (HashMap):");
        for (Map.Entry<Integer, String> entry : patients.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
