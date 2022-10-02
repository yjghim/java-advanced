package collections_framework.sets.set_types;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        for(int i=30; i>0; i--)
            set.add(i);

        for(int num : set)
            System.out.println(num);
    }
}
