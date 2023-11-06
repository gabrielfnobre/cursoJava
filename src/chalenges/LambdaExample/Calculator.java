package chalenges.LambdaExample;

public class Calculator {
    public static void main(String[] args) {

        ExpressionCalc sum = (a, b) -> {return a + b;};
        ExpressionCalc multiple = (a, b) -> a * b;

        System.out.println(sum.execute(2, 6));
        System.out.println(multiple.execute(2, 6));

    }
}
