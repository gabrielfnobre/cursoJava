package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        //Criamos uma stream diretamente...
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Gerando uma function para somar os valores do reduce...
        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        //Retornando um valor sem acumulador usando get para atribuir
        int valueTotal = nums.stream().reduce(sum).get(); //Sem acumulador inicial, tem que usar o get e
        System.out.println(valueTotal);             //atribuir sobre uma variável para pegar o valor!!


        //Retornando um valor com acumulador e sem usar get...
        Integer Totalvalue = nums.stream().reduce(100, sum); //Quando um acumulador é passado não
        System.out.println(Totalvalue);                             //precisa usar o get para pegar o
                                                                    // valor!

        //Retornando uma parallel stream com acumulador...
        Integer totalParallelValue = nums.parallelStream().reduce(100, sum); //Quando um parallel
        System.out.println(totalParallelValue);                     //stream possuí acumulador inicial
                                                                    //declarado, ele irá operá-lo sobre
                                                                    //todas as iterações!

        //Usando método ifPresent de Optional...
        Predicate<Integer> isBiggerThan5 = n -> n > 5;
        nums.stream()
                .filter(isBiggerThan5) //Filtra só os maiores que 5 para somá-los no reduce...
                .reduce(sum)
                .ifPresent(println); //Se houver valor, imprime no console o resultado...


        //Usando método ifPresentOrElse de Optional...
        Predicate<Integer> isBiggerThan10 = n -> n > 10;
        nums.stream()
                .filter(isBiggerThan10) //Filtra só os maiores que 10 para somá-los no reduce...
                .reduce(sum)
                .ifPresentOrElse(println,
                        () -> System.out.println("There are not values!"));
                        //Se houver valor, imprime no console o resultado, se não hover imprime
                        //a frase "There are not values!"...

        List<Integer> sentence = Arrays.asList(1, 2, 3);
        Integer resultSentence = sentence.parallelStream()
                .reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> {
                    System.out.println(n1 + 1 + n2 + 1);
                    return n1 + 1 + n2 + 1;
                });
        System.out.println(resultSentence);
    }
}

//      REDUCE
/*
*       O "reduce" é um dos métodos que podem ser usados a partir de uma instância de Stream. O papel do
*       reduce, como o próprio nome diz, é reduzir os valores de uma stream a 1 único valor, mas para
*       isso, o reduce deverá operar sobre todos os valores para devolver 1 único resultado.
*
*       Por exemplo se você quiser saber somente a soma acumulativa de todos valores de uma stream, ou
*       ou quiser concatenar todas as strings dentro de uma stream em 1 único texto, o reduce é a escolha
*       certa.
*
*       O reduce faz parte do que chamamos de "terminal operations", que são métodos das streams que tem
*       por objetivo receber uma stream e retornar um valor final de qualquer tipo primitivo ou tipo
*       wrapper. Diferente das "built operations" e "intermediaries operations", o reduce não permite a
*       "composição de métodos" (métodos sendo operados um atrás do outro), pois o seu resultado final é
*       um valor único e não uma stream.
*
*       Reduces devem receber como parãmetro uma Function, Functional Interface ou Lambda que tenha como
*       objetivo fazer operações acumulativas sobre os valores da stream. Lembrando que elas irão fazer
*       uma operação por vez para cada valor de acordo com a implementação da função.
*
*       Ela também possuí um campo para atribuirmos um valor acumulador inicial, se não receber nada o
*       valor acumulador padrão será zero.
*
*       OBSERVAÇÃO IMPORTANTE!!! Valores acumuladores atribuídos funcionam de formas diferentes em uma
*       stream e uma parallel stream. Na stream o valor acumulador inicial só será contado uma vez
*       durante a iteração de valores, mas na parallel stream, esse valor será contado 1 vez PARA CADA
*       VALOR NA ITERAÇÃO, por exemplo, se você tiver 9 iterações, ele será calculado 9 vezes.
*
*       VALOR OPTIONAL DO REDUCE: Por padrão, o reduce não retorna um valor automaticamente - a menos que
*       um valor inicial seja passado para o acumulador, se for passado algum valor, o reduce saberá que
*       o valor de retorno deverá ser do mesmo tipo que o valor que foi passado no acumulador, por isso
*       ele infere automaticamente qual será o tipo do valor a retornar e por isso o retorno é executado.
*       Caso contrário, o valor final de reduce será retornado como pertencente a uma classe chamada
*       "Optional".
*       A missão dessa classe é nos dar condições de executar uma função á nossa escolha caso o reduce
*       nos traga algum resultado ou não. Para isso essa classe possuí 3 métodos:
*
*           "get" - um método que retorna o valor final do reduce inferindo-o sobre o tipo de variável
*                   que o receberá como valor;
*
*           "ifPresent" - um método que executará a função que lhe for atribuída caso o reduce traga um
*                   resultado final, se não trouxer nada, ele não fará nada;
*
*           "ifPresentOrElse" - um método que recebe 2 funções como parâmetro, caso o reduce traga um
*                   resultado final ele executa a primeira função, caso o reduce não traga resultado
*                   nenhum, ele executa a 2ª função;
*
*
*
*       CARACTERÍSTICAS DE REDUCE:
*
*          *    Recebem uma stream de valores e devolve 1 valor final único que será o resultado da
*               função acumulativa que foi executada sobre todos os valores da stream;
*
*          *    São "terminal operations", não podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Têm que receber como parâmetros uma Function, Functional Interface ou Lambda que retorne
*               um valor acumulativo sobre todos os valores da stream;
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
*          *    Podem receber um parâmetro acumulador opicional, esse valor será acumulado a operação
*               apenas 1 vez no caso das streams e será executado várias vezes no caso das parallel
*               streams (uma vez para cada iteração);
*
*          *    Se o valor acumulador não for declarado, o reduce por padrão não retornará nenhum valor
*               automaticamente. Em vez disse ele retornará um objeto da classe Optional que deverá
*               usar um de seus métodos para retornar um resultado (get, ifPresent ou ifPresentOrElse);
*
**/

