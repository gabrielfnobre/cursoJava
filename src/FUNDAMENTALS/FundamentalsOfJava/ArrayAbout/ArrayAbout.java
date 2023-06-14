// SOBRE ARRAY:

/*  O array é uma estrutura de dados do Java onde é possível que possamos colocar uma coleção de 
    dados de forma indexada.

    Quais são as características de um array em Java?
    Observe a sintaxe de como um array é declarado:

        double[] arrayValues = new double[7];

        Explicando:
                -   Note que o que todo array deve ter apenas um tipo de dado, o array acima por 
                    exemplo é um array que conterá apenas tipos double. Isso significa que 
                    arrays são estruturas homogêneas (apenas um tipo de dado);

                -   Um array deve conter os colchetes após a declaração do tipo, é isso que 
                    mostra que um array é um array;

                -   Um array deve ser armazenado em um espaço de memória, como uma variável, no 
                    caso, esse array está armazenado em "arrayValues";

                -   Um array deve ser instanciado com a palavra reservada "new", note que não o 
                    instanciamos sobre a palavra reservada "Array" como em algumas linguagens,
                    em vez isso usamos novamente o nome do tipo primitivo junto aos colchetes,
                    porém, no java, os arrays deverão ser declarados com um número máximo de 
                    indexação. No caso acima, temos um array que no máximo poderá ter 7 valores;

    Exemplificando o que foi feito acima por através de uma imagem, separando as características
    básicas de um array, teríamos o seguinte:

            ---------> Estático              -----------> Estrutura Indexada
            |                              __|__
            |                             |     | 
            |               __0_____1_____2_____3_____4_____5_____6__
            |              |     |     |     |     |     |     |     |
    double [7] arrayValues | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 | 1.2 |
       |             |     |_____|_____|_____|_____|__|__|__|__|_____|
       |             |                                |_____|
       |             ----> Referencia a                  | 
       ---> Estrutura        um espaço                   -----------> Estrutura Homogênia
             Tipada        de memória em
                               comum         

       Explicando:
    
            # Estrutura Tipada: Significa que todo array deve ser definido com base em um tipo;
            
            # Estático: No java os arrays devem ser declarados sempre com um número máximo de 
                        alocação. Caso quiséssemos aumentar o tamanho de um array, devemos 
                        fazer uma reatribuição sobre a variável, atribuindo um array com uma
                        quantidade maior de alocação e copiando os valores antigos para os
                        novos;

            # Referência a um único espaço de memória em comum: Os array sempre deverão ser 
                        alocados num espaço de memória em comum por através de uma variável;

            # Estrutura Indexada: os valores alocados podem ser referenciados por um valor 
                        índice, que vai de 0 até o valor máximo da alocação - 1;

            # Estrutura Homogênea: todos os arrays em java só podem aloca 1 único tipo de dado
                        não podem alocar tipos de dados diferentes;

    Veja alguns exemplos abaixo para ver outras formas de declarar arrays e certas nuâncias do 
    tipo array...

 */

import java.util.Arrays; 

public class ArrayAbout {
    public static void main(String[] args){
        //Ex01
        double[] notasAlunoA = new double[3];
        double [] notasAlunoB = {5.6, 6.9, 8.7};
        double notasAlunoC[] = new double[3];

        //Ex02
        System.out.println("Ex02:");
        System.out.println(notasAlunoA);
        System.out.println(Arrays.toString(notasAlunoA) + "\n");
        
        //Ex03
        notasAlunoA[0] = 6.3;
        notasAlunoA[1] = 8.3;
        notasAlunoA[2] = 9.5;
        System.out.println("Ex03:");
        System.out.println(Arrays.toString(notasAlunoA) + "\n");
        
        //Ex04
        System.out.println("Ex04:");
        for(int i = 0; i < notasAlunoB.length; i++){
            System.out.println("A " + (i + 1) + "ª nota foi: " + notasAlunoB[i]);
        }
        System.out.println();
        
        //Ex05
        double[] notasSalvas = {4.5, 6.7, 7.5};
        System.out.println("Ex05:");
        for(int i = 0; i < notasAlunoC.length; i++){
            notasAlunoC[i] = notasSalvas[i];
        }
        System.out.println(Arrays.toString(notasAlunoC));
    }

    /*  Ex01 - Aqui vemos 3 formas diferentes em que podemos declarar um array:
                1ª forma: Essa é a forma mais comum, usando os colchetes logo após a declaração do 
                        tipo de dado que o array vai ter, e na sequência usamos a palavra 
                        reservada new para instânciar um novo array sem inicía-lo de fato. Essa é
                        a forma mais comum pois geralmente, pegamos valores à partir de um banco
                        de dados para poder alimentar um array, por isso geralmente só o iniciamos
                        e somente depois atribuímos valores pegos do banco de dados para ele;

                2ª forma: Note que usamos os colchetes entre o tipo primitivo e o nome da variável,
                        essa é uma forma bem incomum, mas também pode ser usada. E na sequência 
                        já inicializamos o array, tornando um array com o tamanho fixo de 3 e com
                        os 3 valores já inclusos. Essa é a forma mais incomum. Note que para 
                        inicializar um array em java usamos chaves "{}" invés de "[]" para fazer 
                        a atribuição dos valores;

                3ª forma: Aqui estamos apenas mostrando que também é possível iniciar um array 
                        colocando os colchetes só após a declaração do tipo primitivo e da 
                        variável;

        Ex 02 - Note nesse exemplo que não é possível à principio imprimir um array completo só 
                usando "println", isso acontece por que o println procura acessar o método toString
                do objeto do tipo primitivo, no caso do array, oque ele armazena no método toString
                é uma referência do tipo de primitivo, no nosso caso é o "[D" por ser um double e
                na sequência temos um número hexadecimal que leva para o endereço de memória do 
                array.
                Note que para imprimir o valor do array foi necessário importar a classe "Arrays" 
                do java.util para usar o método "toString" para poder enxergar os valores totais do
                array. Outra coisa interessante, note que sempre que uma variável é iniciada por 
                padrão ela irá auto-atribuir os valores padrão do tipo primitivo. Nesse caso, como 
                estamos usando double o valor padrão é 0.0;

        Ex 03 - Nesse exemplo veja como fizemos para atribuir valores ao array que foi declarado, 
                para acessar os valores nós simplesmente usamos a notação de colchetes (também 
                chamada de notação índice) para acessar os índices e fazer atribuição á eles;

        Ex 04 - Aqui estamos usando um laço "for" para mostrar que geralmente usamos laços para 
                iterar entre os valores de um array fazendo operações nestes valores;

        Ex 05 - Aqui temos um outro exemplo para mostrar como geralmente fazemos, que é pegando 
                valores pré-existentes de algum lugar e atribuímos sobre um array usando um 
                laço "for";
     */
}
