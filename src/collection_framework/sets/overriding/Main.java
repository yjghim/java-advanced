package collection_framework.sets.overriding;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        hs.add(new Student("Ghim", "Korea"));
        hs.add(new Student("Ghim", "Korea"));
        hs.add(new Student("Wang", "Korea"));

        System.out.println(hs.size()); // 2
    }
}
