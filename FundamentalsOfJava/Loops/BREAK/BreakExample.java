package Loops.BREAK;

//  BREAK:

/*  O break é uma estrutura de controle usada para interromper laços de repetição, 
    sempre que um break estiver dentro de um laço como "while", "for", "do while"
    ou "switch" - muito embora o switch não seja um laço de repetição e esteja 
    mais para uma estrutura de controle - o break vai interromper o laço e sair 
    para fora dele.

    Em geral, usamos o break dentro de um bloco if, pois geralmente queremos que o
    break seja usado quando atingir uma condição. Usar o break sem o bloco if é
    sem sentido, pois ele simplesmente vai interromper o laço saindo dele, 
    inutilizando todo o propósito do laço de repetição.

    OBSERVAÇÕES: USO DE BREAK EM LAÇOS FOR ANINHADOS: Sempre que usamos break em
                laços for aninhados, o break vai referenciar ao laço mais 
                próximo à ele (o laço mais interno a ele), ele não vai parar 
                todos os laços "for", somente o laço onde ele foi referenciado.
                Muito embora, seja possível usar break rotulado para referenciar
                um laço externo;

    CUIDADO! É possível usar um break referenciando a uma label, mas essa é uma 
            usabilidade muito mau vista no mundo da programação, pois pode gerar 
            muita confusão. Imagine um código grande usando vários laços for 
            aninhados e breaks rotulados dentro desses laços, imagine o problemão 
            que seria dar manutenção num código desses. Por isso, muito e muito 
            cuidado ao usar breaks rotulados o ideal é não usar.
 */

public class BreakExample {
    public static void main(String[] args){

        //Ex01
        for (int i = 1; i <= 10; i++) {
            if(i == 5){
                System.out.println("BREAK");
                break;
            }
            System.out.println(i);
        }
        
        //Ex02
        System.out.println("\nEx02");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            break;
        }
        

        //Ex03
        System.out.println("\nEx03");
        System.out.println("Sem o label para o for externo");
        for (int i = 1; i <= 2; i++) {
            System.out.println(i + " fora");
            for (int j = 1; j <= 2; j++) {
                if(i == 1){
                    break;
                }
                System.out.println("\t" + j + " dentro");
            }
        }
        
        System.out.println("\nCom o label para o for externo");
        externo: for (int i = 1; i <= 2; i++) {
            System.out.println(i + " fora");
            for (int j = 1; j <= 2; j++) {
                if(i == 1){
                    break externo;
                }
                System.out.println("\t" + j + " dentro");
            }
        }

        /* Ex01 - Nesse exemplo temos o uso comum de um break dentro de uma condicional if, o objetivo do
                laço é contar de 1 a 10, mas note que a condicional diz ao laço que se o valor chegar no 
                5 o break deverá parar o laço, e isso realmente acontece.
         */
        
        /* Ex02 - No segundo exemplo temos o mesmo objetivo do exemplo 1, mostrar uma contagem de 1 a 10,
                mas nesse exemplo estamos usando um break isolado, sem estar dentro de um if condicional,
                note como é sem sentido, ele simplesmente pára a execução.
         */

        /* Ex03 - Nesse exemplo vemos como o break se comporta quando usado com laços aninhados. Note que
                quando o valor de "i" é "1", o break para a impressão que seria gerada no for interno.
                
                Mas note também, que usamos um outro exemplo para mostrar oque acontece quando usamos uma 
                label para referenciar ao laço externo. Note que o break vai parar a execução do laço que
                estiver rotulado, sem nem se importar com os laços mais internos.
         */

    }
}
