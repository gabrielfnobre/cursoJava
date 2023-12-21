package LambdaExpressions.AboutBiFunction;

//  SOBRE BIFUNCTION:

/*  A functional interface BiFunction é outra interface do java.util.function, que tem a missão de receber 2 valores
*   como parâmetro e retornar 1 único valor, isso é praticamente o que o functional iterface BinaryOperator faz, mas
*   a BiFunction é muito mais versátil.
*
*   Enquanto a BinaryOperator opera somente valores com o mesmo tipo de dado e devolve um valor com o mesmo tipo de
*   dado, a BiFunction pode aceitar qualquer tipo de dado nas suas entradas, mesmo que eles sejam diferentes e pode
*   retornar qualquer tipo de dado, mesmo que seja diferente dos dados de entrada. Isso a torna uma função muito mais
*   versátil.
*
*   Para startar a lambda que o BiFunction recebe, temos que usar o método "apply".
*
*   Vejamos um exemplo de implementação de BiFunction...
* */

import java.util.function.BiFunction;

public class AboutBiFunction {
    public static void main(String[] args) {

        BiFunction<Double, Double, String> gradeOfStudent = (n1, n2) -> {   //Esse BiFunction recebe 2 Double como
            Double grade = (n1 + n2) / 2;                                   //parâmetros e retorna uma de acordo com
            return grade > 7 ? "Student approved: " + grade : "Student reproved: " + grade; //uma determinada condição
        };

        System.out.println(gradeOfStudent.apply(7.5, 8.5));
        System.out.println(gradeOfStudent.apply(5.5, 7.5));
        System.out.println(gradeOfStudent.apply(8.4, 6.4));

    }
}
