package collections_framework.comparable_interface;

import java.util.*;

public class App {
    public static void showAll(List<Name> list) {
        ListIterator iterator = list.listIterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
            // We have to override the toString method.
    }

    public static void main(String[] args) {
        List<Name> names = new LinkedList<>();
        names.add(new Name("Ghim"));
        names.add(new Name("Kim"));

        Collections.reverse(names);

        showAll(names);
    }
}
