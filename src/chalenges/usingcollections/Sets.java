package chalenges.usingcollections;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {

        HashSet randonSet = new HashSet();
        randonSet.add('1');
        randonSet.add('2');
        randonSet.add('3');

        System.out.println(randonSet);

        randonSet.remove('2');
        System.out.println(randonSet);

        HashSet<Integer> homoSet = new HashSet<>();

        homoSet.add(34);
        homoSet.add(52);
        homoSet.add(64);

        System.out.println(homoSet);

        homoSet.remove(34);
        System.out.println(homoSet);

    }
}
