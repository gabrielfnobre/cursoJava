//  LISTS:

/*  A "list" é uma estrutura de dados dentro dos collections onde é possível armazenar valores das seguintes
    formas:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de 
            dados diferente.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa 
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que 
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Aceita valores duplicados:
            A list aceita valores iguais, pois ela também é uma estrutura indexada, o que facilita  o 
            encontro e manipulação de valores, mesmo que eles sejam idênticos;

        # É ordenado:
            A list sempre mantém a ordem de inserção dos valores;

        # É indexado:
            As lists, assim como os arrays, são indexados, o que diferencia uma list de um array é que a 
            list não tem tamanho fixo;

        # Não aceita Tipos Primitivos:
            Não só a list, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á uma list que ele vai 
            aceitar normalmente. Mas o que acontece de verdade é que o java fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente, chamamos esse processo de auto-box;

    Para declarar uma list temos que usar métodos específicos, e cada um desses métodos servem para um propósito
    específico e precisam ser importados da lib java.util para serem utilizados. Seguem os métodos e suas 
    especialidades:

        # ArrayList: Esse é um método que implementa um array dinâmico sobre a list, essa implementação possuí uma
            série de métodos que facilitam a inserção, remoção, busca e etc. Esse é o método que utiliza menos 
            memória, porém ele é mais lento para procurar por valores;

        # LinkedList: Esse método gera uma lista duplamente encadeada, onde cada valor guarda quem é o seu valor 
            antecessor e o valor posterior. Isso facilita a procura por um determinado elemento dentro da lista, 
            fazendo com que a busca seja muito eficiente. Porém, se a busca for feita por através de indexação, 
            ela fica mais lenta. Esse método também armazena mais memória que os demais;

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

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        
        //EX01
        System.out.println("Ex01:");
        ArrayList newList = new ArrayList();
        newList.add("nome");
        newList.add(2);
        newList.add(true);
        newList.add(4.5);

        System.out.println(newList);
        System.out.println();
        
        //EX02
        System.out.println("Ex02:");
        for(int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }
        System.out.println();
        
        //EX03
        System.out.println("Ex03:");
        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Graziela");
        nomes.add("Dario");

        for(String name: nomes){
            System.out.println(name + " Nobre");
        }
        System.out.println();
        
        //EX04
        System.out.println("Ex04:");
        System.out.println(newList.size());
        System.out.println();
        
        //EX05
        System.out.println("Ex05:");
        newList.remove(0);
        System.out.println(newList);
        System.out.println();


    }
    
}
