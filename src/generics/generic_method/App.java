package generics.generic_method;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Data data = new Data();
        data.printListData(list);

        List<String> listStr = new ArrayList<>();
        listStr.add("One");
        listStr.add("Two");
        listStr.add("Three");
        listStr.add("Four");
        data.printListData(listStr);

        String[] strArr = {"A", "B", "C"};
        data.printArrayData(strArr);

        Double[] doubleArr = {1.5, 2.5, 3.5};
        data.printArrayData(doubleArr);
    }
}
