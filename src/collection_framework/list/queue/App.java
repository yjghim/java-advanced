package collection_framework.list.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayBlockingQueue<>(5);

        try {
            q.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty!");
        }

        try {
            q.add(100);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
        } catch (IllegalStateException e) {
            System.out.println("Queue is full!");
        }

//        for(Integer num : q)
//            System.out.println(num);

        System.out.println(q.element()); // 100 (the first element of q)

        q.remove(); // remove 100
        System.out.println(q.element()); // 2 (the second element of q)
    }
}
