package collection_framework.list.list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {

    /*
    ArrayList, LinkedList, Stack are child classes of List class.
    By doing this, we are able to handle all type of list.
     */

    public static void showAll(List<String> list) {
        for(String element : list)
            System.out.println(element);
    }

    public static void main(String[] args) {
        // List<String> colors = new LinkedList<>();
        // colors.add("red");
        // colors.add("blue");
        // colors.add("black");
        // colors.add("white");

        List<String> shapes = new ArrayList<>();
        shapes.add("circle");
        shapes.add("triangle");

        showAll(shapes);
    }
}

