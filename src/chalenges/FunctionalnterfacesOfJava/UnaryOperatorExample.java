package chalenges.FunctionalnterfacesOfJava;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        //UnaryOperator<T and R> is necessary only one parameter to entry...
        UnaryOperator<Integer> addTwo = n -> n + 2;
        UnaryOperator<Integer> multiplyByTwo = n -> n * 2;
        UnaryOperator<Integer> toSquare = n -> n * n;

        Integer finalResult = addTwo
                .andThen(multiplyByTwo)
                .andThen(toSquare)
                .apply(0);
        System.out.println(finalResult);

        Integer finalResult2 = toSquare
                .compose(multiplyByTwo) //using compose the methods must be in reverse...
                .compose(addTwo)
                .apply(0);
        System.out.println(finalResult2);

    }
}
