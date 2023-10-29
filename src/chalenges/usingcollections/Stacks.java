package chalenges.usingcollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();

        names.add("Gabriel");
        names.add("Graziela");
        names.add("Gutemberg");
        names.add("Gamaliel");

        System.out.println(names.peek());
        names.remove();

        System.out.println(names.peek());
        names.poll();

        System.out.println(names.peek());
        names.pop();

        System.out.println(names);


    }
}
