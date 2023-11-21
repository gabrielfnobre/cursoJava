package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Matches {
    public static void main(String[] args) {

        List<Double> grades = Arrays.asList(7.1, 6.2, 8.5, 9.0);

        Predicate<Double> isBiggerThan7 = n -> n >= 7; //compara se os valores são maiores que 7...

        System.out.println(grades.stream().allMatch(isBiggerThan7)); //Nem todos são maiores que 7...

        System.out.println(grades.stream().anyMatch(isBiggerThan7)); //Alguns são maiores que 7...

        System.out.println(grades.stream().noneMatch(isBiggerThan7)); //Não são todos que são maiores que 7...
    }
}

//      MATCHES
/*
*       Os métodos "match" são métodos que podem ser usados a partir de uma instância de Stream. O papel
*       dos métodos match, como o próprio nome diz, é fazer combinações entre os valores de uma stream
*       procurando por combinações.
*
*       Por exemplo, se você quiser saber se dentro da stream alguns valores combinam com determinado
*       critério, ou se todos os valores ou nenhum combina.
*
*       Os métodos "match" recebem como parâmetro uma função que deve retornar um valor booleano, essa
*       função é comparada entre todos os valores da stream e será devolvido um resultado de acordo com
*       o comportamento do método match que foi usado.
*
*       Os métodos matches são os seguintes:
*
*           "allMatch" - esse método compara se todos os valores atendem ao critério da função;
*
*           "anyMatch" - esse método compara se algum valor atendeu ao critério da função;
*
*           "noneMatch" - esse método compara se nenhum valor atendeu ao critério da função;
*
*       Os métodos match fazem parte do conjunto de "terminal operations", onde o retorno será um valor
*       único, e não uma stream. Portanto, eles não podem ser operados de forma encadeada (composição
*       de métodos) como acontece com as intermediaries operations.
*
*
*       CARACTERÍSTICAS DOS MÉTODOS MATCH:
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
**/
