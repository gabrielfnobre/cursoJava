package FUNDAMENTALS.FundamentalsOfJava.Collections;

//  QUEUES:

/*  A "queue", do inglês "fila", é uma estrutura de dados dentro dos collections onde é possível armazenar
    valores como se eles estivem numa queue, onde o primeiro a entrar deverá ser o primeiro a sair (FIFO)
    veja algumas características das queues:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de
            dados diferente.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Aceita valores duplicados:
            A queue aceita valores iguais, pois como ela trabalha com o método FIFO, para ela tanto faz
            se os valores são repetidos, ela vai adicioná-los a queue de qualquer forma e retirá-los na
            ordem em que entraram;

        # É ordenada:
            A list sempre mantém a ordem de inserção dos valores e retira os valores de acordo com essa
            ordem;

        # Não é indexada:
            As queus não guardam ids de seus valores, afinal para ela o que importa é a ordem de
            chegada dos valores e a ordem em que eles vão sair;

        # Não aceita Tipos Primitivos:
            Não só a queue, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á uma queue que ela iría
            aceitar normalmente. Mas o que acontece de verdade é que o java fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente, chamamos esse processo de auto-box;

    Para declarar uma queue temos que usar métodos específicos de implementação, e cada um desses métodos
    servem para um propósito específico e precisam ser importados da lib java.util para serem utilizados.
    Seguem os métodos e suas especialidades:

        # LinkedList: Esse é o método mais utilizado para a implementação de uma queue

        # ArrayDeque: É uma implementação de queue de uso geral que usa um array redimensionável como base. Ela
            fornece operações eficientes tanto para adicionar como para remover elementos no início e no final da
            queue.

        # PriorityQueue: É uma implementação de queue que mantém os elementos em uma ordem específica, definida por
            um comparador ou pela ordem natural dos elementos (se forem comparáveis). A PriorityQueue prioriza o
            acesso ao elemento de maior prioridade, com base em sua classificação. Essa implementação é útil
            quando é necessário ter acesso rápido ao elemento de maior prioridade em vez de manter a ordem de
            chegada.

        # ConcurrentLinkedQueue: É uma implementação de queue concorrente que permite acesso e manipulação seguros
            por várias threads simultaneamente. Essa implementação oferece bom desempenho para operações de
            inserção e remoção, tornando-a adequada para ambientes de programação concorrente.

        # LinkedBlockingQueue: É uma implementação de queue com capacidade opcionalmente limitada, adequada para
            uso em cenários de produtor-consumidor. Ela fornece sincronização adequada para garantir a segurança
            nas operações de acesso simultâneo por várias threads.

    Embora a list seja uma estrutura heterogênea, a boa prática de programação pede que sempre usemos o mesmo tipo
    de dado, por isso foi desenvolvido o Generics, usando o Generics conseguimos fazer com que até mesmo uma list
    só aceite valores que sejam do mesmo tipo.

    Veja como usamos o Generics:

        List<String> nomeDaVariavel = new ArrayList<>();

        Explicando:
                    - Veja que chamamos pela classe "List" em seguida, dentro das tags nós colocamos tipo de dado
                        que nós queremos que o nosso list tenha. Essas tags são o generics, elas querem dizer ao
                        java que essa list só vai aceitar valores Strings, se tentássemos colocar valores Double ou
                        Integer teríamos um erro de compilação;

                        OBSERVAÇÕES: Por estar se tratando de uma collection o generics só aceitará valores do
                        tipo objeto como wrappers, objects e arrays. Aqui usamos uma List para declarar a variável
                        mas poderíamos ter usado um ArrayList ou LinkedList.

                    - Note também que quando instanciamos a variável usamos também um generics no método
                        construtor, note que esse generics em especial está vazio, isso acontece por que o nosso
                        generics no método construtor não precisa necessáriamente estar com o nome do tipo de dado
                        que vamos colocar, o java entende que se usarmos um generics vazio o método construtor vai
                        imitar o mesmo tipo de dado da classe declarante. Esse generics vazio é o que chamamos de
                        "diamond notation", por causa da sua aparência;

        Veja abaixo exemplos de como declaramos esses métodos...
 */


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01:");
        Queue fila = new LinkedList<>();

        fila.add("first");
        fila.add("second");
        fila.add("third");
        fila.add("forth");
        fila.add("fifth");

        System.out.println(fila);
        System.out.println();


        //Ex02
        System.out.println("Ex02:");
        ArrayBlockingQueue filaDe5 = new ArrayBlockingQueue(5);

        filaDe5.add(1);
        filaDe5.offer(2);
        filaDe5.add(3);
        filaDe5.offer(4);
        filaDe5.add(5);

        System.out.println(filaDe5.offer(6));

        try {
            filaDe5.add(6);
        } catch (IllegalStateException e){
            System.out.println("O tamanho máximo foi atingido!");
        }

        System.out.println(filaDe5);
        System.out.println();


        //Ex03
        System.out.println("Ex03:");

        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println();

        Queue filaVazia = new LinkedList();
        System.out.println(filaVazia.peek());

        try {
            filaVazia.element();
        } catch (NoSuchElementException e){
            System.out.println("Não tem nada nessa fila");
        }
        System.out.println();


        //Ex04
        System.out.println("Ex04:");

        System.out.println(fila.size());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        try{
            fila.remove();
        } catch (NoSuchElementException e) {
            System.out.println("A fila acabou e uma exceção foi retornada no remove()");
        }

    }

}