package chalenges.usingcollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Gabriel");
        queue.offer("Graziela");
        queue.add("Gutemberg");
        queue.offer("Gamaliel");

        System.out.println(queue);

        System.out.println(queue.peek());
        queue.remove();

        System.out.println(queue.peek());
        queue.remove();

        System.out.println(queue.element());
        System.out.println(queue.element());

        System.out.println(queue);

    }
}
