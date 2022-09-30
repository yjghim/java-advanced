package generics.wild_card;

import java.util.ArrayList;
import java.util.List;

public class App {
//    public static void display(List<?> list) {
//        for(Object element : list)
//            System.out.println(element);
//    }

    public static void display(List<? super Car> list) {
        for(Object element : list)
            System.out.println(element);
    }

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));

        list.add(new Car(14, "Genesis"));

        display(list);
    }
}
