package FUNDAMENTALS.FundamentalsOfJava.Generics.WildcardsAndBoundedGenerics;

import java.util.List;

public class ExampleOfWildAndBound {
    public void printListName(List<?> list){    //Aqui temos um exemplo de uso do wildcard
        list.stream()                           //para passar a responsabilidade de esco-
                .forEach(System.out::println);  //lher o tipo de dado para frente...
    }

    public void printNumbersIntegers(List<? extends Number> list){ //Aqui temos o exemplo
        list.stream()                                               //de limitar a lista
                .forEach(n -> {                                     //somente a dados que
                    if(n instanceof Integer){                       //sejam do tipo filho
                        System.out.println(n + " is Integer!");     //de Number, ou seja,
                    } else {                                        //Interger ou Double
                        System.out.println("no one is Interger!");
                    }
                });
    }
    public void printAnyNumbers(List<? super Integer> list){ //Aqui temos o exemplo de li-
        list.stream()                                           //mitar a tipos superiores
                .forEach(n -> System.out.println(n.getClass().getSimpleName())); //a Integer
        System.out.println("\n");                               //ou seja, da classe Number
    }                                                           //ou superior...
}

/*  Agora vá para a classe "ExampleWithClass" para ver um exemplo de wildcard e bound dire-
*   tamente sobre uma classe...
* */
