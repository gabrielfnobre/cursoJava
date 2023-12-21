package StreamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println; //um consumer só pra facilitar o print...

        //Criamos uma stream diretamente...
        Stream<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        Predicate<Integer> isSeven = n -> n <= 7; //compara se os números são iguais menores ou iguais a 7

        names.takeWhile(isSeven).forEach(println); //enquanto os números forem menores ou igual a 7 ele vai iterar
    }
}

//      TAKEWHILE
/*
*       O "takeWhile" é um dos métodos que podem ser usados a partir de uma instância de Stream. O papel de
*       takeWhile, como o próprio nome diz, é fazer com que uma iteração aconteça somente até que uma
*       condicional não seja satisfeita. A partir do momento que essa condicional não é mais satisfeita o
*       "takeWhile" interrompe a iteração.
*
*       Por exemplo se você quiser que todos os números de uma stream sejam somados por 1 até que um
*       determinado número seja encontrado, o "takeWhile" é o método certo para você.
*
*       O "takeWhile" faz parte do que chamamos de "intermediaries operations", que são métodos das streams
*       que tem por objetivo receber uma stream e retornar outra stream operada, o que permite a "composição
*       de métodos" (métodos sendo operados um atrás do outro).
*
*       O "takeWhile" precisa receber uma função que deverá retornar um boolean, enquanto esse boolean não
*       retornar false a iteração vai acontecer, no momento que retornar false, o "takeWhile" interrompe o
*       laço, as demais operações encadeadas continuam acontecendo.
*
*
*       CARACTERÍSTICAS DE TAKEWHILE:
*
*          *    Recebem uma stream de valores e devolve outra stream com os valores operados;
*
*          *    São "intermediaries operations", podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Recebe como parâmetro uma function, functional interface ou lambda que deverá
*               retornar um valor boolean;
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
* */
