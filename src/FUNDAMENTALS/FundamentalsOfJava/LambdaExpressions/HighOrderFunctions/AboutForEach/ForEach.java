package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.HighOrderFunctions.AboutForEach;

// FOR EACH PARA LAMBDAS:

/*  Nas collections como List, Set e Map existe uma função de ordem superior para trabalhar com lambdas
*   chamada "forEach". Ela permite que iteremos sobre os elementos de uma collection e apliquemos um bloco de
*   código (lambda) para cada um dos elementos da collection.
*
*   Essa high-order function é muito mais prática do que usar o forEach tradicional. Além disso, podemos
*   deixá-la ainda mais enxuta usando "method reference".
*
*   Vejamos um exemplo e comparativo entre o forEach tradicional e o high-ordem function das collections...
* */

import java.util.Arrays;
import java.util.List;
public class ForEach {
    public static void main(String[] args) {

        //Aqui temos o método tradicional e mais verboso:
        List<String> approveds = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Tradicional for each:");
        for(String name: approveds){
            System.out.println(name);
        }
        System.out.println();

        //Aqui temos o método usando lambda, bem menos verboso:
        System.out.println("Using Lambda #01:");
        approveds.forEach(name -> System.out.println(name)); //O método aceita uma lambda como objeto...
        System.out.println();

        //Aqui temos o método usando "method reference", menos verboso ainda:
        System.out.println("Using lambda #02 with \"method reference:\"");
        approveds.forEach(System.out::println); //Nem mesmo é necessário atribuir o elemento da list sobre
                                                //uma variável, o method reference já sabe que deve executar
    }                                           //o println sobre todos os elementos da list...
}
