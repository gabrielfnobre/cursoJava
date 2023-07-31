package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.HighOrderFunctions.AboutFunction;

import java.util.function.Function;

public class AboutFunction {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = n -> n % 2 == 0 ? "even" : "odd";

    }
}
