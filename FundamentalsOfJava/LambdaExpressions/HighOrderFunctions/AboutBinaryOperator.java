package LambdaExpressions.HighOrderFunctions;

//  SOBRE BINARYOPERATOR:

/*  O BinaryOperator é mais uma das functional interfaces do java.util.function. Essa functional interface tem a missão
*   de operar uma lambda que recebe 2 valores e retorna apenas 1, com a observação de tanto os valores de entrada como
*   o valor de saída têm que ser do mesmo tipo.
*
*   Diferente de outras functional interfaces, o BinaryOperation não é muito apropriado para ser usado de forma
*   composta, pois como ele recebe 2 parâmetros e retorna apenas 1, é muito difícil de usarmos ela em composição.
*
*   Para darmos start a lambda, temos que usar o método apply.
*
*   Vejamos um exemplo disso...
* */

import java.util.function.BinaryOperator;
public class AboutBinaryOperator {
    public static void main(String[] args) {

        BinaryOperator<Double> averageBetweenTwoMarks = (n1, n2) -> (n1 + n2) / 2;  //Essa é a sintaxe, do
                                                                                    // BinaryOperator, como tanto seus
                                                                                    //parâmetro quanto seu retorno
                                                                                    //possuem o mesmo tipo de retorno
                                                                                    //Ele só precisa receber um tipo de
                                                                                    //dado no generics...

        System.out.println(averageBetweenTwoMarks.apply(5.3, 6.4)); //Usando o apply, damos start functional
        System.out.println(averageBetweenTwoMarks.apply(8.7, 7.5)); //interface...
        System.out.println(averageBetweenTwoMarks.apply(9.5, 8.4));

    }
}
