package chalenges.FunctionalnterfacesOfJava;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChalengeOfFunctionalInterfaces {
    public static void main(String[] args) {

        Product p = new Product("iPad", 3235.89, 0.13);

        BinaryOperator<Double> realPrice = (price, discount) -> price * (1 - discount);
        UnaryOperator<Double> municipalTax = price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> freight = price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round = price -> (double) Math.round(price);
        Function<Double, String> priceFormated = price -> String.format("R$ %.2f", price).replace(".", ",");

        String finalResult = realPrice
                .andThen(municipalTax)
                .andThen(freight)
                .andThen(round)
                .andThen(priceFormated)
                .apply(p.price, p.discount);

        System.out.println(finalResult);

    }
}
