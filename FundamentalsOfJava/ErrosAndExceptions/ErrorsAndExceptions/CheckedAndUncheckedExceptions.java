package ErrosAndExceptions.ErrorsAndExceptions;

public class CheckedAndUncheckedExceptions {
    public static void main(String[] args) {

        //Exemplo de tratamento de erro para uma checked exception!
        try {
            firstToCallChecked(); //Não seria possível chamar por esse método sem que ele fosse trata-
        } catch (Exception e){      //do dentro do método main!
            System.out.println("A checked exception has just been handled.");
        }

        try {                               //Fizemos um tratamento de erro aqui para a unchecked ex-
            firstToCallUnchecked();         //ception, mas se não quiséssemos não seria obrigatório...
        } catch (ArithmeticException e){ //Estamos recebendo uma ArithmecticException que está dentro
            System.out.println("A unchecked exception has just been handled");  // de RuntimeException
        }

        firstToCallUnchecked(); //Veja que podemos optar por receber um método de uma RuntimeException
                                //sem a obrigatoriedade de fazer um tratamento de erro. Veja que toda
                                //a stack da exceção será impressa...
    }

    //CHECKEDS
    public static void divisionByZeroChecked() throws Exception{ //Aqui temos uma exceção checkada que
        System.out.println(7 / 0);                                  //será chamada dentro de uma pilha
                                                                    //de métodos, note o uso da palavra
                                                                    //reservado "throws" para que a
                                                                    //exceção seja tratada em outro mé-
    }                                                               //todo que chame por ela...

    public static void firstToCallChecked() throws Exception{ //throws de novo...
        secondToCallChecked();
    }

    public static void secondToCallChecked() throws Exception{ //throws de novo...
        thirdToCallChecked();
    }

    public static void thirdToCallChecked() throws Exception{ //throws de novo...
        divisionByZeroChecked();
    }

            //------------------------------//------------------------------

    //UNCHECKEDS
    public static void divisionByZeroUnchecked(){ //Note que também temos uma exceção aqui identica a
        System.out.println(7 / 0);                  //exceção checkada, porém, o fato de não usarmos
                                                    //throws para uma "Exception" e de ela não retornar
                                                    //uma Exception faz com que essa seja uma
                                                    //RuntimeException, ou seja, uma excessão não
                                                    //checkada, não havendo a necessidade de passar o
                                                    //tratamento de erro dela a adiante...
    }

    public static void firstToCallUnchecked(){ //Não foi necessário usar "throws"...
        secondToCallUnchecked();
    }

    public static void secondToCallUnchecked() throws RuntimeException{ //Se quiser passar uma
        thirdToCallUnchecked();                     //RuntimeException para frente usando throws pode
                                                    //passar, mas que fique claro que isso é total-
                                                    //mente opcional...
    }

    public static void thirdToCallUnchecked(){ //Não foi necessário usar "throws"...
        divisionByZeroUnchecked();
    }

}

//      EXCEÇÕES "CHECKADAS" E "NÃO CHECKADAS"

/*      No Java possuímos o conceito de exceções "checkadas" e "não checkadas", elas estão no Java desde
*       o início da linguagem. O que necessariamente são esses tipos de exceções?
*
*           *   Exceções Checkadas:
*
*               São exceções que precisam ser tratadas pelo desenvolvedor de forma explícita, esse tipo
*               de exceções são criadas de uma forma que forçam o desenvolvedor a tratá-las por através
*               de um try-catch. Se elas não foram tratadas o código não poderá ser compilado.
*
*               As exceções checkadas foram criadas dessa maneira para obrigar o desenvolvedor a gerar
*               um tratamento de erro para um elemento que pode dar erro.
*
*               Por exemplo, uma pesquisa a um banco de dados pode dar erro caso o banco ou a rede este-
*               jam indisponíveis, esse é um erro típico que precisa ser tratado por um try-catch, neste
*               caso uma exceção checkada seria a melhor opção, pois ela nos alerta sobre a necessidade
*               de implantar um tratamento de erro por torná-lo obrigatório.
*
*               Por padrão, se uma exceção checkada não for tratada no mesmo método onde o erro poderia
*               acontecer, a obrigatoriedade do tratamento deverá ser passada para o método chamador,
*               se o método chamador não tratar o erro, ele deverá ser passado para o outro método cha-
*               mador, e assim por diante, até que algum desses métodos dentro da stack faça esse trata-
*               mento do erro.
*
*                                            ____________________________
*                                           |                            |_____
*                                Método 4   | Erro aconteceu no método 4 |    |  Obrigatoriedade do
*                                           |                            |    |  Tratamento de Erro
*                                           |____________________________|    |  foi passada para o
*                                            ______________|_____________     |  próximo método.
*                                           |                            |<<--|
*                                Método 3   |    Método 3 chama o 4 e    |
*                                           |  passa o erro para frente  |_____
*                                           |____________________________|    |
*                                            ______________|_____________     |  foi passada para o
*                                           |                            |<<--|  próximo método.
*                                Método 2   |    Método 2 chama o 3 e    |
*                                           |  TRATA!!! o erro do método |--->>  Erro foi tratado
*                                           |____________________________|       aqui!
*                                            ______________|_____________
*                                           |                            |
*                               Método Main |      Método Main chama     |
*                                           |         o Método 2         |--->>  Método Main NÃO
*                                           |____________________________|       PODE passar um
*                                                                                Tratamento de
*                                                                                Erro!!!
*
*               OBSERVAÇÃO!!!
*               Somente o método "main" não poderá passar um tratamento de erro para frente. Afinal ele
*               não tem para quem passar o erro, já que ele é o 1º método chamador de qualquer aplica-
*               ção.
*
*
*           *   Exceções Não Checkadas:
*
*               Exceções Não Checkadas são exceções que não obrigam o desenvolvedor a fazer um tratamen-
*               to de dados, fica opcional para um desenvolvedor fazer o tratamento de dados sobre o
*               erro ou não.
*
*               Além disso, elas possuem uma grande vantagem que as exceções checkadas não tem, que é
*               passar o tratamento de erro de um método para outro pulando entre os métodos da pilha
*               sem a necessidade de fazer com que cada método chamador passe o tratamento de um para o
*               outro de forma explícita até chegar no método que realmente queríamos chegar.
*
*                                            ____________________________
*                                           |                            |_____
*                                Método 4   | Erro aconteceu no método 4 |    |  Não há obrigatoriedade
*                                           |                            |    |  de tratar o erro.
*                                           |____________________________|    |
*                                            ______________|_____________     |
*                                           |                            |    |
*                                Método 3   |   Método 3 chama o 4 não   |    |
*                                           |  trata e nem sabe do erro  |    |
*                                           |____________________________|    |
*                                            ______________|_____________     |  Método 2 percebe que
*                                           |                            |<<--|  um erro poderia
*                                Método 2   |    Método 2 chama o 3 e    |       acontecer e trata o
*                                           |  TRATA!!! o erro do método |       erro, mesmo que não
*                                           |____________________________|       seja obrigado a fazer
*                                            ______________|_____________        isso.
*                                           |                            |
*                               Método Main |      Método Main chama     |
*                                           |         o Método 2         |--->>  Método Main NÃO
*                                           |____________________________|       PODE passar um
*                                                                                Tratamento de
*                                                                                Erro!!!
*
*               Veja a vantagem que existe na utilização de uma unchecked exception, não precisamos
*               ficar passando a obrigatoriedade de tratamento de erro uma a uma até chegar no método
*               onde nós gostariamos que o erro fosse tratado. Na verdade essa obrigatoriedade nem
*               existe.
*
*               No exemplo acima temos uma pilha pequena de apenas 4 métodos, mas imagine uma pilha
*               com centenas de métodos, imagine que tivéssemos que passar o tratamento de erro 1 a 1
*               na pilha até chegar no método desejável. Claro que ninguém faria isso, espero, mas se
*               usássemos a unchecked exception seria uma melhor opção, poderíamos fazer o tratamento
*               de erro onde quiséssemos.
*
*               Quando utilizá-las? Podemos optar por usar exceções não checkadas quando tratar ou não
*               tratar uma exceção não represente um problema crítico para a nossa aplicação. Ou quan-
*               do nos certificamos de que o erro realmente foi tratado no método correto, economizan-
*               do linha de código por não ter que repassar a obrigatoriedade do tratamento de erro
*               para os demais métodos chamadores.
*
*
*       COMO PODEMOS DEFINIR EXCEÇÕES CHECKADAS DE NÃO CHECKADAS?
*
*       Toda Exceção é descendente da Classe Pai "Exception", por padrão, uma exceção que faça parte
*       de "Exception" por natureza já é uma exceção checkada, ou seja, é OBRIGATÓRIO QUE SEJA TRATA-
*       DA por try-catch.
*
*       Como fazer para passar o tratamento dela para frente?
*       Se desejamos que a obrigatoriedade do tratamento de erro seja passado para outro método, de-
*       veremos usar a palavra reservada "throws" e o nome da classe que corresponde ao objeto da ex-
*       ceção na assinatura do método, podemos também usar a classe "Exception", que de forma genéri-
*       ca representa qualquer objeto que herde de suas classes. Por exemplo:
*
*           static void metodoDoErro throws Exception(){ //veja que usamos a palavra reservada
*               ...                                      //"throws" na assinatura junto com o nome da
*           }                                            //classe "Exception"...
*
*       Em todos os métodos que usarmos "throws", a necessidade de tratar o erro será passada para o
*       próximo método chamador.
*
*       Observação! O método "main" não pode usar o throws, pois ele não tem para quem passar o tra-
*       tamento de erro por ser o método inicial de toda aplicação.
*
*       E quanto as unchecked exception? Como fazer para gerá-las?
*
*       As unchecked exception pertencem a uma classe que herda de "Exception", que é a classe
*       "RuntimeException", qualquer exceção que seja um objeto de RuntimeException ou das suas
*       classes filhas por padrão é uma unchecked exception NÃO HAVENDO A OBRIGATORIEDADE DE FAZER
*       UM TRATAMENTO DE ERRO OU DE PASSÁ-LO ADIANTE.
*
*       Porém, se desejar, você pode usar a palavra reservada "throws" na assinatura do método onde
*       ocorre uma RuntimeException, mas isso é totalmente opcional:
*
*           static void metodoDoErro throws RuntimeException(){ //veja que usamos a palavra reservada
 *               ...                                      //"throws" na assinatura junto com o nome da
 *           }                                            //classe "RuntimeException"...
 *
 *          É o mesmo que...
 *
 *          static void metodoDoErro(){ //Não há necessidade de usar "throws"...
 *               ...
 *           }
 *
 *      Veja alguns exemplos acima...
 */
