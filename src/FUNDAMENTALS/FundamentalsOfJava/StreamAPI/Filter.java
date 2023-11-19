package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println; //um consumer só pra facilitar o print...

        //Criamos uma stream diretamente...
        Stream<String> names = Arrays.asList("Lia", "Bia", "Ana", "Gui", "August").stream();

        //Gerando um valor booleano por através de um Predicate...
        Predicate<String> onlyA = n -> n.charAt(0) == 'A' ? true : false;
        UnaryOperator<String> isA = n -> n + " passed because your name starts with the letter A";

        names.filter(onlyA)
                .map(isA)
                .forEach(println);
    }
}

//      FILTERS
/*
 *       O "filter" é um dos métodos que podem ser usados a partir de uma instância de Stream. O papel de
 *       filter, como o próprio nome diz, é filtrar os valores de uma stream devolvendo uma outra stream
 *       somente com a quantidade de valores que atenderem a condicional do filter.
 *
 *       Por exemplo se você quiser saber somente a quantidade de alunos que passou na prova, ou quiser
 *       somente os preços dos produtos que forem maiores que mil reais, o filter é a escolha certa.
 *
 *       O filter faz parte do que chamamos de "intermediaries operations", que são métodos das streams que
 *       tem por objetivo receber uma stream e retornar outra stream operada, o que permite a "composição
 *       de métodos" (métodos sendo operados um atrás do outro).
 *
 *       Filters devem receber como parãmetro uma Function, Functional Interface ou Lambda que tenha como
 *       retorno um valor booleano e retornarão somente os valores da stream que passarem no teste.
 *       Lembrando que elas irão fazer uma operação por vez para cada valor de acordo com a implementação
 *       da função.
 *
 *
 *       CARACTERÍSTICAS DE FILTER:
 *
 *          *    Recebem uma stream de valores e devolve outra stream somente com os valores que passaram
 *               pelo filter;
 *
 *          *    São "intermediaries operations", podem ser encadeadas numa composição de métodos da
 *               stream;
 *
 *          *    Têm que receber como parâmetros uma Function, Functional Interface ou Lambda que retorne
 *               um valor booleano;
 *
 *          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
 *               numa interface ou classe que não poderia ser instanciada, gerando um melhor
 *               reaproveitamento de código e código mais limpo;
 *
 * */
