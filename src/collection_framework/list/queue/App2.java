package collection_framework.list.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App2 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayBlockingQueue<>(5);

        System.out.println(q.poll()); //null
        System.out.println(q.peek()); //null

        System.out.println(q.offer(1));
        System.out.println(q.offer(2));
        System.out.println(q.offer(3));
        System.out.println(q.offer(4));
        System.out.println(q.offer(5));
        System.out.println(q.offer(6)); // false

        for(Integer num : q)
            System.out.println(num);

        q.poll();
        System.out.println("poll() is done.");

        for(Integer num : q)
            System.out.println(num);

        System.out.println(q.peek());
    }
}
