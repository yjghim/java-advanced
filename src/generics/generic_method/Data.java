package generics.generic_method;

import java.util.List;

public class Data {
    public <E> void printListData(List<E> list) {
        for(E element : list)
            System.out.println(element);
    }

    public <E> void printArrayData(E[] arr) {
        for(E element : arr)
            System.out.println(element);
    }
}