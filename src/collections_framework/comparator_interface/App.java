package collections_framework.comparator_interface;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// With comparator, we can have custom type of comparison.

public class App {
    public static void main(String[] args) {
        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                // Here we can make our custom logic.
                if(obj1.getKey() < obj2.getKey())
                    return -1;
                else if(obj1.getKey() > obj2.getKey())
                    return 1;
                else
                    return 0;
            }
        };

        Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                // Here we can make our custom logic.
                if(obj1.getValue().length() < obj2.getValue().length())
                    return -1;
                else if(obj1.getValue().length() > obj2.getValue().length())
                    return 1;
                else
                    return 0;
            }
        };

        // Set<Data> set = new LinkedHashSet<>();
        Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_NAME_LENGTH);

        set.add(new Data<Integer, String>(1, "Dostoevsky"));
        set.add(new Data<Integer, String>(5, "Kundera"));
        set.add(new Data<Integer, String>(9, "Ghim"));
        set.add(new Data<Integer, String>(2, "Yasunari"));
        set.add(new Data<Integer, String>(5, "Osamu"));

        for(Data<Integer, String> element : set)
            System.out.println(element);
    }
}
