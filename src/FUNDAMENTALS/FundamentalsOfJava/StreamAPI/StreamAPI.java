package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        //esse consumer foi gerado para facilitar o uso do print
        Consumer<Object> print = System.out::println;


        //Usando o método "of" de Stream...
        Stream<String> langs = Stream.of("Fui", "usando", "of de", "Stream\n");
        langs.forEach(print);


        //Através de uma lista usando o método stream da instância de list...
        List<String> list = Arrays.asList("Fui", "usando", "o método", "stream", "da instância", "de List\n");
        Stream<String> approved = list.stream();
        approved.forEach(print);


        //Através de um array usando "of" de Stream...
        String[] generateByArrayWithOF = {"Fui", "usando", "array", "com of", "de Stream\n"};
        Stream.of(generateByArrayWithOF).forEach(print);


        //Através de um array usando "stream" de Arrays...
        String[] generateByArrayWithStream = {"Fui", "usando", "array", "com stream", "de Arrays\n"};
        Arrays.stream(generateByArrayWithStream).forEach(print);


        //CRIAÇÃO DE PARALLEL STREAMS!!!
        /*Criando uma parallelStream, veja como fica fora de ordem por que os valores são operados
        simultaneamente...*/

        //Através de uma list usando o método "parallelStream" da instância de List...
        List<String> abc = Arrays.asList("a", "b", "c", "d", "e");
        abc.parallelStream().forEach(print);


        //Transformando uma stream em parallel, usando o método "parallel" da instância de List...
        System.out.println();
        abc.stream().parallel().forEach(print);


        //Através de um Set, usando o método "parallelStream" da instância de Set...
        System.out.println();
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        set.parallelStream().forEach(print);

    }
}

// STREAM API:

/*  A Stream API é uma API interna do java que tem como missão gerar um lista de dados, assim como as List,
*   porém essa lista possuí uma série de benefícios e métodos internos que a fazem funcionar mais como um
*   "fluxo" de dados - daí que vem o nome stream - do que como uma lista estática que precisa de ser atribuída
*   a um laço ou a métodos alheios para poder ser executada.
*
*   Veja abaixo as particularidades e benefícios do uso da Stream API:
*
*       - Laço interno embutido:
*
*           Toda stream possuí um laço interno que funciona automaticamente sem necessidade de gerar
*           laços para gerir a stream. Ao chamar os métodos de stream, esse laços funcionam;
*
*
*       - Métodos Estáticos da API:
*
*           Essa API possuí uma série de métodos estáticos usados para gerar resultados sobre a stream
*           de dados. Com esses métodos podemos filtrar valores (filter), fazer mapeamento de dados
*           (map), redução dos valores a um resultado único através de uma operação (reduce), encontrar
*           valores máximo e mínimo (min e max) e muitas outras funcionalidades (como por exemplo:
*           matchs: all, any e none). Esses métodos podem ser divididos em 3 diferentes tipos de
*           operações:
*
*               # Built Operations:
*                   Métodos usados para criar uma stream, como por exemplo o método "stream()" que foi
*                   usado acima para gerar uma stream a partir de uma lista;
*
*               # Intermidians Operations:
*                   Métodos usados para intermediar operações entre streams, esses métodos têm como
*                   característica receber como parâmetro uma stream de dados, fazer algum tipo de
*                   operação sobre os valores dela e por fim retornar outra stream de dados com os
*                   valores já executados;
*
*               # Terminal Operations:
*                   Métodos usados para devolver um resultado final sobre uma stream de dados. Esses
*                   Métodos tem como característica receber uma stream de dados e devolver um tipo de
*                   dados qualquer;
*
*
*       - Fluxo em Paralelo:
*
*           É possível executar métodos sobre todos os valores em paralelo. Isso agiliza o processo de
*           execução, principalmente em grandes massas de dados;
*
*
*   Veja no exemplo acima como fazemos para criar streams de parallel streams de diferentes maneiras
*   possíveis...
*
* */
