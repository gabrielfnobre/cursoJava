package FUNDAMENTALS.FundamentalsOfJava.ErrorsAndExceptions;

import java.util.Arrays;

public class ErrorTypes {
    public static void main(String[] args) {
        //Exemplo de tratamento onde a exceção acontece!
        try {
            divisionByZero();
        } catch (Exception e){ //Note que um objeto de Exception deverá ser recebido!
            System.out.println("Don't stop de run"); //Aqui temos o método que será executado no lugar da
                                                        //exceção.
            System.out.println(e.getMessage()); //Com o objeto de exception temos acesso a métodos que nos
                                                //trazem informações e nos ajudam a tratar a exceção.
        } finally {
            System.out.println("I'm execute anyway"); //Finally será executado se houver exceção ou não!
        }


        //Exemplo de tratamento onde a exceção NÃO acontece!
        try {
            divisionNormal();
        } catch (Exception e){ //Aqui temos o que chamamos de exceção silenciada! Se um erro acontecer nunca
                                // saberemos!
            //never arrives here!!!
        }   finally {
            System.out.println("but I'm execute yet"); //Finally será executado se houver exceção ou não!
        }

        //Exemplo de exceção atribuída a uma variável...
        RuntimeException exception = instanceInVariable(); //Esse método retorna um objeto de
                                                            //RuntimeException
        System.out.println(exception.getMessage()); //Veja que podemos chamar pelos métodos de
                                                    //RuntimeException, como o getMessage, ou...
        StackTraceElement[] stackTrace = exception.getStackTrace();     //O método getStackTrace. Note que
        Arrays.stream(stackTrace).forEach(n -> System.out.println(n));  //nesse exemplo nós imprimimos o
                                                                        //array do tipo "StackTrace"
                                                                        //usando println, mas o erro
                                                                        //não foi lançado!


        //Impressão do erro criado por instancialização...
        instanceOfRuntimeException(); //Por termoa chamado o throw no momento da instancialização
                                        //o código é interrompido e a exceção é mostrada!

    }

    public static void divisionByZero(){
        System.out.println(7 / 0); //Exceção provocada de propósito!
    }
    public static void divisionNormal(){
        System.out.println(7 / 2); //Não haverá erro!
    }

    public static void instanceOfRuntimeException(){ //Exceção criada por instancialização!
        throw new RuntimeException("I'm an exception created by instantiation"); //Veja que throw é
    }                                                                            //necessário para que
                                                                                //o erro seja lançado!

    public static RuntimeException instanceInVariable(){ //Esse método deve retornar um objeto do tipo
        return new RuntimeException("I'm an exception assigned to a variable"); //RuntimeException
    }
}

//      TIPOS DE ERROS

/*      Os erros são uma parte importante de qualquer linguagem de programação, afinal são eles que por
*       através dos logs nos mostram o que há de errado com o nosso código e o que temos que fazer para
*       que ele possa se tornar funcional.
*
*       No java existem pelo menos 2 tipos de erros:
*
*           *   ERROS DE COMPILAÇÃO:
*
*               São erros gerados quando tentamos compilar o nosso arquivo ".java" para bytecode
*               (arquivo ".class"). Esses erros geralmente acontecem quando tomamos alguma ação que
*               torna impossível a compilação do nosso arquivo, por exemplo: um erro de sintaxe ou um
*               desvio de regra referente a linguagem. Por exemplo, tente abrir um bloco de código sem
*               fechá-lo dentro de um método main e tente compilá-lo, o java não permitira que um
*               bytecode seja gerado.
*
*
*           *   ERROS EM TEMPO DE EXECUÇÃO:
*
*               São erros gerados enquanto o nosso programa está executando. E esses geralmente são os
*               erros que dão dores de cabeça aos programadores, pois esse tipo de erros geralmente só
*               são encontrados depois que a aplicação for testada ou terminada. O que pode gerar um
*               erro de execução? Um parâmetro passado de uma forma errada, um recurso indisponível
*               (como um banco de dados), um problema de rede ou até uma atualização numa biblioteca
*               externa, pode gerar um erro em tempo de execução.
*
*
*       A grande diferença entre estes 2 tipos de erros é que no erro de compilação o erro não poderá
*       ser resolvido a menos que você corrija o erro onde ele acontece e tente compilar a aplicação
*       novamente. Enquanto no erro em tempo de execução, a sua aplicação conseguiu ser compilada, porém,
*       algum desvio a regra foi cometido enquanto a sua aplicação estava funcionando, o que gera um erro
*       em tempo de execução.
*
*
*                        ------------------------------//----------------------------------
*
*       CARACTERÍSTICAS DOS ERROS EM TEMPO DE EXECUÇÃO
*
*       Os erros em tempo de execução podem ser divididos em 2 tipos:
*
*           *   ERRORS:
*
*               Os Errors são erros que fazem com que uma aplicação seja interrompida bruscamente por
*               algum motivo. Por exemplo, um erro comum de acontecer numa aplicação em execução é o
*               "outoffmemory", esse erro ocorre quando um computador ou servidor não possuí memória o
*               suficiente para executar a aplicação fazendo com que a aplicação seja interrompida.
*
*
*           *   EXCEPTIONS:
*
*               As exceptions (exceções) são erros que acontecem quando algum comportamento na nossa
*               aplicação ou do usuário não está de acordo com as regras do java. Por exemplo, uma
*               entrada errada de parâmetro, uma chamada para um recurso externo que está indisponível
*               ou uma queda de rede numa aplicação que precisa de internet, tudo isso pode gerar uma
*               exceção na nossa aplicação.
*
*               Por que são chamadas de exceção e não de erro?
*               Por que as exceções ocorrem quando alguma coisa ou alguém faz um comportamento que
*               "excede" a regra do java. Elas não são necessariamente erros, por que os erros
*               acontecem de forma forçada, enquanto as exceções são provocadas.
*
*       Outra grande diferença entre errors e exceptions, é que os errors "NÃO PODEM SER TRATADOS EM
*       TEMPO DE EXECUÇÃO" enquanto as exceptions "PODEM SER TRATADAS EM TEMPO DE EXECUÇÃO" para que a
*       aplicação não seja interrompida. E esse é mais um motivo de por que as exceptions recebem o nome
*       de "exceptions", por que podemos gerar no código um tratamento de erro que faz com que a nossa
*       aplicação não pare de rodar só por que um erro aconteceu, em vez disso, nós teremos uma
*       alternativa ao erro, ou seja, uma "exceção ao erro".
*
*
*                        ------------------------------//----------------------------------
*
*       TRATAMENTO DE ERROS DAS EXCEPTIONS
*
*       No java existe uma classe chamada Thowable, que significa "lançável" em português, que traz
*       basicamante a ideia de "lançar" erros no log da aplicação para que possamos encontrar a razão
*       dos erros e corrigí-los.
*
*       Throwable possuí duas subclasses principais que são:
*
*           *   Error:
*
*               A classe Error é responsável por lançar no console erros acontecidos em tempo de
*               execução, que são aqueles erros que já tratamos acima quando falamos do tópico "Errors".
*               Esses erros não podem ser corrigidos em tempo de execução e são responsáveis por fazer
*               com que uma aplicação seja interrompida de forma brusca;
*
*
*           * Exception:
*
*               A classe Exception é responsável por lançar exceções que poderão ser tratadas caso algum
*               erro aconteça. É possível tratar esses erros por através dos blocos "try", "catch" e
*               "finally". Podemos até escolher que método irá tratar o erro dentro de uma pilha de
*               execução, passar um erro para ser tratado em outra classe chamadora e até criar nossos
*               próprios erros de forma personalizada (Veja mais detalhes nas classes
*               "CheckedAndUncheckedExceptions" e "CustomException";
*
*
*       Os erros geralmente são tratados dentro de uma pilha de métodos (stack), o log exibe toda a
*       pilha de métodos até chegar no método onde o erro aconteceu. Esse procedimento nos ajuda a
*       identificar todo o caminho até o erro e tratar a falha.
*
*       O tratamento funciona da seguinte forma:
*
*           * Bloco "try":
*
*               Esse bloco como o próprio nome diz serve para tentar executar o método onde o erro pode
*               acontecer;
*
*
*           * Bloco "catch":
*
*               Esse bloco serve para encontrar o erro que aconteceu e executar outro método no lugar do
*               erro. Esse bloco recebe como parâmetro um objeto de Exception, ou de qualquer subclasse
*               de Exception.
*
*               Observação: Podemos criar um objeto de exception para pegar qualquer erro de forma
*               genérica, bem como podemos criar um erro personalizado apenas criando uma classe que
*               herde de Exception.
*
*           * Bloco "finally":
*
*               Esse bloco serve para colocarmos um método que será executado independentemente se
*               ocorrer um erro ou não nos nossos blocos "try / catch";
*
*
*                        ------------------------------//----------------------------------
*
*       INSTANCIALIZAÇÃO DE EXCEPTIONS:
*
*       Como já havíamos dito acima, é possível gerar uma exceção por instancialização, ou seja, criar
*       uma exceção a partir das classes que herdam da classe Throwable usando a palavra reservada "new"
*       e até armazenar essa exceção sobre uma variável, dessa forma:
*
*           NomeDaSubClasseDeThrowable excecao = new NomeDaSubClasseDeThrowable();
*
*       A partir dessa atribuição já temos um objeto de qualquer subclasse de Throwable, podemos gerar
*       um erro por vontade própria incluse.
*
*       Para gerar um erro, usamos a palavra reservada "throw", essa palavra só pode ser usada com
*       objetos gerados a partir da classe Throwable e suas subclasses. Ela faz com que uma pane seja
*       gerada no java causando uma exceção, ou seja, uma interrupção no código e a exibição da
*       mensagem da exceção.
*
*       Podemos usar throw nas seguintes ocasiões:
*
*           throw new NomeDaSubClasseDeThrowable(); //na geração da instância...
*
*           throw excecao; //numa variável que contenha um objeto de Throwable...
*
*       Qualquer objeto gerado de Throwable ou de suas subclasses pode usar os métodos de uma exception
*       como:
*
*           *   getMessage()
*               Exibe uma mensagem de exceção no console;
*
*           *   getStackTrace()
*               Retorna um array com a pilha de execução dos métodos que gerou o erro;
*
*       E muitos outros.
*
*
*       Veja alguns exemplos acima...
* */
