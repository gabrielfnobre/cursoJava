package Generics.WildcardsAndBoundedGenerics;

import java.util.Arrays;
import java.util.List;

public class WildcardsAndBoundedGenerics {
    public static void main(String[] args) {

        ExampleOfWildAndBound list = new ExampleOfWildAndBound(); //Objeto para uso dos métodos...

        List<Integer> myListNumbers = Arrays.asList(1, 2, 3, 4, 6);
        list.printListName(myListNumbers); //Veja que podemos usar o método printListName em Integer...

        List<String> myListNames = Arrays.asList("Rafa", "Daniel", "Gabriel");
        list.printListName(myListNames); //Veja que podemos usar o método printListName em Strings...

        List<Double> myDoubleList = Arrays.asList(2.2, 4.4, 6.6);
        list.printNumbersIntegers(myDoubleList); //Veja que usamos esse método tanto em Integers...
        list.printNumbersIntegers(myListNumbers); //Quanto em Doubles...
        //list.printNumbersIntegers(myListNames); //Mas não em Strings, pois ele só recebe filhos de
                                                    //Number...

        List<Number> justNumbers = Arrays.asList(3, 3.0, 5, 6.1); //Um array de numbers mescla Integer
        list.printAnyNumbers(myListNumbers);                        //com doubles...
        list.printAnyNumbers(justNumbers);
        //list.printAnyNumbers(myDoubleList);

        ExampleWithClass<Integer> sum = new ExampleWithClass<>(); //Embora receba integers, a soma
        sum.sumToDouble(3, 6);                                    //será retornada como Double...
        //sum.sumToDouble("2", "5");

    }
}

/*      "WILDCARDS" E "BOUNDED GENERICS"
*
*   No contexto do Generics temos ainda 2 tipos de marcações das quais é importante abordar-
*   mos:
*
*       - Wildcards (Curingas);
*       - Bounded Generics (Genéricos Limitados);
*
*   Vamos explanar cada um deles:
*
*       - WILDCARDS:
*
*           Os wildcards são representados pelo sinal de interrogação "?", eles são usados
*           para quando queremos passar para frente a necessidade de definir um tipo gené-
*           rico a uma classe ou método que esteja pedindo pela definição de um tipo gené-
*           rico.
*
*           Além disso, elas também podem ser usadas quando desejamos trabalhar com bounded
*           generics, que são uma forma de limitar os tipos genéricos que podemos utilizar
*           numa classe ou método. (vamos abordar isso mais adiante).
*
*           Usamos wildcards de 2 formas:
*
*               1º - Para passar a diante a responsabilidade de definir um tipo:
*
*               public void nomeDoMetodo(List<?> lista){ ...
*
*               Note que usamos o "?" para mostrar que pegaremos uma lista de qualquer
*               tipo genérico. Aqui estamos passando a diante a responsabilidade de defi-
*               nir o método genérico da lista a quem chamar pelo método. Do contrário
*               teríamos que definir agora qual é o tipo de dado.
*
*
*               2º - Para usar um "bounded generics":
*
*               public void nomeDoMetodo(List<? extends Number> lista){ ...
*
*               Vamos abordar isso logo em seguida, mas só para ficar claro, o wildcard
*               aqui ao ser usado junto com a palavra "extends" e o tipo de classe "Number"
*               quer dizer que estamos limitando qualquer lista que o método receba e ser
*               uma lista de objetos que sejam filhos da classe Number, ou seja, esse mé-
*               todo só poderá receber listas de "Integer" ou de "Double".
*
*
*   - BOUNDED GENERICS:
*
*       Os Bounded Generics são notações que nos permitem criar uma limitação sobre os ti-
*       pos de dados que podemos receber em uma classe ou método genérico.
*
*       Para isso usamos 2 formas de limitação:
*
*           1º - Limitação para menos:
*
*           public void nomeDoMetodo(List<? extends Number> lista){ ...
*
*           Para limitarmos um tipo para menos, temos que usar a palavra reservada "exten-
*           ds" seguido pelo tipo de dado limitador. O que queremos dizer no exemplo acima
*           é que queremos que esse método só receba tipos de dados que sejam filhos da
*           classe "Number", ou seja, ela só poderá receber "Integers" ou "Doubles".
*
*           De forma alguma essa classe poderá receber "Strings", "Booleans" e outros ti-
*           pos de dados que estejam acima ou fora de "Number".
*
*
*           2º - Limitação para mais:
*
*           public void nomeDoMetodo(List<? super Number> lista){ ...
*
*           Neste exemplo estamos limitando o método a só receber valores que pertençam
*           as classes pai de Number, qualquer classe superior até chegar no "Object".
*
*           OBSERVAÇÃO: Isso não sigfica que poderíamos fazer ela receber uma lista de
*           strings só por que poderíamos atribuir uma lista de Objects. Pois para chegar
*           na string teríamos de descer alguns níveis depois de ter subido após o Number
*           ou seja, LIMITAÇÕES SUPERIORES SÓ SERVEM PARA SUPER CLASSES!!!
*
*  Vamos ver um exemplo de utilização, vá até ExampleOfWildAndBound...
*
* */
