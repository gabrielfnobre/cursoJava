//  MATRIZES:

/*  Matrizes são arrays encadeados que usamos quando queremos armazenar uma lista que 
    contém listas de valores, podemos entender melhor no exemplo abaixo...
                     _____________________________
                    |     |     |     |     |     |
                    |  1  |  2  |  3  |  4  |  5  |
                    |_____|_____|_____|_____|_____|
                    |     |     |     |     |     |
                    |  A  |  D  |  G  |  J  |  M  |
                    |_____|_____|_____|_____|_____|
                    |     |     |     |     |     |
                    |  B  |  F  |  H  |  K  |  N  |
                    |_____|_____|_____|_____|_____|
                    |     |     |     |     |     |
                    |  C  |  E  |  I  |  L  |  O  |
                    |_____|_____|_____|_____|_____|

    No exemplo acima temos uma lista de 5 espaços onde cada espaço contém 3 caracteres
    alfabéticos. Por exemplo, para acessar a letra "H" teríamos que navegar até a 
    lista "3" e ir no caracter que está no índice 2 dessa lista, assim encontraríamos 
    o caractere "H".

    Essa é uma matriz simples, podemos ter matrizes muito mas encadeadas em muito mais
    níveis.

    Como criar matrizes em java? Basta criarmos um array que terá como valores, outros
    arrays dentro dele, que por sua vez poderão ter mais arrays como valor e assim por
    diante.

    A sintaxe seria algo assim:

        int a[][] = new int[3][5]

        Explicando:
            - Temos acima uma matriz de 2 níveis;
            - Onde temos 3 listas (1º nível);
            - Cada lista contém 5 espaços para valor (2º nível);

    Se quiséssemos acessar o 3º valor da lista 2, faríamos o seguinte:

        a[1][2]

        Explicando:
            - A segunda lista equivale ao índice 1 do primeiro nível, já que arrays
                começam a ser indexados à partir do 0;
            - Para acessar o 3º valor teríamos que usar o índice 2 do segundo nível;

    Vejamos um exemplo onde vamos recriar a matriz desenhada acima usando código:

*/

import java.util.Arrays;

public class Matrices{
    public static void main(String[] args) {
        //Ex01
        char wordMatrices[][] = new char[5][3];
        char characters[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','0'};

        //Ex02
        int k = 0;

        //Ex03
        for(int i = 0; i < wordMatrices.length; i++){
            for(int j = 0; j < wordMatrices[i].length; j++){
                wordMatrices[i][j] = characters[k];
                k++;
            }
            System.out.printf("Lista %d: %s\n", (i + 1), Arrays.toString(wordMatrices[i]));
        }
    }

     /*  Ex01 - Note aqui que, como estamos iniciando a matriz, vamos usar "char" por vamos 
               armazenar apenas caracteres. Note que usamos a sintaxe com os 2 colchetes. 
               Abaixo criamos um array que contém todas as letras que vamos usar para 
               atribuir as listas da matriz; 
     */
    
     /*  Ex02 - A variável "k" será usada como contador para os valores que queremos 
                buscar no array que contém as letras, já deveremos iterar sobre ele 15 
                vezes para buscar todas as letras, precisamos de um contador que que 
                guarde esses valores para nós;
     */
     
     /*  Ex03 - Aqui temos os laços for encadeados, o laço externo serve para:
                    - Iterar sobre as 5 listas que queremos criar;
                    - Imprimir ao final de cada iteração da lista os valores que foram 
                        atribuídos sobre a lista atual da iteração;
                
                Enquanto o laço interno serve para:
                    - Atribuir os próximos 3 caracteres da lista de caracteres sobre a 
                        lista atual da iteração do laço for externo;
                    - Incrementar o valor da variável "k";
     */
}