package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.HighOrderFunctions.AboutUnaryOperator;

//  SOBRE O UNARYOPERATOR:

/*  O UnaryOperator é outra functional interface do java.util.function. Como o próprio nome diz ele tem a missão de
*   fazer uma operação unária onde irá receber um tipo de dado como parâmetro e irá retornar o mesmo tipo de dado.
*
*   O UnaryOperator é a functional interface mais usada do java, pois geralmente o que os desenvolvedores fazem é
*   coletar um tipo de dado e ter o mesmo tipo de dado com retorno de suas funções lambdas.
*
*   O UnaryOperator possuí 3 métodos que são mais comumente usados:
*
*       # apply - usado para executar a função lambda;
*
*       # andThen - usado para executar outro UnaryOperator ou um Function, esse método geralmente é usado para
*                   executar vários UnaryOperator em composição. Como o UnaryOperator é uma subinterface de Function
*                   ele pode executar Functions no seu "andThen";
*
*       # compose - compose, assim como andThen, também é usado executar várias UnaryOperators em composição. Mas a
*                   grande diferença entre compose e andThen é que "compose" executa as funções de trás para frente.
*                   A última será executada primeiro, depois a segunda, e a terceira e assim por diante;
*
*   Veja 2 exemplos, onde mostramos como usar andThe e compose...
* */

import java.util.function.UnaryOperator;

public class AboutUnaryOperator {
    public static void main(String[] args) {

        UnaryOperator<Integer> moreTwo = n -> n + 2;            //Veja que todas as UnaryOperators recebem apenas um
        UnaryOperator<Integer> multipleForTwo = n -> n * 2;     //tipo de parâmetro como entrada e retornam somente
        UnaryOperator<Integer> squared = n -> n * n;            //um parâmetro que deve ser do mesmo tipo da entrada...

        Integer resultUsingAndThen = moreTwo    //Aqui exemplificamos como usar andThen, veja que executamos as
                .andThen(multipleForTwo)        //UnaryOperators da frente para trás, iniciando com "moreTwo" e
                .andThen(squared)               //terminando com "squared"...
                .apply(0);

        System.out.println();
        System.out.println("andThen result: " + resultUsingAndThen);
        System.out.println();

        Integer resultUsingCompose = squared    //Aqui temos um exemplo de compose, imitamos a mesma ordem de execução
                .compose(multipleForTwo)        //das UnaryOperators no exemplo do andThen, veja que para acontecerem
                .compose(moreTwo)               //na mesma ordem tivemos que inverter a ordem de execução, pois
                .apply(0);                   //compose acontece de trás para frente,iniciando com "squared" e
                                                //terminando com "moreTwo"...

        System.out.println("compose result: " + resultUsingCompose);

    }
}
