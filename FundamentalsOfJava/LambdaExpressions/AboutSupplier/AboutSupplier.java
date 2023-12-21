package LambdaExpressions.AboutSupplier;

//  SOBRE O SUPPLIER:

/*  Em Java, o `Supplier` é uma interface funcional pertencente ao pacote `java.util.function`. Essa interface faz
*   parte do Java 8, que introduziu o conceito de programação funcional ao permitir o uso de expressões lambda e
*   interfaces funcionais para trabalhar com funcionalidades mais concisas e elegantes.
*
*   A interface `Supplier` possui um único método abstrato chamado `get()`. Esse método não recebe argumentos e
*   retorna um resultado. Em outras palavras, o `Supplier` representa uma função que fornece (ou produz) um valor, mas
*   não recebe nenhum parâmetro, a função dele é só gerar algum resultado quando ele for chamado por através do
*   método "get()".
*
*   O `Supplier` é frequentemente utilizado em situações em que precisamos obter um valor sem fornecer argumentos.
*   Por exemplo, podemos usar um `Supplier` para gerar valores predefinidos, instanciar uma variável, gerar valores
*   aleatórios ou computados dinamicamente.
*   quando necessário.
*
*   O uso de `Supplier` pode tornar o código mais limpo e legível, especialmente quando trabalhamos com funcionalidades
*   que requerem valores dinâmicos ou predefinidos. É uma das muitas interfaces funcionais fornecidas no pacote
*   `java.util.function`, juntamente com outras como `Consumer`, `Predicate`, `Function`, entre outras, que ampliam as
*   possibilidades de programação funcional em Java.
*
*   Vejamos 2 exemplos de utilização do Supplier logo abaixo...
* */

import java.util.Random;
import java.util.function.Supplier;

public class AboutSupplier {

    AboutSupplier(){                                //Geramos um construtor sobre essa classe só para testar como o
        System.out.println("I'm was instancied!");  //Supplier consegue instanciar uma classe quando quisermos usando
    }                                               //um method reference...

    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> new Random().nextInt(100) - 1;  //Usando o Supplier para gerar
        System.out.println();                                                        //um valor randômico...
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get()); //Veja que para ativar o Supplier basta usar get()...
        System.out.println(randomNumber.get());
        System.out.println();

        Supplier<AboutSupplier> instance = AboutSupplier::new;  //E aqui temos um exemplo de instancialização dessa
        instance.get();                                         //mesma classe usando o Supplier com conjunto com um
                                                                //method reference...
    }
}
