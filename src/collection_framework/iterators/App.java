package collection_framework.iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void showAll(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        showAll(languages);
    }
}
