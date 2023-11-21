package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {

        List<Double> grades = Arrays.asList(7.1, 6.2, 8.5, 9.0);
        List<Double> allZero = Arrays.asList(0.0, 0.0, 0.0, 0.0);

        Comparator<Double> whichIsBigger = (n1, n2) -> {
            if(n1 > n2) return 1;
            if(n1 < n2) return -1;
            return 0;
        };

        System.out.println(grades.stream().max(whichIsBigger).get());
        System.out.println(grades.stream().min(whichIsBigger).get());

    }
}

//      MIN E MAX
/*
*       Os métodos "min" e "max" são métodos que podem ser usados a partir de uma instância de Stream.
*       O papel dos métodos "min" e "max", como o próprio nome diz, é encontrar qual é o valor mínimo e
*       qual é o valor máximo dentro de uma stream de acordo com a operação que for passada dentro de
*       um Comparator.
*
*       Os métodos "min" e "max" recebem como parâmetro uma functional interface do tipo "Comparator"
*       que deverá retornar os valores 1, -1 ou 0. Cada um desses valores retornados significa o
*       seguinte:
*
*           * Se for 1 ou -1 - dependendo de como desenvolvemos o nosso comparator, isso significará
*                               que ou o primeiro ou o segundo parãmetro ganhou a comparação;
*
*           * Se for 0 - significa que nenhum dos dois parâmetros é maior ou menor do que o outro;
*
*       Os métodos "min" e "max" fazem parte do conjunto de "terminal operations", onde o retorno será
*       um valor único, e não uma stream. Portanto, eles não podem ser operados de forma encadeada
*       (composição de métodos) como acontece com as intermediaries operations.
*
*
*       VALOR OPTIONAL DE MIN E MAX:
*       Por padrão, o "mix" e "max" não retorna um valor automaticamente, na verdade ele retorna um
*       objeto da classe chamada "Optional".
*       A missão dessa classe é nos dar condições de executar uma função á nossa escolha caso o "min"
*       e o "max" nos traga algum resultado ou não. Para isso essa classe possuí 3 métodos:
*
*           "get" - um método que retorna o valor final do reduce inferindo-o sobre o tipo de variável
*                   que o receberá como valor;
*
*           "ifPresent" - um método que executará a função que lhe for atribuída caso o método traga um
*                   resultado final, se não trouxer nada, ele não fará nada;
*
*           "ifPresentOrElse" - um método que recebe 2 funções como parâmetro, caso o método traga um
*                   resultado final ele executa a primeira função, caso o método não traga resultado
*                   nenhum, ele executa a 2ª função;
*
*
*       CARACTERÍSTICAS DOS MÉTODOS MIN E MAX:
*
*          *    Recebem uma stream de valores e devolve 1 valor final único que será o resultado da
*               função acumulativa que foi executada sobre todos os valores da stream;
*
*          *    São "terminal operations", não podem ser encadeadas numa composição de métodos da
*               stream;
*
*          *    Têm que receber como parâmetro Functional Interface do tipo Comparator, e irá
*               retornar o valor maior ou menor dentro da lista de streams comparada no Comparator;
*
*          *    É preferível que as funções, lambdas ou functional interfaces estejam armazenadas
*               numa interface ou classe que não poderia ser instanciada, gerando um melhor
*               reaproveitamento de código e código mais limpo;
*
**/

