package collections_framework.sorting_and_reversal;

import java.util.*;

public class App {
    public static void showAll(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Brand");
        words.add("Appreciation");
        words.add("Dangerous");
        words.add("Chilly");

        // We can order elements which are primitive data type easily.

        // 1. sorting
        words.sort(null);
        showAll(words);

        // 2. reversal
        Collections.reverse(words);
        showAll(words);
    }
}
