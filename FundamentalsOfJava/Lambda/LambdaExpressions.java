package Lambda;

//  EXPRESSÕES LAMBDA:

/*  Se você já ouviu falar em arrow functions do javascript, expressões lambda serão praticamente naturais para você.
*   Expressões lambda são uma forma de usarmos funções anônimas para implementar - de maneira menos verbosa - funções
*   aos nossos métodos abstratos atribuídos as nossas interfaces.
*
*   Interfaces já são criadas com o objetivo de que classes possam reaproveitar métodos e suas assinaturas para gerar
*   métodos concretos à sua maneira dentro de suas respectivas classes.
*
*   Só que dá muito trabalho ficar sobrescrevendo vários métodos diferentes um para cada comportamento, um para cada
*   coisa. Por isso, o java a partir da versão 8 adicionou á linguagem as Lambdas.
*
*   As Lambdas são funções anônimas, assim como as arrow functions, que tem a missão de tornar a sobrescrita de métodos
*   abstratos mais concisa mantendo a mesma eficiência dos métodos sobrescritos.
*
*   A sintaxe de uma Lambda é a seguinte:
*
*       (a, b) -> {
*           return a + b;
*       }
*
*       Acima temos uma lambda que recebe como parâmetro 2 argumentos, note
*       antes do corpo da lambda temos uma setinha ( -> ), essa setinha que
*       identifica uma lambda como lambda, e na sequência temos o corpo da
*       nossa função. Esse código é encarado como objeto pelo java, e pode
*       ser passada a uma variável que tenha o mesmo tipo da nossa
*       interface. Ela poderá aproveitar qualquer método abstrato dentro
*       da interface que contenha a mesma assinatura.
*
*   Existe a versão resumida da lambda, que usamos quando ao nossa lambda possuí apenas 1 linha de execução no seu
*   corpo, que seria:
*
*       (a, b) -> a + b;
*
*       Nessa versão você não precisa e nem deve usar o return.
*
*   Siga o código para ver a implementação na prática. Primeiro, vá para a interface InterfaceLambda...
* */

public class LambdaExpressions {
    public static void main(String[] args) {

        InterfaceLambda sum = (x, y) -> x + y;              //Aqui temos alguns exemplos de implementação lambda, veja
        InterfaceLambda sub = (x, y) -> {                   //que bastou criarmos uma variável do tipo da interface
            System.out.println("doing the subtration...");  //em seguida temos que criar uma implementação que tenha
            return x - y;                                   //exatamente a mesma assinatura que o nosso método
        };                                                  //abstrato.
        InterfaceLambda mult = (x, y) -> x * y;             //Veja que estamos usando tanto a implementação comum
        InterfaceLambda div = (x, y) -> {return x / y;};    //quanto a resumida...

        System.out.println("Soma: " + sum.execute(4, 5));            //E aqui temos a forma de chamar o método.
        System.out.println("Subtração: " + sub.execute(4, 5));       //Note que usamos o nome da variável que
        System.out.println("Multiplicação: " + mult.execute(4, 5));  //atribuímos a lambda como objeto, seguido
        System.out.println("Divisão: " + div.execute(4, 5));         //pela notação ponto para o método que
    }                                                                      //queremos referenciar...
}

/*  Um pouco de história:
*
*   O termo "lambda" usado em programação tem suas raízes na matemática e na notação lambda cálculo,
*   que é um sistema formal desenvolvido pelo matemático Alonzo Church na década de 1930. O cálculo
*   lambda é um modelo teórico de computação baseado em funções e é uma das bases da ciência da
*   computação.
*
*   Na notação lambda cálculo, o símbolo "λ" é usado para representar uma abstração de função. Uma
*   abstração é essencialmente uma função anônima, que não possui um nome específico. Essa abstração
*   de função é usada para representar expressões funcionais e definir operações em termos de
*   funções.
*
*   Esse conceito de funções anônimas foi adotado e popularizado na linguagem de programação Lisp,
*   que foi uma das primeiras linguagens a adotar a ideia de funções como cidadãos de primeira
*   classe, ou seja, tratando funções como valores que podem ser passados como argumentos,
*   retornados de funções e atribuídos a variáveis.
*
*   Mais tarde, o termo "lambda" foi adotado em outras linguagens de programação, incluindo
*   linguagens como Python, C#, JavaScript e Java (a partir do Java 8), quando introduziram a
*   capacidade de usar funções anônimas ou expressões lambda. Essas expressões lambda são uma forma
*   de simplificar a criação de funções anônimas, permitindo que os programadores escrevam código
*   mais conciso e expressivo.
*
*   Assim, o nome "lambda" em programação tem suas origens no cálculo lambda e representa uma
*   forma de representar funções anônimas em código.
* */
