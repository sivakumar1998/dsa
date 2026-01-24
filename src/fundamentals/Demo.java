package fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Alice", 1); // logically equal to p1

        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
        System.out.println("hashCodes equal? -> " + (p1.hashCode() == p2.hashCode()));

        Map<Person, String> map = new HashMap<>();
        map.put(p1, "first");

        System.out.println("map.get(p2) -> " + map.get(p2));           // likely null
        System.out.println("map.containsKey(p2) -> " + map.containsKey(p2)); // likely false

        map.put(p2, "second"); // will insert a second entry because HashMap thinks different
        System.out.println("map size -> " + map.size()); // 2 unexpectedly
        System.out.println("map -> " + map);
    }
}
