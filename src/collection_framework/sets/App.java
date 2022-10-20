package collection_framework.sets;

import java.util.Set;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("DDD");
        set.add("EEE");
        System.out.println(set.add("AAA")); // return false

        for(String name : set)
            System.out.println(name);
        /*
        1. The multiple entry of AAA is removed.
        2. The sequence of the output might be changed.
        3. Sets are usually more memory efficient compared to list.
         */

        System.out.println(set.contains("FFF"));
    }
}
