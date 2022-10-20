package collection_framework.sets;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();

        ts.add(90);
        ts.add(50);
        ts.add(10);
        ts.add(80);

        for(Integer i : ts)
            System.out.println(i);
        // The data is sorted and stored.
    }
}
