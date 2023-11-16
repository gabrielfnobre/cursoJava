package FUNDAMENTALS.FundamentalsOfJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ana", "Lia", "Bia", "Gui", "Fê");

        Stream<String> approved = list.stream();
        approved.forEach(System.out::println);

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
*           de dados. Com esses métodos podemos filtrar valores, fazer mapeamento de dados, redução dos
*           valores a um resultado único através de uma operação, encontrar valores máximo e mínimo e
*           muitas outras funcionalidades. Esses métodos podem ser divididos em 3 diferentes tipos de
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
* */
