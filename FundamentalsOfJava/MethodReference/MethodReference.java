package MethodReference;

//  METHOD REFERENCE:

/*  Method reference é uma forma concisa de se referenciar um método existente que pode ser usado como uma
*   implementação para um lambda ou uma interface funcional. Isso torna o código mais limpo e legível,
*   especialmente quando o lambda consiste apenas em chamar um método.
*
*   IMPORTANTE!!! Methods reference só podem ser  usados no contexto de lambdas! Pois as Methods References
*   procuram uma interface ou lambda para funcionarem, sem esse contexto, elas não funcionam!!!
*
*   Em Java, você pode usar method references em duas situações:
*
*       1º Quando você tem um lambda que simplesmente chama um método, e esse método tem a mesma
*           assinatura (mesmos parâmetros e retorno) do lambda.
*
*           Por exemplo:
*                           name -> System.out.println(name)
*
*           Pode ser substituido por:
*                           System.out::println //sem a necessidade de usar parâmetros
*
*
*       2º Quando você tem um lambda que chama um método de um objeto específico.
*
*           Por exemplo:
*                           NomeObjeto objeto = new NomeObjeto();
*                           objeto.metodoDoObjeto()
*
*           Pode ser substituído por:
*                           NomeObjeto objeto = new NomeObjeto();
*                           objeto::metodoDoObjeto  // Esse método tem que usar lambda ou functional interface
*                                                   // e neste caso especifico não pode ter entrada de
*                                                   // parâmetros!
*
*   Os method references são representados pelo operador ::, que fica entre o nome do objeto ou da classe que
*   utilizará um determinado método dela. A sintaxe exata depende do tipo de method reference que você deseja
*   usar.
*
*   Existem quatro tipos de method references:
*
*       1º - Method Reference para Métodos Estáticos:
*
*               Classe::metodoEstatico
*
*       2º - Method Reference para Métodos de Instância de um Objeto Particular:
*
*               objeto::metodoDeInstancia
*
*       3º - Method Reference para Métodos de Instância de uma Classe Arbitrária (Quando temos um objeto de
*               uma classe que têm um método estático que só poderá ser operado sobre um objeto dela, por
*               exemplo: quando instanciamos um objeto string e usamos o método toUpperCase - um método
*               estático de String):
*
*               objeto.Classe::metodoDeInstancia
*
*       4º - Method Reference para Construtores (Usando uma classe que tenha uma functional interface como
*               auxiliar para que possamos usar methods references):
*
*               Supplier<Classe> objeto = Classe::new   //Nesses casos temos que usar uma functional interface
*                                                       //como o Supplier, para poder usar method reference
*                                                       //para instanciar um objeto sobre a classe desejada...
*
*   Vamos ver alguns exemplos de como utilizar method references:
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReference {

    MethodReference(){                                      //Criamos um construtor e uma impressão sobre
        System.out.println("New instance was created!");    //ele só para mostrar que podemos chamar um
    }                                                       //construtor a partir de uma functional interface
                                                            //veja o exemplo 4...

    public static void main(String[] args) {

        //Exemplo de Method Reference para Métodos Estáticos:
        /*  Abaixo temos o exemplo da implementação de um method reference sobre um método estático de
        *   ArrayList, o método "forEach", esse método aceita uma lambda como objeto, e onde tem lambda pode
        *   ter um method reference.
        *   Note também, que um método reference pode chamar qualquer método estático de uma classe, criamos
        *   o método estático (veja abaixo) "printForMe" só para mostrar que isso é possível:
        * */
        System.out.println();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(MethodReference::printForMe); // Lambda equivalente: (str) -> Integer.parseInt(str)
        System.out.println();


        //Exemplo de Method Reference para Métodos de Instância de um Objeto Particular:
        /*  O objeto em particular nesse caso é "out" da classe "System", esse objeto possuí um método
        *   chamado "println":
        * */
        names.forEach(System.out::println);         // Lambda equivalente: (name) -> System.out.println(name)
        System.out.println();


        //Exemplo de Method Reference para Métodos de Instância de uma Classe Arbitrária:
        /*  Existem muitos exemplos onde poderemos ter objetos que poderão utilizar um método estático da
        *   classe a qual foram instanciados. Por exemplo: toUpperCase é um método estático de String, se
        *   formos chamar esse método de forma indireta sobre um objeto string, como estamos fazendo abaixo,
        *   podemos fazer essa chamada usando um "method reference", veja o exemplo abaixo:
        * */
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)               // Lambda equivalente: (str) -> str.toUpperCase()
                .collect(Collectors.toList());

        uppercaseNames.forEach(System.out::println);    // Lambda equivalente: (str) -> System.out.println(str)
        System.out.println();


        //Exemplo de Method Reference para Construtores:
        /*  Para usar um method reference para instanciar, temos que usar uma classe auxiliar que use
        *   functional interfaces, como por exemplo o Supplier, veja que usamos o Supplier como auxiliar
        *   para que podessemos chamar o construtor da classe MethodReference, note também que só quando
        *   usamos o get do Supplier é que executamos a chamada do método...
        * */
        Supplier<MethodReference> mr = MethodReference::new; // Lambda equivalente: () -> new ArrayList<>()
        mr.get();
    }

    static void printForMe(String str){ //Esse método estático foi criado só para exemplificar que methods
        System.out.println(str);        //references podem chamar qualquer método a partir de um lambda...
    }
}
