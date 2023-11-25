package FUNDAMENTALS.FundamentalsOfJava.ErrorsAndExceptions;

public class CheckedAndUncheckedExceptions {
    public static void main(String[] args) {

        //Exemplo de tratamento de erro para uma checked exception!
        try {
            firstToCallChecked(); //Não é possível chamá
        } catch (Exception e){
            System.out.println("A checked exception has just been handled.");
        }

        try {
            firstToCallUnchecked();
        } catch (ArithmeticException e){
            System.out.println("A unchecked exception has just been handled");
        }

        firstToCallUnchecked();
    }

    //CHECKEDS
    public static void divisionByZeroChecked() throws Exception{ //Aqui temos
        System.out.println(7 / 0);
    }

    public static void firstToCallChecked() throws Exception{
        secondToCallChecked();
    }

    public static void secondToCallChecked() throws Exception{
        thirdToCallChecked();
    }

    public static void thirdToCallChecked() throws Exception{
        divisionByZeroChecked();
    }

            //------------------------------//------------------------------

    //UNCHECKEDS
    public static void firstToCallUnchecked(){
        secondToCallUnchecked();
    }
    public static void secondToCallUnchecked(){
        thirdToCallUnchecked();
    }

    public static void thirdToCallUnchecked(){
        divisionByZeroUnchecked();
    }

    public static void divisionByZeroUnchecked(){
        System.out.println(7 / 0);
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
 */
