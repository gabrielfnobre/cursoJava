package chalenges.OtherLambdaExample;

import java.util.Objects;

public class UsingLambdas {
    public static void main(String[] args) {

        Lambdas usingFunctionalInterface = (a, b) -> a * b;
        System.out.println(usingFunctionalInterface.calculator(5, 2));

        Lambdas usingDefault = usingFunctionalInterface;
        System.out.println(usingDefault.calcSquare(9));
        System.out.println(usingFunctionalInterface.calcSquare(9));

        Lambdas.aMethodStatic1();
        Lambdas.aMethodStatic2();

    }
}
