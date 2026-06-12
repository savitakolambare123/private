import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // Using TreeSet to store unique elements with natural sorting
        Set<String> names = new TreeSet<>();

        // Adding elements (duplicates will be ignored automatically)
        names.add("Rajeshree");
        names.add("Anita");
        names.add("Bhavesh");
        names.add("Anita");   // duplicate
        names.add("Kiran");
        names.add("Zoya");

        // Displaying elements (sorted naturally, duplicates removed)
        System.out.println("Unique names in natural sorted order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
