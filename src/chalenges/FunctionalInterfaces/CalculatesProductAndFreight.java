package chalenges.FunctionalInterfaces;

/*  Esse exercício tem como objetivo exercitar a composição de funções usando diversas functional interfaces.
*   A missão dele é:
*   Pegar um produto instanciado, o produto tem que ter Preço, Nome e Desconto.
*   As etapas são:
*       - Uma função que calcula o preço com desconto (preço real);
*       - Uma função que verifica se um produto deverá ter acrescimo de imposto municipal (se for mais caro
*           que R$ 2.500,00 tem que ter o imposto de 8,5%;
*       - Uma função que verifica que calcula o preço de frete, se o produto for mais caro que R$ 3.000,00
*           o frete é de R$ 100,00 se for menor que R$ 3.000,00 o frete é R$ 50,00;
*       - Depois uma função que formata para esse formato aqui: "R$ 0000,00";
* */

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class CalculatesProductAndFreight {
    public static void main(String[] args) {

        Product ciment = new Product("Ciment", 3000.0, 5);

        BinaryOperator<Double> realPrice = (price, discount) -> price - (price * discount);
        Function<Double, Double> municipalDiscount = (price) -> price >= 2500 ? price + (price * .085) : price;
        Function<Double, Double> freight = (price) -> price >= 3000 ? price + 100 : price + 50;
        Function<Double, String> twoDecimalSlots = n -> {
            DecimalFormat df = new DecimalFormat("#.##");
            String formatedNumber = "R$ " + df.format(n);
            return formatedNumber;
        };


        System.out.println(realPrice
                .andThen(municipalDiscount)
                .andThen(freight)
                .andThen(twoDecimalSlots)
                .apply(ciment.getPrice(), ciment.getDiscount()));
        System.out.println(5.0 / 100.0);

    }
}
