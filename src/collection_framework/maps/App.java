package collection_framework.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(3, "Yun");
        students.put(1, "Ghim");
        students.put(2, "Wang");
        students.put(5, "Yi");
        students.put(4, "Shim");
        students.put(7, "Namgung");

//        System.out.println(students.get(2)); // search value by key

//        for(Map.Entry<Integer, String> entry : students.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

//        for(Integer key : students.keySet())
//            System.out.println(key+":"+students.get(key));

        Iterator<Map.Entry<Integer, String>> entry = students.entrySet().iterator();

        while(entry.hasNext())
            System.out.println(entry.next());
    }
}
