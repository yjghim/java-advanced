package collection_framework.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapIterator {
    public static void main(String[] args) {
        Map<Integer, String> tm = new HashMap<>();

        tm.put(3, "Wang");
        tm.put(1, "Ghim");
        tm.put(2, "Yun");

        Iterator<Integer> integerIterator = tm.keySet().iterator();
        while(integerIterator.hasNext())
            System.out.println(tm.get(integerIterator.next()));
    }
}
