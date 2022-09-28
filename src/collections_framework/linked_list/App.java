package collections_framework.linked_list;

import java.util.LinkedList;

public class App {

    public static void showAll(LinkedList<String> ll) {
        for(String str : ll)
            System.out.println(str);
    }

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Qonju");
        cities.add("Chun-cheon");
        cities.add("Gang-neung");

        cities.add(1, "Hoeng-seong");
        // Insert between elements
        cities.add("Sokcho");
        // Add element
        cities.set(0, "Wonju");
        // Modify the specific element
        cities.remove();
        // Remove the first element
        cities.remove(0);
        // Remove the first element with index

        showAll(cities);
    }
}
