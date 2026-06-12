import java.util.*;

public class PolymorphismDemo {
    // Polymorphic method: works with any List implementation
    public static void addUsers(List<String> list) {
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
    }

    // Polymorphic method: display elements
    public static void displayUsers(List<String> list) {
        System.out.println("Users in " + list.getClass().getSimpleName() + ":");
        for (String user : list) {
            System.out.println(user);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        addUsers(arrayList);
        displayUsers(arrayList);

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        addUsers(linkedList);
        displayUsers(linkedList);

        // Using Vector
        List<String> vectorList = new Vector<>();
        addUsers(vectorList);
        displayUsers(vectorList);
    }
}
