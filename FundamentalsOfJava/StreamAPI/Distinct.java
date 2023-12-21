package StreamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println; //um consumer só pra facilitar o print...

        //Criamos uma stream diretamente...
        Stream<String> names = Arrays.asList("Lia", "Bia", "Ana", "Gui", "Bia", "Hugo").stream();

        names.distinct().forEach(println); //Note que embora existam 2 "Bia", a stream retornada
                                            //traz apenas a primeira ocorrência...
    }
}

//      DISTINCT
/*
*       O "distinct" é um dos métodos que podem ser usados a partir de uma instância de Stream. O papel de
*       distinct, como o próprio nome diz, é distinguir (ou diferenciar) somente os valores duplicados de
*       uma stream e retornar outra stream sem duplicação de valores, ou seja, onde houvesse duplicação,
*       ela iria tirar essa duplicação e substituir todas as duplicadas por 1 único valor.
*
*       Por exemplo se você quiser saber quantos nomes diferentes existem numa lista, ou quais são os
*       nomes diferenciados, o distinct é o método ideal para isso.
*
*       O distinct faz parte do que chamamos de "intermediaries operations", que são métodos das streams
*       que tem por objetivo receber uma stream e retornar outra stream operada, o que permite a "composição
*       de métodos" (métodos sendo operados um atrás do outro).
*
*       O distinct não precisa receber nenhum valor como parãmetro, ele precisa somente ser encadeado
*       numa stream para devolver uma stream com valores unificados.
*
*
*       CARACTERÍSTICAS DE DISTINCT:
*
*          *    Recebem uma stream de valores e devolve outra stream com os valores operados;
*
*          *    São "intermediaries operations", podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Não recebem valor nenhum como parâmetro;
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
* */
