package Loops.For;

//  FOR:

/*  O laço "for" é um laço criado para ser usado sempre que temos uma quantidade 
    pré-determinada de repetições.
    
    É só nos perguntarmos: As repetições serão sempre as mesmas? Como na tabuada 
    por exemplo, sempre vamos repetir a mulplicação de 1 à 10. Se for como na
    tabuada, então o "for" é o laço que deve ser escolhido.

    A sintaxe do "for" é um pouco difícil de se acostumar, mas não é difícil, 
    funciona assim:

        for(campo A ; campo B ; campo C){
            bloco de execução que é repetido enquanto o campo B resultar em "true"
        }

        Explicação:
            # Campo A: Nesse campo iniciamos a nossa variável contadora, por 
                        exemplo: "int i = 0", iniciando assim sabemos que vamos
                        ter uma variável contadora "i" que deverá ser incrementada
                        ou decrementada dependendo do caso, até que o seu valor 
                        gere um resultado "false" no campo condicional do laço
                        "for" (o campo B);

            # Campo B: Nesse campo temos uma operação condicional envolvendo a
                        variável contadora, essa condicional sempre vai devolver
                        um "true" ou um "false", o que precisamos de saber é que
                        se der "false" o laço para, se nunca der "false", ele 
                        iria continuar infinitamente. Geralmente nesse campo 
                        colocamos algo como: "i < 10", ou seja, enquanto a 
                        variável contadora for menor que "10", o resultado 
                        devolvido será "true" e o laço será repetido. E para 
                        evitar o laço fique repetindo infinitamente é que existe 
                        o campo C;

            # Campo C: Nesse campo colocamos o "incremento" ou "decremento" da
                        variável contadora. Geralmente o valor que colocamos 
                        seria algo como: "i++", isso significa que, a cada laço
                        de repetição o contador vai somar "+ 1" a ele mesmo, e
                        o valor do contador vai incrementando a cada laço. 
                        Quando o condicional do Campo B não for mais satisfeito
                        resultando num "false", o laço para de repetir e saí da
                        execução;

    OBSERVAÇÕES:    
    
                # É possível criar a variável contadora fora do laço "for" e 
                    utilizá-la no "for", embora isso raramente seja usado;

                # O campo de condicional por padrão é sempre "true", então se 
                    deixarmos esse campo em branco, ele vai repetir infinitamente;

                # É possível criar um "for" com o campo de incremento em vazio, e 
                    podemos criar um incremento a variável contadora dentro do 
                    laço "for", muito embora isso seja muito estranho e não usual;

                # O laço "for" também é uma excelente escolha quando temos que 
                    fazer repetições aninhadas, ou seja, precisamos repetir um 
                    processo uma determinada quantidade de vezes e além disso 
                    precisamos que a cada repetição um processo que está dentro 
                    do processo seja repetido uma determinada quantidade de 
                    vezes. Isso é o que chamamos de "for aninhado" ou "for
                    encadeado". A estrutura de um laço encadeado geralmente é
                    assim:

                        for(int i = 0; i <= 10; i++){
                            for(int j = 0; j <= 10; j++){
                                bloco de execução;
                            }
                        }

    Vejamos alguns exemplos...


 */

public class ForExample {
    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01");
        for(int i = 0; i <= 10 ; i++){
            System.out.println(i);
        }
        System.out.println();
        

        //Ex02
        System.out.println("Ex02");
        int i = 0;
        for(; i <= 10;){
            System.out.println(i);
            i++;
        }
        System.out.println();


        //Ex03
        // for(;;){
        //     System.out.print("infinite ");
        // }


        //Ex04
        System.out.println("Ex04");
        for(int numeral = 1; numeral <= 10; numeral++){
            for(int multiplicando = 0; multiplicando <= 10; multiplicando++){
                int resultado = numeral * multiplicando;
                System.out.printf("%d X %d = %d\n", numeral, multiplicando, resultado);
            }
            System.out.println();
        }

    }

    /* Ex01 - Note nesse exemplo a sintaxe mais utilizada de um for, com a inicialização da variável contadora dentro do 
                próprio for, seguida pela condição que mantém o loop funcionando até que ela não seja mais satisfeita e
                em seguida temos o incremento, ou decremento se for caso. Essa é a sintaxe mais usada;
     */
    
    /* Ex02 - Essa é uma sintaxe pouquíssimo usada, se é que é usada, mas a título de exemplo, temos ela aqui. Note nessa
                sintaxe que iniciamos a variável fora do for, deixando o seu campo de criação da variável de fora, e 
                dentro do for, temos apenas o condicional, que vai ser verdadeiro enquanto a variável contadora for menor
                ou igual a 10. O campo de incremento foi inutilizado, pois optamos por fazer o incremento dentro do bloco
                do for. É uma forma muito esquisita, mas pode ser utilizada;
     */

    /* Ex03 - Esse exemplo é só para mostrar o que acontece se tivermos um for sem nada dentro dos seus campos. O que vai
                acontecer nesse caso é que o for será repetido infinitamente, pois por padrão o campo condicional do for
                recebe o valor "true", fazendo com que ele repita sem parar;
     */

    /* Ex04 - Nesse exemplo temos um uso clássico de laço aninhado - que também pode ser chamado de laço encadeado - que
                é quando precisamos que um laço percorra uma certa quantidades de linhas, referentes a 1 valor, e que 
                cada vez que ele percorra essas linhas ele também faça um determinado número de execuções. Como uma 
                tabuada de 1 a 10, vamos precisar executar 10 vezes cada numeral da tabuada, para isso o laço for 
                encadeado (ou aninhado) é uma excelente escolha;
     */


}
