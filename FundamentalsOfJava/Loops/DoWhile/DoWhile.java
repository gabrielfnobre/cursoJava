package Loops.DoWhile;

//  DO WHILE:

/*  O laço "do while" é praticamente igual ao "while" com a única diferença de que ele 
    primeiro executa o bloco de código a ser repetido pelo menos 1 vez e só vai repetí-lo
    novamente a condição ainda for "true".

    A sintáxe do "do while" é a seguinte:

        do {
            bloco de execucao;
        } while (condicional);

        Explicação:
            - Note que primeiro ele executa o código, pelo menos 1 vez
                não importando se a condição foi satisfeita ou não;

            - Após o bloco de execução é que ele faz a comparação 
                condicional para constatar se o bloco do laço deve ser
                repetido ou não;

            - Outra particularidade do "do while" é que ele é o único
                laço de repetição que termina com ";" ;

    Vejamos um exemplo...
 */


import javax.swing.JOptionPane;

public class DoWhile {
    public static void main(String[] args){

        //Ex01
        String exit = "sair";

        do {
            exit = JOptionPane.showInputDialog(null, "Se quiser sair digite \"sair\": ");
        } while (!exit.equalsIgnoreCase("sair"));

        System.exit(0);

    }

    /* Ex01 - Perceba que o nosso laço "do while" tem como condição o seguinte, "se o valor que estiver dentro da 
                variável "exit" for igual a "sair" ele vai sair do laço". Porém, note que já inicializamos a
                variável com o valor "sair", mesmo assim, ela executa pelo menos 1 vez, conforme é a característica
                do "do while".
     */

}
