import java.util.*;

class Person implements Comparable<Person> {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by ID
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet stores unique elements in sorted order
        Set<Person> students = new TreeSet<>();
        Set<Person> employees = new TreeSet<>();
        Set<Person> patients = new TreeSet<>();

        // Adding sample data
        students.add(new Person(103, "Charlie"));
        students.add(new Person(101, "Alice"));
        students.add(new Person(102, "Bob"));

        employees.add(new Person(203, "Frank"));
        employees.add(new Person(201, "David"));
        employees.add(new Person(202, "Eva"));

        patients.add(new Person(302, "Hannah"));
        patients.add(new Person(301, "George"));
        patients.add(new Person(303, "Irene"));

        // Displaying data in sorted order by ID
        System.out.println("Students (Sorted by ID):");
        for (Person p : students) {
            System.out.println(p);
        }

        System.out.println("\nEmployees (Sorted by ID):");
        for (Person p : employees) {
            System.out.println(p);
        }

        System.out.println("\nPatients (Sorted by ID):");
        for (Person p : patients) {
            System.out.println(p);
        }
    }
}
