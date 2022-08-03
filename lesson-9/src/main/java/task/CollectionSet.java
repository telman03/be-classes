package task;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Jim");
        names.add("Alex");
        names.add("Sergio");
        names.add("Alex");
        System.out.println(names.size());
        System.out.println(names);
        names.forEach(x -> System.out.println(x));
    }
}
