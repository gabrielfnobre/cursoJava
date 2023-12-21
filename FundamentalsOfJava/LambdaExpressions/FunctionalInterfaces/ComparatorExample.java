package LambdaExpressions.FunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Double> grades = Arrays.asList(7.1, 8.2, 6.2, 9.8);

        Comparator<Double> whichIsBigger = (n1, n2) -> { //Esse Comparator compara se 1 número é maior do que outro...
            if(n1 > n2) return 1;
            if(n1 < n2) return -1;
            return 0;
        };

        System.out.println(grades.stream().max(whichIsBigger).get()); //Pega o maior número da comparação.
        System.out.println(grades.stream().min(whichIsBigger).get()); //Pega o menor número da comparação.

    }
}

//      COMPARATOR
/*
*       O Comparator é uma Functional Interface da API do java usada para gerar comparações entre 2 valores.
*
*       O Comparator recebe uma função ou lambda, onde podemos implementar qual deverá ser comportamento de
*       uma comparação. Por padrão ele sempre irá retornar um número inteiro, que deverá ser um dos
*       seguintes valores...
*
*           * 1 - caso a comparação resulte em um true;
*
*           * -1 - caso a comparação resulte em um false;
*
*           * 0 - caso a comparação resulte num empate ou valores iguais;
*
*       Geralmente o Comparator é passado como parâmetro para os métodos stream "max" e "min", esses métodos
*       fazem iteração sobre uma stream executando o Comparator em todos os valores e devolvendo qual o
*       valor máximo da comparação ou o valor mínimo da comparação.
*
*       Veja como podemos usar no exemplo acima...
*
* */
