package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.FunctionalInterfaces;

// INTERFACES FUNCIONAIS:

/*  Dentro do contexto de Lambdas vamos encontrar quase que 100% das vezes o que conhecemos como Interfaces Funcionais
*   para fazer a implementação das nossas lambdas. Mas o que são interfaces funcionais?
*
*   Numa interface comum, geralmente colocamos quantos métodos quisermos para fazer diversas implementações, e isso
*   também é possível no contexto de lambdas, mas não é o mais usual. O que é o mais usual é usarmos apenas 1 método
*   dentro da nossa interface para fazer nossas implementações lambdas.
*
*   Por isso o java trabalha com uma anotation chamada de "@FunctionalInterface", essa anotation serve como uma
*   validação na nossa interface, garantindo que usemos somente 1 método dentro daquela interface e nada mais. Se por
*   um acaso tentarmos colocar mais de um método dentro de uma functional interface, o código não compila. Podemos até
*   colocar tiversos atributos na functional interface, mas métodos só um.
*
*   As Interfaces Funcionais tem tanta popularidade que o próprio java incluiu no java util algumas Functional
*   Interfaces para serem usadas.
*
*   Veja como usar functional interfaces na interface Calculate...
* */

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Calculate sum = (x, y) -> x + y;
        System.out.println(sum.execute(10, 10));

    }
}
