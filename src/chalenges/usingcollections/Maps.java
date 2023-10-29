package chalenges.usingcollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Gabriel");
        names.put(10, "Graziela");
        names.put(100, "Gutemberg");
        names.put(1000, "Gamaliel");

        System.out.println(names.keySet());
        System.out.println(names.values());
        System.out.println(names.entrySet());

        for(int key: names.keySet()){
            System.out.println(key);
        }

        for(String value: names.values()){
            System.out.println(value + "!!!");
        }

        for(Map.Entry<Integer, String> keyValue: names.entrySet()){
            System.out.println(keyValue);
        }

    }
}
