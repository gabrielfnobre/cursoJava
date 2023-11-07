package chalenges.FunctionalnterfacesOfJava;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        BinaryOperator<Double> exampleWithDouble = (a, b) -> a * b;
        System.out.println(exampleWithDouble.apply((double) 4, (double) 6)); // is necessary in this case because int don't converts to Double...

        BinaryOperator<String> exampleWithString = (a, b) -> a + ", meu nome é " + b;
        System.out.println(exampleWithString.apply("Oi", "Gabriel"));

    }
}
