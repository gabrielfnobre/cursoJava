package FUNDAMENTALS.FundamentalsOfJava.Generics.PraticeExampleGenerics;

public class GenericsExplained {
    public static void main(String[] args) {

        // 1º EXEMPLO:

        ClassForCast myObjCast1 = new ClassForCast();
        ClassForCast myObjCast2 = new ClassForCast();
        myObjCast1.setMyObject(2);
        myObjCast2.setMyObject(2.0);

        // Note acima que instanciamos as classes criadas com Object para receber
        // quaisquer tipo de parametros...

        //System.out.println(myObjCast1.getMyObject() + myObjCast1.getMyObject());
        //System.out.println(myObjCast2.getMyObject() + myObjCast2.getMyObject());

        // Descomente os trechos acima e note que é impossível somar os resultados
        // diretamente, pois o que nos é retornado são "Objects", seria necessário
        // fazer um cast em cada um antes de somar, como é mostrado abaixo...

        System.out.println((int) myObjCast1.getMyObject() + (int) myObjCast1.getMyObject());
        System.out.println((double) myObjCast2.getMyObject() + (double) myObjCast2.getMyObject());
        System.out.println((int) myObjCast1.getMyObject() + (double) myObjCast2.getMyObject());


        // 2º EXEMPLO:

        ClassForGenerics<Integer> myObjGen1 = new ClassForGenerics<>();
        ClassForGenerics<Double> myObjGen2 = new ClassForGenerics<>();

        // Note que no momento em que instaciamos a classe já lhe dizemos qual deve
        // ser o retorno...

        myObjGen1.setMyObject(2);       //Se tentássemos atribuir tipos diferentes
        myObjGen2.setMyObject(2.0);     //o código nem compilaria...

        System.out.println(myObjGen1.getMyObject() + myObjGen2.getMyObject());

        // Veja acima que é a soma é feita de forma automática sem a necessidade de
        // usar cast, pois o que nos é retornado são os tipos de dados diretamente
        // ao invés de um object...

    }
}

/*  GENERICS EXPLANADO
*
*   O Generics, como o próprio nome diz, tem a missão de tornar classes, interfaces e
*   métodos em elementos "genéricos" que podem aceitar qualquer tipo de dados. Isso
*   significa que qualquer classe genérica pode aceitar qualquer tipo de dado e fazer
*   com que sejam operados sobre a regra da classe não importa o tipo de dado que se-
*   ja.
*
*   Isso torna o nosso código muito mais reutilizável, pois uma mesma classe ou méto-
*   do poderá ser replicada para vários tipos de dados diferentes sem a necessidade
*   de geração de uma classe nova para fazer a mesma operação que uma classe já cria-
*   da faria.
*
*   Como fazemos para declarar uma classe, interface ou método como genérico?
*
*       Para isso usamos a notação "<T>", onde:
*
*           * "<" e ">" - são o par de tags, assim como no HTML, que definirão um
*                           nome fantasia para o nosso tipo genérico;
*
*           * "T" - é o nome fantasia do tipo genérico, podemos colocar qualquer no-
*                           me ou letra, desde que não tenha espaço entre as letras.
*                           geralmente o que é mais usado é a letra "T" (tipo) mesmo
*                           em maiúsculo. Quando usamos uma estrutura de chave e va-
*                           lor geralmente usa-se "K" (key) e "V" (value).
*
*       Para usar nas classes e interfaces fazemos assim:
*
*           public class Example<T> { ...
*
*               Onde o <T> define que qualquer método ou atributo que tiver "T" como
*               seu tipo genérico terá o tipo de dado informado no momento em que a
*               classe for instanciada. Esse mesmo exemplo se aplica a interface.
*
*               OBSERVAÇÃO: Quando uma classe já definida como genérica, não temos a
*                           necessidade de usar o par de "<>" nos métodos para defi-
*                           ní-los como genéricos também. Basta usarmos o nome do
*                           tipo genérico, por exemplo "T", para definir o método
*                           como genérico.
*
*                           Outra coisa importante, não precisamos obrigar a classe
*                           genérica a ter métodos genéricos. Uma classe genérica
*                           pode ser genérica mesma que não tenha nenhum método ge-
*                           nérico.
*
*       Para usar nos métodos fazemos assim:
*
*           public <T> methodName(T type){ ...
*
*               O exemplo de cima serve para quando uma classe não é genérica. Nes-
*               ses casos temos que usar o par de "<>" para mostrar ao java que es-
*               se método é genérico.
*
*           public T methodName(T type){ ...
*
*               O exemplo acima serve para quando a nossa classe já é genérica.
*               Nestes casos não é necessário usar o par "<>".
*
*
*   Talvez você pense, não seria menos trabalhoso fazer um "cast"?
*
*   Na verdade não! Pois existe uma diferença essencial entre o "cast" e o "generics",
*   enquanto os cast ocorrem em tempo de execução os generics ocorrem em tempo de
*   compilação. Ou seja, qualquer erro gerado em um generics será pego no momento da
*   compilação do código, enquanto as excessões geradas pelo cast serão pegas enquan-
*   to o usuário estiver utilizando a aplicação.
*
*   Isso sem falar o ganho de eficiência durante a execução. Pois cast são operados
*   durante a execução do código, o que acarreta e maior uso de memória e processa-
*   mento. Enquanto os generics já ocorreram no momento que o código foi compilado,
*   ou seja, não haverá necessidade de maior uso de memória ou processamento de má-
*   quina só para fazer as conversões de tipo.
*
*   Vamos abordar as vantagens e desvantagens do uso de Generics em Java:
*
*   VANTAGENS:
*
*       - Segurança de Tipo (Type Safety):
*
*               Com Generics, é possível detectar erros de tipo em tempo de compilação,
*               em vez de em tempo de execução. Isso reduz a probabilidade de erros re-
*               lacionados a tipos de dados e torna o código mais robusto.
*
*       - Reutilização de Código:
*
*               Generics permitem escrever código que funciona com uma variedade de ti-
*               pos sem sacrificar a segurança de tipo. Isso resulta em código mais ge-
*               nérico e reutilizável.
*
*       - Eliminação de Casts (Casting):
*
*               Com Generics, há menos necessidade de realizar casts explícitos, o que
*               torna o código mais legível e menos suscetível a erros.
*
*       - Desempenho:
*
*               Não há perda significativa de desempenho ao usar Generics, pois o tipo
*               específico é determinado em tempo de compilação e não em tempo de execu-
*               ção.
*
*   DESVANTAGENS:
*
*       - Complexidade:
*
*               O uso de Generics pode tornar o código mais complexo, especialmente para
*               desenvolvedores iniciantes. A sintaxe pode parecer intimidadora no
*               início.
*
*       - Curva de Aprendizado:
*
*               Entender completamente o uso avançado de Generics pode exigir um certo
*               tempo de aprendizado. Alguns conceitos, como wildcards e tipos genéricos
*               bounded, podem ser um pouco mais complexos.
*
*       - Restrições em Tipos Primitivos:
*
*               Java Generics não suporta tipos primitivos diretamente (int, char, etc.).
*               Em vez disso, você precisa usar as classes correspondentes (Integer, Cha-
*               racter, etc.).
*
*       - Erros de Compilação Complexos:
*
*               Às vezes, mensagens de erro de compilação relacionadas a Generics podem
*               ser complexas e difíceis de entender, especialmente quando envolvem wild-
*               cards e tipos complexos.
*
*   Em geral, os benefícios do uso de Generics em Java superam as desvantagens, e eles
*   desempenham um papel fundamental na criação de código mais seguro, genérico e reuti-
*   lizável.
*
*   A complexidade associada ao uso de Generics geralmente diminui à medida que os desen-
*   volvedores ganham mais experiência com a linguagem.
*
*   Veja o exemplo acima onde mostramos a vantagem de usar generics ao invés de usar
*   cast. Vá para a classe "ClassForCast"...
*
 */
