package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println; //um consumer só pra facilitar o print...

        //Criamos uma stream diretamente...
        Stream<String> names = Arrays.asList("Lia", "Bia", "Ana", "Gui").stream();

        //Para exemplificar que maps podem receber Functional Interfaces...
        UnaryOperator<String> firstChar = n -> n.charAt(0) + "";

        names.map(firstChar).map(n -> n + "!!!").forEach(println); //Exemplo de map com lambda e Functional
                                                                    //Interfaces...
    }
}

//      MAPS
/*
*       O "map" é um dos métodos que podem ser usados a partir de uma instância de Stream. O papel de map,
*       como o próprio nome diz, é mapear os valores de uma stream devolvendo uma outra stream com a mesma
*       quantidade de valores que a stream original, porém, mapeados segundo o que o usuário deseja.
*
*       Por exemplo se você quiser saber somente a primeira letra de cada caractere em uma stream de
*       strings, quiser somente o preço de uma stream de produtos ou qualquer outra operação do tipo, o
*       map é a escolha certa.
*
*       O map faz parte do que chamamos de "intermediaries operations", que são métodos das streams que
*       tem por objetivo receber uma stream e retornar outra stream operada, o que permite a "composição
*       de métodos" (métodos sendo operados um atrás do outro).
*
*       Maps devem receber como parãmetro uma Function, Functional Interface ou Lambda, lembrando que
*       elas são irão fazer uma operação por vez para cada valor de acordo com a implementação da função.
*
*
*       CARACTERÍSTICAS DE MAP:
*
*          *    Recebem uma stream de valores e devolve outra stream com os valores operados;
*
*          *    São "intermediaries operations", podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Têm que receber como parâmetros uma Function, Functional Interface ou Lambda;
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
* */
