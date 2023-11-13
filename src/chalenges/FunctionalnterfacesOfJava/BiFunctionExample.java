package chalenges.FunctionalnterfacesOfJava;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        //BiFunction<T, U, R> two parameters to entries and one to return, all different
        BiFunction<Double, Double, String> calAverage =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Approved" : "Disapproved";

        System.out.println(calAverage.apply(9.8, 5.1));
        System.out.println(calAverage.apply(9.8, 4.1));

    }
}
