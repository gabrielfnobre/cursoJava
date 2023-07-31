package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.HighOrderFunctions.AboutFunction;

//  SOBRE FUNCTION:

/*  Function é mais uma das functional interfaces da biblioteca java.util.Function. A missão de Function é
*   gerar uma interface que seja capaz de receber um parâmetro de um tipo qualquer e retorna um valor que
*   pode ser do mesmo tipo ou de outro tipo qualquer.
*
*   Function é muito útil quando desejamos fazer operações sobre listas onde desejamos retornar um determinado
*   valor dependendo do tipo ou valor que estiver na lista. Por exemplo, imagine que temos uma lista de
*   clientes em string e desejamos retornar os valores que eles gastaram, mas queremos o retorno em Double.
*   A functional interface Function é perfeita para isso.
*
*   Function possuí 2 métodos mais usuais, que são:
*
*       # apply - Para quando queremos aplicar uma Function;
*
*       # andThen - Quando queremos que uma outra function seja chamada após a primeira function ter sido
*                   executada. Podemos fazer uma composição de functions, chamando uma após a outra com a
*                   ajuda do "andThen";
*
*   Vejamos um exemplo onde queremos encontrar os valores par e ímpar em uma lista e queremos retornar
*   resultados diferentes dependendo se o valor for par ou ímpar...
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AboutFunction {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = n -> n % 2 == 0 ?  n + " is even" : n + " is odd";
            //Function que entra uma string diferente dependendo do resultado se ímpar ou par...

        Function<String, String> sadOrHappyWithResult = str ->
                str.contains("even") ? (":D " + str.toUpperCase() + "!!!") : ("<:C " + str);
            //Essa function pega os valores passados, se tiverem a palavra "even" faz uma coisa, se não tiver
            //faz outra...

        Function<String, String> print = str -> {   //Essa function foi criada só para imprimir, ela
            System.out.println(str);                //possuí um retorno por que as Functions são obrigadas
            return str;                             //a ter um retorno, mas a missão principal dela é imprimir
        };

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        nums.forEach(n -> evenOrOdd.andThen(sadOrHappyWithResult).andThen(print).apply(n));
        //Veja aqui que nós chamamos a primeira function para pegar os valores de "n", só que para fazer
        //a comparação entre os valores ímpar e par nós encadeamos 2 functions, para que elas podeem
        //melhorar o resultado da nossa pesquisa...

    }
}
