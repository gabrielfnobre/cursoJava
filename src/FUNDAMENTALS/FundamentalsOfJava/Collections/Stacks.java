package FUNDAMENTALS.FundamentalsOfJava.Collections;

//  STACKS:

/*  A "stack", do inglês "pilha", é uma estrutura de dados dentro dos collections onde é possível armazenar
    valores como se eles estivem numa pilha, onde o último a entrar fica em primeiro lugar na fila (LIFO).
    A stack foi criada justamente para operar primeiramene sobre os últimos itens que foram colocados,
    suas operações de inserção e inclusão sempre serão feitas sobre os itens que foram colocados por último.

    Veja algumas características das stacks:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de
            dados diferentes.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Aceita valores duplicados:
            A stack aceita valores iguais, pois como ela trabalha com o método LIFO, para ela tanto faz
            se os valores são repetidos, ela vai adicioná-los a stack e operá-los sempre em LIFO;

        # É ordenada:
            A list sempre mantém a ordem de inserção dos valores e retira os valores que entraram por último;

        # Não é indexada:
            As stacks não guardam ids de seus valores, afinal para ela o que importa é a ordem de chegada dos
            valores e a ordem em que eles vão sair;

        # Não aceita Tipos Primitivos:
            Não só a stack, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á uma stack que ela iría
            aceitar normalmente. Mas o que acontece de verdade é que o java fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente, chamamos esse processo de auto-box;

    Para declarar uma stack temos que usar métodos específicos de implementação, e cada um desses métodos
    servem para um propósito específico e precisam ser importados da lib java.util para serem utilizados.
    Seguem os métodos e suas especialidades:

        # ArrayDeque: Essa é de longe a implementação mais usada de uma stack. Embora seja uma implementação de
            deque (double-ended queue), a classe ArrayDeque pode ser usada como uma pilha, já que suporta operações
            de inserção e remoção no início e no final da fila. É geralmente mais eficiente do que a classe Stack e
            é a escolha preferida para implementar uma pilha em Java.

        # Stack: É a implementação básica de uma pilha em Java, que é baseada em um vetor (array). No entanto, a
            classe Stack é considerada legada e não é recomendada para uso em novos desenvolvimentos. Recomenda-se
            o uso da interface Deque ou da classe ArrayDeque como alternativas mais eficientes.

        # LinkedList: A classe LinkedList também pode ser usada para implementar uma pilha. Ela suporta operações
            de inserção e remoção no início da lista, o que é adequado para uma pilha. No entanto, a classe
            LinkedList não é tão eficiente quanto a ArrayDeque em termos de acesso e desempenho geral.

    Embora a stack seja uma estrutura heterogênea, a boa prática de programação pede que sempre usemos o mesmo tipo
    de dado, por isso foi desenvolvido o Generics, usando o Generics conseguimos fazer com que até mesmo uma queue
    só aceite valores que sejam do mesmo tipo.

    Veja como usamos o Generics:

        ArrayDeque<String> nomeDaVariavel = new ArrayDeque<>();

        Explicando:
                    - Veja que chamamos pela classe "ArrayDeque" em seguida, dentro das tags nós colocamos tipo de
                        dado que nós queremos que a nossa stack tenha. Essas tags são o generics, elas querem dizer
                        ao java que essa stack só vai aceitar valores Strings, se tentássemos colocar valores
                        Double ou Integer teríamos um erro de compilação;

                        OBSERVAÇÕES: Por estar se tratando de uma collection o generics só aceitará valores do
                        tipo objeto como wrappers, objects e arrays.

                    - Note também que quando instanciamos a variável usamos também um generics no método
                        construtor, note que esse generics em especial está vazio, isso acontece por que o nosso
                        generics no método construtor não precisa necessáriamente estar com o nome do tipo de dado
                        que vamos colocar, o java entende que se usarmos um generics vazio o método construtor vai
                        imitar o mesmo tipo de dado da classe declarante. Esse generics vazio é o que chamamos de
                        "diamond notation", por causa da sua aparência;

        Veja abaixo exemplos de como declaramos esses métodos...
 */


import java.util.*;

public class Stacks {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01:");

        Stack pilhaComum = new Stack();
        pilhaComum.add("one");
        pilhaComum.add(2);
        pilhaComum.add(3.0);
        pilhaComum.add(false);
        System.out.println(pilhaComum);
        System.out.println();

        //Ex02
        System.out.println("Ex02:");

        System.out.println(pilhaComum.peek());

        pilhaComum.clear();
        try{
            pilhaComum.peek();
        } catch (EmptyStackException e){
            System.out.println("Não tem nada nessa pilha!");
        }
        System.out.println();


        //Ex03
        System.out.println("Ex03");

        ArrayDeque pilhaVazia = new ArrayDeque();
        System.out.println(pilhaVazia.peek());
        try {
            System.out.println(pilhaVazia.element());
        } catch (NoSuchElementException e){
            System.out.println("Essa pilha está vazia!");
        }
        System.out.println();


        //Ex04
        System.out.println("Ex04:");

        ArrayDeque stackMelhorado = new ArrayDeque(Arrays.asList(1, 2, 3, 4, 5));
        stackMelhorado.push(6);
        System.out.println(stackMelhorado.pop());
        System.out.println(stackMelhorado.poll());
        System.out.println(stackMelhorado.remove());
        System.out.println(stackMelhorado.pop());
        System.out.println(stackMelhorado.poll());
        System.out.println(stackMelhorado.remove());
        System.out.println(stackMelhorado.poll());
        try {
            stackMelhorado.pop();
            stackMelhorado.remove();
        } catch (NoSuchElementException e){
            System.out.println("Não é itens para remover a da pilha!");
        }
        System.out.println();


        //Ex05:
        System.out.println("Ex05:");

        ArrayDeque<String> idealDeque = new ArrayDeque<>(Arrays.asList("Gabriel", "Graziela", "Dario"));
        for(String name: idealDeque){
            System.out.println(name + " - O Medo");
        }


        /*  Ex01 -  Aqui estamos exemplificando como gerar uma pilha usando a implementação Stack, note
                    que criamos uma pilha Heterogênea para exemplificar que isso é possível. O Stack é
                    um método antigo que não tem muitas funcionalidades, a maioria dos programadores
                    prefere usar ArrayDeque;
        */

        /*  Ex02 -  Aqui estamos exemplificando como usar alguns métodos de Stack:
                        # peek() - sempre vê qual é o último elemento que entrou na pilha, se não tiver
                                    elemento nenhum, ele retorna uma excessão (no caso da implementação
                                    Stack);

                        # clear() - limpa toda a pilha;
        */

        /*  Ex03 -  Aqui estamos mostrando a diferença que é fazer uma implementação com ArrayDeque em
                    vez de Stack, note que quando usamos peek numa pilha vazia, o peek não irá ocasionar
                    uma excessão, em vez disso irá nos retornar "null". Além disso, temos o método
                    "element", ele faz a mesma coisa que o "peek", mas ao ser operado numa pilha vazia
                    nos retorna uma excessão;
        */

        /*  Ex04 -  Veja nesse exemplo que:
                        # É possivel declarar uma pilha já inicializada em ArrayDeque, usanda classe
                            "Arrays" e o método "asList", isso não seria possível no "Stack";

                        # Método "push()", além do "add", temos esse método para adicionar valores á
                            pilha;

                        # Método "pop()" e "remove()", são métodos que removem o último elemento que
                            foi incluso na pilha, só que, quando a pilha está vazia e tentamos
                            operar esses métodos eles irão retornar uma excessão;

                        # Método "poll", também remove o último elemento da pilha, mas em vez de
                            retornar uma exceção ele retorna "null";
        */

        /*  Ex05 - Neste exemplo mostramos a forma ideial de se gerar uma stack, gerando stacks
                    homogêneas, e usamos um laço for each para mostrar que isso é possível em
                    stacks homogêneas;
        */

    }

}