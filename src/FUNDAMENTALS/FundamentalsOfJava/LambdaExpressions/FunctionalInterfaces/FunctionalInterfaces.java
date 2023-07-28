package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.FunctionalInterfaces;

// INTERFACES FUNCIONAIS:

/*  Dentro do contexto de Lambdas vamos encontrar quase que 100% das vezes o que conhecemos como Interfaces Funcionais
*   para fazer a implementação das nossas lambdas. Mas o que são interfaces funcionais?
*
*   Numa interface comum, geralmente colocamos quantos métodos quisermos para fazer diversas implementações, e isso
*   também é possível no contexto de lambdas, mas não é o mais usual. O mais usual é usarmos apenas 1 método dentro da
*   nossa interface para fazer nossas implementações lambdas.
*
*   Por isso o java trabalha com uma notation chamada de "@FunctionalInterface", essa anotation serve como uma
*   validação na nossa interface, garantindo que usemos somente 1 método abstrato dentro daquela interface e mais
*   nenhum outro método abstrato. Até podemos ter métodos default e estáticos o quanto quisermos, mas métodos abstratos
*   só 1. Se por um acaso tentarmos colocar mais de um método abstrato dentro de uma functional interface, o código não
*   compila.
*
*   As Interfaces Funcionais tem tanta popularidade que o próprio java incluiu no java util algumas Functional
*   Interfaces para serem usadas. Elas estão dentro de java.util.funciton, vamos até usar algumas como exemplo.
*
*   Veja como usar functional interfaces na interface Calculate...
* */

import java.util.function.BinaryOperator; //Importamos uma functional interface do java que faz praticamente a mesma coisa que a nossa functional interface...

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Calculate sum = (x, y) -> x + y; //Instanciamos a lambda para poder usar o método abstrato execute...
        System.out.println(sum.execute(10, 10));

        BinaryOperator<Integer> sumUtil = (x, y) -> x + y; //Fizemos o mesmo com a function interface do java, note que
        System.out.println(sumUtil.apply(20, 30));   //assim como a criada por nós, ela também tem que ter a sua
                                                           //lambda implementada. Veja também como é o método de
                                                           //implementação, ele usa um generics para que possamos
                                                           //escolher o tipo de dado de entrada. E para usar o método
                                                           //abstrato temos que usar o método "aply"...

        sum.ICanExistHereImDefault();   //Aqui vemos como usar o método defautl...
        Calculate.meTooCanExistHereImStatic();  //E aqui vemos como usar o método estático, que deve ser chamado de forma estática...

    }
}
