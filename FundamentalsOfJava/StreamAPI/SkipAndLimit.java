package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SkipAndLimit {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println; //um consumer só pra facilitar o print...

        //Criamos uma stream diretamente...
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream().skip(2).limit(5).forEach(println); //quisemos pular os 2 primeiros elemento e só
                                                                    //imprimir 5 elementos a partir de onde pulamos...

        System.out.println();
        nums.stream().limit(7).skip(2).forEach(println); //fizemos a mesma operação de cima só que usando
                                                                    //os métodos "limit" e "skip" ao contrário, onde
                                                                    //primeiro determinamos que somente 7 valores
                                                                    //seriam impressos, depois determinados que desses
                                                                    //7 valores, os 2 primeiros seriam pulados...
    }
}

//      SKIP E LIMIT
/*
*       Os métodos "skip" e "limit" são métodos que podem ser usados a partir de uma instância de Stream.
*       O papel de "skip" e "limit" é fazer paginação em uma stream enquanto outro método de stream é
*       operado. Paginação, é o ato de pegar somente um determinado ponto de uma lista ou stream,
*       escolhendo onde esse ponto começa e onde deve terminar.
*
*       Por exemplo, se você quiser imprimir alguns valores de uma stream, mas você deseja que os valores
*       sejam impressos somente a partir do 2 valor e que somente 7 valores sejam impressos, os método
*       "skip" e "limit" são os corretos para você.
*
*       Esses métodos fazem parte do que chamamos de "intermediaries operations", que são métodos das streams
*       que tem por objetivo receber uma stream e retornar outra stream operada, o que permite a "composição
*       de métodos" (métodos sendo operados um atrás do outro).
*
*       O "skip" deve receber como parâmetro o número de elemento que você deseja pular dentro de uma stream.
*       Enquanto o "limit" deve receber como parâmetro o número de elementos que você que sejam operados
*       dentro de uma stream. Usando os dois em conjunto é possível escolher de qual ponto nós queremos que
*       uma operação seja feita dentro de uma stream e quantas vezes nós queremos que essa operação seja
*       feita.
*
*
*       CARACTERÍSTICAS DE SKIP E LIMIT:
*
*          *    Recebem uma stream de valores e devolve outra stream com os valores operados;
*
*          *    São "intermediaries operations", podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Têm que receber como parâmetros números inteiros que determinam quantos valores
*               pular (no caso das skip) e quantos valores pegar (no caso dos limits);
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
* */

