package CONSULTA_RAPIDA_ARQUIVOS.CONTINUE;

//  CONTINUE:

/*  O continue é uma estrutura de controle usada para pular uma iteração de
    laços de repetição sem parar as outras, sempre que um cotinue estiver dentro 
    de um laço como "while", "for" ou "do while" o continue vai pular àquela 
    determinada iteração.

    Em geral, usamos o continue dentro de um bloco if, pois geralmente queremos 
    que o continue seja usado quando atingir uma condição. Usar o continue sem o 
    bloco if é sem sentido, pois ele simplesmente não faz nada.

    OBSERVAÇÕES: USO DE CONTINUE EM LAÇOS FOR ANINHADOS: Sempre que usamos um 
                continue em laços for aninhados, o continue vai referenciar ao 
                laço mais próximo à ele (o laço mais interno a ele), ele não vai 
                pular todos os laços "for", somente o laço onde ele foi 
                referenciado. Muito embora, seja possível usar continue rotulado 
                para referenciar um laço externo;

    CUIDADO! É possível usar um continue referenciando a uma label, mas essa é uma 
            usabilidade muito mau vista no mundo da programação, pois pode gerar 
            muita confusão. Imagine um código grande usando vários laços for 
            aninhados e continues rotulados dentro desses laços, imagine o 
            problemão que seria dar manutenção num código desses. Por isso, muito 
            e muito cuidado ao usar continues rotulados, o ideal é não usar.
 */

public class ContinueExample {
    public static void main(String[] args){

        //Ex01
        for (int i = 1; i <= 10; i++) {
            if(i == 5){
                System.out.println("PULEI!");
                continue;
            }
            System.out.println(i);
        }
        
        //Ex02
        System.out.println("\nEx02");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            continue;
        }
        

        //Ex03
        System.out.println("\nEx03");
        System.out.println("Sem o label para o for externo");
        for (int i = 1; i <= 2; i++) {
            System.out.println(i + " fora");
            for (int j = 1; j <= 2; j++) {
                if(i == 1){
                    continue;
                }
                System.out.println("\t" + j + " dentro");
            }
        }
        
        System.out.println("\nCom o label para o for externo");
        externo: for (int i = 1; i <= 2; i++) {
            System.out.println(i + " fora");
            for (int j = 1; j <= 2; j++) {
                if(j == 1){
                    continue externo;
                }
                System.out.println("\t" + j + " dentro");
            }
        }

        /* Ex01 - Nesse exemplo temos o uso comum de um continue dentro de uma condicional if, o objetivo 
                do laço é contar de 1 a 10, mas note que a condicional diz ao laço que se o valor chegar 
                no 5 o continue deve imprimir a palavra "PULEI!" e pular a iteração que imprimiria o 
                número 5 no console, e isso realmente acontece.
         */
        
        /* Ex02 - No segundo exemplo temos o mesmo objetivo do exemplo 1, mostrar uma contagem de 1 a 10,
                mas nesse exemplo estamos usando um continue isolado, sem estar dentro de um if 
                condicional, note como é sem sentido, ele simplesmente não faz nada.
         */

        /* Ex03 - Nesse exemplo vemos como o continue se comporta quando usado com laços aninhados. Note 
                que quando o valor de "j" é "1", o continue pula a impressão que seria gerada no for 
                interno.
                
                Mas note também, que usamos um outro exemplo para mostrar oque acontece quando usamos uma 
                label para referenciar ao laço externo. Note que o continue pula 2 vezes o laço for
                interno, pois ele está referenciando o laço externo, fazendo com que ele ignore qualquer
                laço interno que deveria ser impresso.
         */

    }
}
