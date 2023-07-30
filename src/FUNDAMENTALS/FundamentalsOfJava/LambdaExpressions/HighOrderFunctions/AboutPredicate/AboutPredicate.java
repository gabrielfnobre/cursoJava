package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.HighOrderFunctions.AboutPredicate;

// SOBRE PREDICATE:

/*  A interface funcional `Predicate` faz parte do pacote `java.util.function` do Java e representa uma função
*   que recebe um argumento e retorna um valor booleano. Em outras palavras, é uma função onde podemos
*   implementar um teste sobre o valor do argumento passado e retornar `true` ou `false` com base na
*   implementação de teste.
*
*   A interface `Predicate` possui um único método abstrato chamado `test(T t)`, onde `T` é o tipo do
*   argumento que a função recebe. O método `test` recebe um valor do tipo `T` como entrada e retorna um valor
*   booleano.
*
*   Aqui está a declaração da interface `Predicate`:
*
*       @FunctionalInterface
*       public interface Predicate<T> {
*           boolean test(T t);
*       }
*
*   Quando usar o Predicate?
*
*   O Predicate é útil em situações onde você precisa filtrar ou verificar se um elemento atende a determinada
*   condição. Algumas situações comuns em que você pode usar o `Predicate` incluem:
*
*       1. Filtragem de coleções:
*           É possível usar o `Predicate` para filtrar elementos em uma coleção com
*           base em uma condição específica.
*
*       2. Validação de dados:
*           O `Predicate` pode ser usado para validar dados de entrada e verificar
*           se eles atendem a certos critérios.
*
*       3. Composição de predicados:
*           Além do método abstrato "test", o Predicate possuí outros métodos como
*           `and`, `or` e `negate` que podem ser usados para criar condições mais
*           complexas gerando valores booleanos diferenciados.
*
*           Exemplo:
*
*           Predicate<Integer> isEven = num -> num % 2 == 0;
*           Predicate<Integer> isPositive = num -> num > 0;
*
*           Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
*
*           System.out.println(isEvenAndPositive.test(6)); // Output: true
*           System.out.println(isEvenAndPositive.test(-3)); // Output: false
*
*   O uso do `Predicate` torna o código mais expressivo e funcional, permitindo que você especifique condições
*   de forma concisa e reutilizável. Ele é uma parte essencial das APIs de Streams e outras partes do Java que
*   envolvem filtragem e validação de dados.
*
*   Abaixo temos um exemplo de como usar o Predicate...
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AboutPredicate {
    public static void main(String[] args) {

        Predicate<Product> isExpensive = product -> product.value > 750;    //Criamos uma classe produto nesse
                                                                            //mesmo pacote, para instanciar um
                                                                            //teste booleano, onde, se um
                                                                            //produto passar de 750 ele é
                                                                            //considerado um produto caro...

        Product notebook = new Product("Notebook", 3890.50);
        Product climatizator = new Product("Climatizator", 390.99);
        Product airFlier = new Product("Air Flier", 690.99);

        List<Product> listProducts = Arrays.asList(notebook, climatizator, airFlier); //Atribuímos os produtos
                                                                                      //a uma lista...

        System.out.println();
        listProducts.forEach(item -> {
            if(isExpensive.test(item)){ //Usamos um test para verificar se o produto é caro...
                System.out.println("Is expensive: " + item.name);
                System.out.println();
            }
            if(isExpensive.negate().test(item)){                    //E outro teste com negação para mostrar
                System.out.println("Not expensive: " + item.name);  //os produtos considerados baratos, note
            }                                                       //que a negação é feita com outro método
        });                                                         //de Predicate...

    }
}
