import java.util.*;

public class UserApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 25));
        users.add(new User("Bob", 30));
        users.add(new User("Charlie", 28));
        users.add(new User("David", 22));

        // 🔹 Iterator traversal
        System.out.println("Forward traversal using Iterator:");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 🔹 ListIterator traversal (forward + backward)
        System.out.println("\nForward traversal using ListIterator:");
        ListIterator<User> listIterator = users.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nBackward traversal using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // 🔹 Custom Sorting by Age
        System.out
