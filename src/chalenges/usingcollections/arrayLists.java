package chalenges.usingcollections;

import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gabriel");
        names.add("Graziela");
        names.add("Gutemberg");

        System.out.println(names.get(2));
        System.out.println(names.get(1));
        System.out.println(names.get(0));

        System.out.println(names.size());

        names.remove(2);
        System.out.println(names.size());

        System.out.println(names);


    }
}
