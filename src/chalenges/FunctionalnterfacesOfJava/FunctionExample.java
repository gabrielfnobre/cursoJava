package chalenges.FunctionalnterfacesOfJava;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Function<T,R>
        Function<Integer, String> isPair = num -> num % 2 == 0 ? "pair" : "odd";
        Function<String, String> talkResult = expression -> "The number is " + expression;
        Function<String, String> excited = expression -> expression + "!!!";

        String finalResult = isPair
                .andThen(talkResult)
                .andThen(excited)
                .apply(32);

        System.out.println(finalResult);

    }
}
