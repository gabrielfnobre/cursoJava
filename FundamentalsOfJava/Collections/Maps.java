package Collections;

//  MAPS:

/*  Os "maps", do inglês "mapeamentos", são estruturas de dados dentro das collections onde é
    possível armazenar valores como uma estrutura de "chave-valor" (key-value), onde é possível
    armazenar um conjunto de dados que referencie a uma chave com nome, numeral ou qualquer outro tipo
    de dado (desde que seja um object ou wrapper), que servirá como um indicador para os dados
    armazenados no campo de valores.

    Veja algumas características dos maps:

        # Heterogêneos ou Homogêneos:
            Por padrão, todas as implementações do map são homogêneas, mas podemos importar
            implementações que possam gerar maps heterogêneos ou usar o Object para gerar qualquer
            tipo de dado que quisermos numa implementação, embora isso não seja uma boa prática;

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura
            que seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Aceita valores duplicados mas não chaves duplicadas:
            Os maps podem até aceitar valores iguais, mas chaves iguais ele não aceita, afinal, cada
            chave deve ser única para referenciar os seus valores da forma correta;

        # Não é ordenada:
            Os maps não são ordenados, tampouco armazenam os valores na mesma ordem, você notará ao
            armazenar valores num map que as chaves são armazenadas de forma qualquer. Pois ordenação
            não é algo importante para um map, afinal o foco do map é referenciar valores por através
            de suas chaves;

        # Não é indexada:
            Maps também naõ são indexados, afinal eles não precisam disso, pois todas as referências
            são feitas por através de chaves;

        # Não aceita Tipos Primitivos:
            Não só os maps, como todas as collections, não aceitam tipos primitivos, elas só aceitam
            tipos que sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á um map que ele
            iría aceitar normalmente. Mas o que acontece de verdade é que o java fará a conversão do
            valor de tipo primitivo para um tipo wrapper correspondente, chamamos esse processo de
            auto-box;

    Para declarar um map temos que usar métodos específicos de implementação, e cada um desses
    métodos servem para um propósito específico e precisam ser importados da lib java.util para serem
    utilizados.

    Seguem os métodos e suas especialidades:

        # HashMap: Essa é a mais comum e a mais simples, fornecendo uma série de funcionalidades as
                    maps, porém implementa as chaves de forma desordenada;

        # TreeMap: É uma implementação que mantém a ordem dos elementos com base na sua ordenação
                    natural (por exemplo: 1, 2, 3 ou A, B, C) ou em um Comparator fornecido. Os
                    elementos são armazenados em uma árvore balanceada;

        # LinkedHashMap: É uma implementação que mantém a ordem de inserção dos elementos. Ela é
                    semelhante ao HashMap, mas adiciona uma lista vinculada que preserva a ordem de
                    inserção;

    Embora os maps sejam estruturas heterogêneas, a boa prática de programação pede que sempre usemos
    o mesmo tipo de dado, por isso foi desenvolvido o Generics, usando o Generics conseguimos fazer
    com que até mesmo maps só aceitem valores que sejam do mesmo tipo.

    Veja como usamos o Generics:

        HashMap<Integer String> nomeDaVariavel = new HashMap<>();

        Explicando:
                    - Veja que chamamos pela classe "HashMap" em seguida, dentro das tags nós
                        colocamos o tipo de dado que nós queremos que a nossa chave tenha e que os
                        nossos valores tenham, no exemplo acima queremos que as chaves sejam números
                        inteiros e os valores sejam Strings. Mas podemos colocar qualquer tipo de
                        dado (desde que não seja um tipo primitivo);

                        OBSERVAÇÕES: Por estar se tratando de uma collection o generics só aceitará
                        valores do tipo objeto como wrappers, objects e arrays.

                    - Note também que quando instanciamos a variável usamos também um generics no
                        método construtor, note que esse generics em especial está vazio, isso
                        acontece por que o nosso generics no método construtor não precisa
                        necessáriamente estar com o nome do tipo de dado que vamos colocar, o java
                        entende que se usarmos um generics vazio o método construtor vai imitar o
                        mesmo tipo de dado da classe declarante. Esse generics vazio é o que
                        chamamos de "diamond notation", por causa da sua aparência;

        Veja abaixo exemplos de como declaramos esses métodos...
 */


import java.util.*;

public class Maps {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01:");

        HashMap<Object, Object> mapHetero = new HashMap<>();
        mapHetero.put(1, "valor1");
        mapHetero.put("valor2", 2);
        mapHetero.put(3.0, "valor3");
        mapHetero.put(4, false);
        mapHetero.put(4, true);
        System.out.println(mapHetero);
        System.out.println();

        //Ex02
        System.out.println("Ex02");

        System.out.println(mapHetero.get(3.0));
        System.out.println(mapHetero.containsKey(1));
        System.out.println(mapHetero.containsValue(true));
        System.out.println(mapHetero.entrySet());
        System.out.println(mapHetero.values());
        System.out.println(mapHetero.keySet());
        System.out.println(mapHetero.remove(1));
        System.out.println(mapHetero.remove(1, "valor1"));
        System.out.println(mapHetero.entrySet());
        System.out.println();


        //Ex03
        System.out.println("Ex03");

        TreeMap<String, Integer> mapOrdened = new TreeMap<>();
        mapOrdened.put("E", 1);
        mapOrdened.put("D", 2);
        mapOrdened.put("C", 3);
        mapOrdened.put("B", 4);
        mapOrdened.put("Bobo", 4);
        mapOrdened.put("A", 5);

        System.out.println(mapOrdened.entrySet());
        System.out.println();


        //Ex04
        System.out.println("Ex04:");

        LinkedHashMap<String, Integer> mapLinked = new LinkedHashMap<>();
        mapLinked.put("E", 1);
        mapLinked.put("D", 2);
        mapLinked.put("C", 3);
        mapLinked.put("B", 4);
        mapLinked.put("A", 5);

        System.out.println(mapLinked.entrySet());
        System.out.println();


        //Ex05:
        System.out.println("Ex05:");

        for(Map.Entry<String, Integer> value: mapLinked.entrySet()){
            System.out.println(value);
        }


        /*  Ex01 -  Aqui estamos exemplificando que:
                    # É possível gerar um map com chaves e valores heterogêneos: Note que para isso
                        usamos "Object" para referenciar a qualquer tipo de dado que seja um
                        objeto;
                    # Método "put()": Esse é o método usado para inserir valores sobre um "map", por
                        que não usamos o método "add()"? Por que esse método não existe nos maps,
                        pois o put() tem a função tanto de inserir valores como também de mudar
                        valores, note que fizemos isso com a chave "4", ao usar o put novamente com
                        a chave "4", o valor que já existia na chave "4" anterior foi trocado de
                        "false" para "true";

        */

        /*  Ex02 -  Aqui estamos exemplificando como usar alguns métodos de Map:
                        # get() - retorna o valor de um elemento por através da chave;
                        # containsKey() - retorna true se o valor de uma chave passada existir;
                        # containsValue() - retorna true se um valor passado existir no map;
                        # entrySet() - retorna todas as chaves e valores do map;
                        # values() - retorna todos os valores do map;
                        # keySet() - retorna todas as chaves do map;
                        # remove() - serve para remover chaves e valores, pode ser usado de 2
                            formas: passando só o parâmetro da chave ou passando chave e valor.
                            Em ambos os casos, se for passado uma chave ou valor que não
                            existem ele retornará false e não removerá nada;
        */

        /*  Ex03 -  Aqui estamos exemplificando como usar "TreeMap", note que o objetivo principal
                    do TreeMap é trazer alguma ordem as chaves inseridas no map. Se as chaves
                    forem valores numéricos, ele vai deixar os números na ordem, se forem letras
                    do alfabeto ou palavras ele vai deixá-las na ordem alfabética. Podemos também
                    se desejarmos passar alguma condição para o TreeMap seguir para que possa
                    ordenar as chaves de alguma forma;
        */

        /*  Ex04 -  Aqui estamos exemplificando o LinkedHashMap, note que ele serve para manter a
                    ordem de inserção dos elementos;
        */

        /*  Ex05 - Aqui estamos mostrando como usar um laço "for" para iterar as chaves e valores de
                    um map;
        */

    }

}