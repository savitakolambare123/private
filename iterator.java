import java.util.*;

public class UserApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // Adding users
        users.add(new User("Alice", 25));
        users.add(new User("Bob", 30));
        users.add(new User("Charlie", 28));

        // Retrieve using Iterator
        System.out.println("Forward traversal using Iterator:");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Retrieve using ListIterator (forward + backward)
        System.out.println("\nForward traversal using ListIterator:");
        ListIterator<User> listIterator = users.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nBackward traversal using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
