package generics.basic_concept.application;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void showAll(List<Data> list) {
        ListIterator iterator = list.listIterator();

        while(iterator.hasNext())
            System.out.println(iterator.next().toString());
    }

    public static void main(String[] args) {
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Ghim"));
        elements.add(new Data(1996));
        elements.add(new Data(173.5));
        elements.add(new Data(3.5f));

        showAll(elements);
    }
}
