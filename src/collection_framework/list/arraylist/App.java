package collection_framework.list.arraylist;

import java.util.ArrayList;

public class App {
    static ArrayList<String> countries = new ArrayList<>();

    public static void showAll(ArrayList<String> ar) {
        for(String str : ar)
            System.out.println(str);
    }

    public static void main(String[] args) {
        countries.add("South Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Germany");
        countries.add("England");
        countries.add("France");
        // 1. Insert

        // System.out.println(countries.get(0));
        // 2. Select

        // countries.remove("China");
        // countries.remove(2); // Germany
        // 3. Delete

        // countries.set(0, "Korea");
        // 4. Modify

        // countries.indexOf("South Korea");
        // 5. Search: It returns -1 if the specific value is not found.

        showAll(countries);
    }
}
