//OPERADORES

/*  No Java, assim como em muitas outras linguagens, devemos dar muito importância aos
    operadores, quando falamos dos operadores, temos que ter algumas ideias bem fixas
    na nossa mente a respeito deles:

        # Classificação: Unário, Binário ou Ternário;
        # Tipo: Aritimético, Atribuição, Lógico ou Relacional;
        # Precedência: Ordem e direção pela qual os operadores são executados em 
                        sequência;

    CLASSIFICAÇÃO:

        # Unário: Operador que opera sobre 1 único dado, por exemplo: a++ (incremento);

        # Binário: Operador que opera sobre 2 dados, por exemplo: a + b (soma);

        # Ternário: Operador que opera sobre 3 dados, por exemplo: a ? a : b (ternário);

    TIPO:

        # Aritiméticos: Operadores que fazem operações matemáticas, como: soma, divisão,
                        subtração e etc. Entre os aritméticos temos:

                        + : adição. Retorna a soma dos dois operandos.
                        - : subtração. Retorna a diferença entre o operando da esquerda 
                            e o operando da direita.
                        * : multiplicação. Retorna o produto dos dois operandos.
                        / : divisão. Retorna o quociente da divisão entre o operando da 
                            esquerda e o operando da direita.
                        % : módulo. Retorna o resto da divisão entre o operando da 
                            esquerda e o operando da direita.

        # Atribuição: Operadores que fazem operações atribuítivas ao valor de um dado.
                        Eles podem ser prefix (prefixados) quando o operador vêm antes do
                        operando (significa que o operando será operado antes do programa
                        prosseguir com a execução) ou podem ser postfix (pós-fixado) 
                        quando o operando é operado somente depois da execução em 
                        andamento. Há também o tipo infix (entre os fixados), mas ele se 
                        aplica somente a operações binárias. 

                        OBSERVAÇÃO SOBRE INCREMENTO E DECREMENTO: Eles vão modificar o 
                        valor de memória da variável. Lembre-se que essa mudança é 
                        feita na memória, então pode alterar todo o resultado!
                        
                        Entre os operadores de atribuição temos:

                        += : atribuição de adição. Equivale a x = x + y, onde x é a 
                            variável à esquerda e y é a expressão à direita.
                        -= : atribuição de subtração. Equivale a x = x - y, onde x é 
                            a variável à esquerda e y é a expressão à direita.
                        *= : atribuição de multiplicação. Equivale a x = x * y, onde 
                            x é a variável à esquerda e y é a expressão à direita.
                        /= : atribuição de divisão. Equivale a x = x / y, onde x é a 
                            variável à esquerda e y é a expressão à direita.
                        %= : atribuição de módulo. Equivale a x = x % y, onde x é a 
                            variável à esquerda e y é a expressão à direita.
                        ++ : autoincremento. Ele pode ser tanto prefixado quanto 
                            posfixado. Sempre vai incrementar "1" ao valor já 
                            existente.
                        -- : autodecremento. Ele pode ser tanto prefixado quanto 
                            posfixado. Sempre vai decrementar "1" ao valor já 
                            existente.


        # Lógicos: Operadores que fazem operações booleanas entre os dados, operações 
                        com AND, OR, NOT e etc. Entre os operadores lógicos temos:

                        && : E lógico. Retorna verdadeiro se ambos os operandos forem 
                            verdadeiros.
                        || : OU lógico. Retorna verdadeiro se pelo menos um dos operandos 
                            for verdadeiro.
                        ! : Negação lógica. Inverte o valor booleano do operando.
                        ^ : OU Exclusivo. Retorna verdadeiro somente OU exclusivos ("true 
                            e false" ou "false e true", valores como "true e true" ou
                            "false e false" retornam negativo).

        # Ternário: Operadores que operam sobre 3 dados. Esse operador é o mais incomum
                        pois ele tem que seguir a seguinte sintaxe:

                        (expressão lógica) ? (resultado se true) : (resultado se false)

                        Explicando expressão:
                            # Primeiro, temos que colocar aqui uma expressão lógica que 
                                desejamos obter o resultado. Por ser uma expressão lógica
                                ela só poderá devolver "true" ou "false";
                            # Segundo, temos o sinal de "?" que faz a separação entre a
                                expressão que está sendo comparada e os dois valores 
                                que serão devolvidos;
                            # Terceiro, temos o primeiro resultado que será retornado 
                                caso a expressão resulte num "true";
                            # Quarto, temos o sinal de ":" que faz separação entre o 
                                retorno do operador ternário caso ele dê "true" ao 
                                lado esquerdo e o retorno caso ele dê "false" do lado
                                direito;
                            # Quinto, temos o segundo resultado que será retornado caso a
                                expressão resulte em "false";

        # Relacionais: Operadores que fazem comparações entre um dado e outro dado.
                        entre os relacionais temos:

                        == : igual a. Retorna verdadeiro se os dois operandos forem 
                            iguais.
                        != : diferente de. Retorna verdadeiro se os dois operandos forem 
                            diferentes.
                        > : maior que. Retorna verdadeiro se o operando da esquerda for 
                            maior que o operando da direita.
                        < : menor que. Retorna verdadeiro se o operando da esquerda for
                            menor que o operando da direita.
                        >= : maior ou igual a. Retorna verdadeiro se o operando da 
                            esquerda for maior ou igual ao operando da direita.
                        <= : menor ou igual a. Retorna verdadeiro se o operando da 
                            esquerda for menor ou igual ao operando da direita.

    PRECEDÊNCIA:

        A precedência muda de operadores para operador, temos uma tabela no arquivo
        "Precedencia de Operadores" nesta mesma pasta. Mas via de regra, o comum da 
        ordem de precedência para os operadores mais usados é (o 1º para o último):

            ++ (incremento pós/prefixo), -- (decremento pós/prefixo)
            +(unário), - (unário), ! (negação lógica)
            *(multiplicação), / (divisão), % (resto da divisão)
            + (adição), - (subtração)
            < (menor que), <= (menor ou igual a), > (maior que), >= (maior ou igual a), instanceof
            == (igual), != (diferente)
            & (AND bit a bit)
            ^ (XOR bit a bit)
            | (OR bit a bit)
            && (AND lógico)
            || (OR lógico)
            ?: (operador ternário)
            = (atribuição), += (adição e atribuição), -= (subtração e atribuição), 
                *= (multiplicação e atribuição), /= (divisão e atribuição), 
                %= (resto da divisão e atribuição)

    Vejamos alguns exemplos:
 
 */

public class Operators {
    public static void main(String[] args){
        int a = 1;
        int b = 2;

        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);
        System.out.println("Soma a + b: " + (a + b));
        System.out.println("Subtracao a - b: " + (a - b));
        System.out.println("Divisao a / b: " + (a / b));
        System.out.println("Multiplicacao a * b: " + (a * b));
        System.out.println("Modulo a % b: " + (a % b));
        System.out.println("Autoincremento prefixado ++a: " + ++a);
        System.out.println("Autodecremento posfixado b--: " + b--);
        System.out.println("Resultado depois do posfixado b: " + b);
        System.out.println("ATENCAO!!! Depois do prefixado e do posfixado os valores das variaveis mudou para:\n\ta = 2\n\tb = 1");
        System.out.println("atribuicao aditiva a+= a: " + (a+= a));
        System.out.println("atribuicao negativa a-= a: " + (a-= a));
        System.out.println("atribuicao multiplicativa a*= a: " + (a*= a));
        System.out.println("atribuicao divisiva b/= b : " + (b/= b));
        System.out.println("igualdade a == a : " + (a == a));
        System.out.println("diferenca a != a : " + (a != a));
        System.out.println("AND true && true : " + (true && true));
        System.out.println("OR false || true : " + (false || true));
        System.out.println("Negacao !true : " + !true);
        System.out.println("XOR true ^ false : " + (true ^ false));
        System.out.println("Precedencia: 7 + 5 - 5 / 2 = " + (7 + 5 - 5 / 2));
        System.out.println("Primeiro ele faz: 5 / 2 = 2.5");
        System.out.println("Depois vem para a esquerda e faz: 7 + 5 = 12");
        System.out.println("Por fim faz 12 - 2.5, cortando o valor decimal = 10");
        System.out.println("Ternário \"true ? sou verdadeiro : sou falso\" : " + (true ? "sou verdadeiro" : "sou falso"));
        System.out.println("Ternário \"false ? sou verdadeiro : sou falso\" : " + (false ? "sou verdadeiro" : "sou falso"));
    }
}
