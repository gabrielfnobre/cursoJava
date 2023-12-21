package CONSOLE;

//USO DO CONSOLE:

/*  No Java, assim como em outras linguagens, é possível que nós utilizemos o console
 *  das IDEs para imprimir mensagens e mostrar resultados, como também para capturar
 *  dados do usuário.
 * 
 *  Para mostrar mensagens do console usamos o pacote de métodos "System.out", ou 
 *  seja, um pacote de métodos que usam a saída (out) do sistema (System) para 
 *  mostrar mensagens.
 * 
 *  Geralmente usamos 2 métodos para mostrar mensagens no console, eles são:
 *      
 *      * print() - O "print" é usado para quando queremos imprimir um texto comum,
 *                  como uma string. A característica básica do "print" é que ele 
 *                  não pula linhas, ele simplesmente imprime o que estiver escrito
 *                  em uma linha corrida. Até podemos pular linhas, mas para isso
 *                  deveríamos usar notação format como o "\n";
 * 
 *      * println() - O "println" faz a mesma coisa que o "print", imprime uma 
 *                  mensagem textual no console. Mas a grande sacada do "println" 
 *                  é que ele sempre pula uma linha;
 * 
 *  Mas existem outros métodos com outras funcionalidades para mostrar mensagens e 
 *  resultados no console, como por exemplo:
 * 
 *      * printf() - O "printf" ou "print format" é um método que consegue imprimir 
 *                  mensagens que usem notação format por através de notações como
 *                  %d (dígitos), %c (caracteres), %f (float), %s (strings) e 
 *                  outros; OBSERVAÇÃO: o printf também não quebra linha
 *                  automáticamente;
 * 
 *  Já para capturar mensagens do usuário podemos usar um pacote muito conhecido do 
 *  Java, que é o "Scanner" da biblioteca "java.util". O Scanner é um pacote que 
 *  permite a captura de dados do usuario a partir do terminal. Para utilizá-lo 
 *  temos que importar o pacote Scanner, instanciar uma variável usando o método
 *  Scanner() e o valor "System.in" (Sistema de input).
 *  A partir do momento que temos a variável instanciada como objeto, podemos usar
 *  diversos métodos disponíveis do pacote para capturar strings, intergers, floats
 *  e etc.
 * 
 *  Vejamos abaixo exemplos de print, println, printf e do pacote Scanner...
 */

import java.util.Scanner;

public class ConsoleUse {
    public static void main(String[] args){
        //Ex 01
        System.out.print("Veja");
        System.out.print(" como ");
        System.out.print("a mensagem ");
        System.out.print("fica na mesma linha \n\n");

        //Ex 02
        System.out.println("Veja como a");
        System.out.println("mensagem pula linhas.\n");

        //Ex 03
        System.out.printf("Veja como podemos juntar numeros: %d + %d = %d\n\n", 1, 1, (1+1));

        //Ex 04
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.printf("Seu nome eh %s %s e voce tem %d de idade.\n", nome, sobrenome, idade);

        input.close();
    }

    /*Ex 01 + Veja como os print servem apenas para mostrar strings no console sem a habilidade de pular linha.
        Note como é necessário usar um escape "/n" para puder pular 2 linhas ao final.
    */
    /*Ex 02 - Veja como o println pula linhas sem a necessidade de pedirmos, observe também que podemos usar 
        escapes como o "/n" para pular linha.
    */
    /*Ex 03 - Veja como podemos usar o printf, veja como conseguimos concatenar os valores das variáveis ao 
        texto usando os escapes do format.
    */
    /*Ex 04 - Note o passo a passo para usar o pacote Scanner:

            1º Importar: linha 45
            2º Instanciar sobre variável: linha 63
            3º Usar um método de entrada para a digitação como o "nextLine()" e o "nextInt()": linhas 65 e 69
            4º Podemos mostrar os resultados armazenados nas variáveis que pegam o valor capturado pelos 
                métodos de entrada: linhas 65, 69 e 71;
            5º Não podemos nos esquecer de fechar o método de entrada do pacote Scanner usando o método 
                "close()". Do contrário, o terminal ficará esperando uma ação infinitamente e nunca será 
                incerrado.

            OBSERVAÇÃO: O Scanner não pega valores de terminal quando usado em conjunto com a extensão 
            code runner, pois esses terminais de extensão sempre utilizam o "output" do visual studio code e 
            não conseguem fazer o "input" dos valores. Por isso, execute o código somente em terminais que 
            aceitam tanto o input como o output, como o CMD ou o Bash, para fazer o Scanner funcionar.

    */

 }