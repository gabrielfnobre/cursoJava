//  SETS:

/*  O "set" é uma estrutura de dados dentro dos collections onde é possível armazenar valores das seguintes
    formas:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de 
            dados diferente.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa 
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que 
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Não aceita valores duplicados:
            O set não aceita valores iguais, apenas valores diferentes;

        # Pode ser ordenado:

        # Não pode ser indexado:
            Diferente dos arrays e lists, o set não pode ser indexado;

        # Não aceita Tipos Primitivos:
            Não só o set, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á um set que ele vai 
            aceitar normalmente. Mas o que acontece de verdade é que o set fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente.

    Para declarar o set temos que usar métodos específicos, e cada um desses métodos servem para um propósito
    específico e precisam ser importados da lib java.util para serem utilizados. Seguem os métodos e suas 
    especialidades:

        # HashSet: Um método que utiliza uma tabela de dispersão (hash table) para armazenar os elementos. 
            Ela fornece uma busca, inserção e remoção muito eficientes, com complexidade O(1) em média. No 
            entanto, não mantém uma ordem específica dos elementos;
            
            OBSERVAÇÃO SOBRE COMPLEXIDADE O(n): Complexidade O(n) é uma simbologia usada para indicar a 
            velocidade com a qual um programa executa operações sobre uma massa de dados sem perder o 
            desempenho. O valor de "n" mostra quantos dados são operados por vez dentro de uma massa de dados, 
            como o valor do HashSet é "1", significa que mesmo numa massa de dados absurdamente grande, ele vai 
            usar uma tabela hash (hash table) para procurar 1 único valor específico que combine exatamente com o
            valor hash que está sendo procurado e vai operar sobre esse único valor, não importa quantos valores
            tenham na massa de dados. Ou seja, O(1) significa muita eficiência;

        # LinkedHashSet: Esse método adiciona os elemento á lista de acordo com a  ordem de inserção dos elementos. 
            Isso significa que ao percorrer o conjunto, os elementos serão retornados na ordem em que foram 
            adicionados;

        # TreeSet: Esse método utiliza uma árvore balanceada para armazenar os elementos, garantindo que eles sejam 
            ordenados em ordem ascendente ou de acordo com um comparador personalizado pelo desenvolvedor. Essa 
            implementação é mais lenta para inserção e remoção, mas permite obter os elementos em uma ordem 
            específica.

    Embora o set seja uma estrutura heterogênea, a boa prática de programação pede que sempre usemos o mesmo tipo 
    de dado, mesmo dentro de um set, por isso foi desenvolvido o Generics, usando o Generics conseguimos fazer com
    que até mesmo um set só aceite valores que sejam do mesmo tipo.

    Veja como usamos o Generics:

        Set<String> nomeDaVariavel = new HashSet<>();

        Explicando:
                    - Veja que chamamos pela classe "Set" em seguida, dentro das tags nós colocamos tipo de dado 
                        que nós queremos que o nosso set tenha. Essas tags são o generics, elas querem dizer ao 
                        java que esse set só vai aceitar valores Strings, se tentássemos colocar valores Double ou
                        Integer teríamos um erro de compilação;

                        OBSERVAÇÕES: Por estar se tratando de uma collection o generics só aceitará valores do 
                        tipo objeto como wrappers, objects e arrays. Aqui usamos um Set para declarar a variável
                        mas poderíamos ter usado um HashSet, um TreeSet ou outro.

                    - Note também que quando instanciamos a variável usamos também um generics no método 
                        construtor, note que esse generics em especial está vazio, isso acontece por que o nosso 
                        generics no método construtor não precisa necessáriamente estar com o nome do tipo de dado 
                        que vamos colocar, o java entende que se usarmos um generics vazio o método construtor vai 
                        imitar o mesmo tipo de dado da classe declarante. Esse generics vazio é o que chamamos de 
                        "diamond notation", por causa da sua aparência;

        Veja abaixo exemplos de como declaramos esses métodos...
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Sets {
    @SuppressWarnings({"rawtypes", "unchecked"}) //Usado para suprimir erros...
    public static void main(String[] args){
        
        //Ex01
        System.out.println("Ex01:");
        HashSet exampleHashSet = new HashSet(Arrays.asList("a", "b", "c"));
        exampleHashSet.add(25);
        exampleHashSet.add(4.50);
        exampleHashSet.add(true);
        System.out.println(exampleHashSet);
        System.out.println();
        
        //Ex02
        System.out.println("Ex02:");
        LinkedHashSet exampleLinkedHashSet = new LinkedHashSet();
        exampleLinkedHashSet.add("a");
        exampleLinkedHashSet.add("e");
        exampleLinkedHashSet.add("b");
        exampleLinkedHashSet.add("d");
        exampleLinkedHashSet.add("c");
        System.out.println(exampleLinkedHashSet);
        System.out.println();
        
        //Ex03
        System.out.println("Ex03:");
        TreeSet exampleTreeSet = new TreeSet();
        exampleTreeSet.add("a");
        exampleTreeSet.add("e");
        exampleTreeSet.add("b");
        exampleTreeSet.add("d");
        exampleTreeSet.add("c");
        System.out.println(exampleTreeSet);
        System.out.println();
        
        //Ex04
        System.out.println("Ex04:");
        exampleTreeSet.remove("e");
        System.out.println(exampleTreeSet);
        System.out.println();
        

        //Ex05
        System.out.println("Ex05:");
        TreeSet toJoin = new TreeSet(Arrays.asList("f", "g", "h", "a"));
        exampleTreeSet.addAll(toJoin);
        System.out.println(exampleTreeSet);
        System.out.println();
        
        //Ex06
        System.out.println("Ex06:");
        exampleTreeSet.retainAll(toJoin);
        System.out.println(exampleTreeSet);
        System.out.println();
        
        //Ex07
        System.out.println("Ex07:");
        exampleTreeSet.clear();
        System.out.println(exampleTreeSet);
        System.out.println();
        
        //Ex08
        System.out.println("Ex08:");
        Set<String> names = new HashSet<>();
        names.add("Gabriel");
        names.add("Graziela");
        names.add("Dario");
        System.out.println(names);
        System.out.println();
        
        //Ex09
        System.out.println("Ex09:");
        for(String name: names){
            System.out.println(name + " Nobre");
        }
        System.out.println();
        
        //Ex10
        System.out.println("Ex10:");
        TreeSet<Integer> carrosDeCorrida = new TreeSet<Integer>();
        carrosDeCorrida.add(5);
        carrosDeCorrida.add(3);
        carrosDeCorrida.add(1);
        carrosDeCorrida.add(2);
        carrosDeCorrida.add(4);

        for(int carro: carrosDeCorrida){
            System.out.println("O número " + carro + " chegou!!!");
        }
        System.out.println();

    }

    /*  Ex 01 - Nesse exemplo note primeiramente que usamos a biblioteca "Arrays" usando o método asList para atribuir
                uma série de valores todos de uma única vez para o set. Veja também que após atribuir os valores, nós 
                fizemos novas atribuições usando o método "add()", veja que temos tipos de dados diferentes em cada 
                atribuição, ainda assim, o java não reclama, pois os sets são estruturas heterogêneas e aceitam todos 
                os tipos de dados. Note por fim que essas dados ficam desordenados dentro do set, quando usamos 
                HashSet o java não se importa com a ordem de inserção dos dados, eles entram de qualquer jeito no 
                set, se dermos sorte eles ficarão na ordem em que foram colocados. A importância do HashSet é só 
                atribuir um hash aos elementos para que eles possam ser operados com facilidade depois;
     */
    
     /*  Ex 02 - Aqui já estamos usando o linkedHashSet, veja que o linkedHashSet já possuí a missão de fazer com que
                os valores sejam atribuídos na mesma ordem em que chegaram. Ele usa o hash como um temporizador, 
                gravando o momento em que cada valor entrou para que nenhum fure a fila;
     */
    
     /*  Ex 03 - Já o TreeSet, o que importa para dele é se a ordem está ascendente, note que atribuímos as letras fora
                de ordem no set, mas o TreeSet fez o papel dele, colocando todas as letras em ordem ascendente.
     */
     
     /*  Ex 04 - Aqui estamos mostrando um método muito utilizado no set que é o "remove()", note que ele remove um 
                valor que passarmos como parâmetro para o método. Esse método por padrão retorna "true" se o valor 
                realmente existir dentro do set e false se o valor não existir;
     */
     
     /*  Ex 05 - Aqui estamos vendo o método "addAll()" em ação, esse método funciona como uma união, ele pega 2 sets
                e junta todos os valores que tiverem nos dois - sem duplicar valores é claro;
     */
     
     /*  Ex 06 - Aqui vemos o método "retainAll()" esse método pela tudo que tiver num set que também tiver no outro
                set e mantém no set que está sendo usado para chamar esse método. Isso é o que chamamos de intersecção;
     */
     
     /*  Ex 07 - Aqui temos o método "clear()", esse método limpa todo o set, deixando ele zerado;
     */
     
     /*  Ex 08 - Nesse exemplo já temos o que o java considera um "set seguro", que seria um set que utiliza por 
                obrigação o mesmo tipo de dado (set homogêneo). Que é um set usando generics para demilimtar que apenas
                valores do tipo String entrem no set. Note também que estamos usando "diamond notation" para instanciar
                o set;
     */
     
     /*  Ex 09 - Aqui temos a demonstração de uma grande vantagem de se usar sets com generics, usar laços for neles, 
                como eles possuem o mesmo tipo de dados dá pra usar laços for sem problemas;
     */
     
     /*  Ex 10 - Aqui estamos exemplificando que dá para declarar sets com generics mesmo que a classe declarante não
                seja a classe "Set", estamos usando um "TreeSet", mas qualquer classe do conjunto set poderia ser 
                usada. Note também que estamos usando um generics com a declaração de tipo de dado explícita no
                método construtor. Veja também outra coisa interessante no laço for, note que não estamos usando um
                wrapper no for para iterar sobre os valores do set, em vez disso, estamos usando um "int" para iterar
                sobre "Integer", o código funciona sem dar erro. Isso acontece por que o java automaticamente 
                consegue converter os valores de Interger para int, isso se chama "Auto Box";
     */
    
}
