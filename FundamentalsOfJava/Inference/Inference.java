package Inference;

//INFERÊNCIA:

/*  A inferência é uma ferramenta implantada no Java à partir do Java 10
    onde é possível iniciar uma variável ou constante sem declarar 
    previamente qual é o seu tipo.

    Em vez disso, nós iniciamos a variável ou constante atribuindo um 
    valor a ela, e à partir desse valor o próprio Java se encarrega de
    inferir (deduzir) qual é o tipo da variável.

    Para usar a inferência temos que usar a palavra reservada "var" 
    seguida pelo nome da variável e na mesma sentença já temos que 
    iniciar a variável atribuindo um valor a ela. A inferência não 
    aceita que declaremos uma variável previamente sem iniciarmos ela e 
    só depois atribuamos um valor à ela. No caso da inferência a 
    atribuição de valor tem que ser feita na hora!

    Vejamos algumas regrinhas sobre as inferências:

        * DEVE-SE USAR A PALAVRA RESERVADA "VAR": O "var" é o que 
                diz ao Java que uma inferência é uma inferência. 
                Para variáveis usamos: var nomeDaVariavel   
                Para constantes usamos: final var nomeDaConstante 

        * TEM QUE SER INICIALIZADAS NO ATO DA CRIAÇÃO: Não podem ser 
                declaradas previamente e só depois iniadas;

        * NÃO PODEM MUDAR O TIPO: Não é por que são inferidas que 
                podemos ficar mudando o tipo de uma variável quando
                quisermos, como acontece com o JavaScript. Elas 
                sempre vão ter o mesmo tipo que foi inferido pelo 
                Java durante a sua inicialização;

        * UM DOUBLE PODE ACEITAR UM INTERGER, MAS UM INTERGER NÃO PODE 
          ACEITAR UM DOUBLE: Se você inferir um valor double sobre uma 
                variável e depois atribuir um valor interger sobre ela, 
                ela vai aceitar atribuição, PORÉM ela vai transformar o 
                valor interger que foi atribuído sobre ela em um double. 
                Mas se você tentar o contrário, tentar atribuir um 
                double sobre uma variável inferida interger, não vai
                dar certo, o java nem compila;
                
        Veja alguns exemplos logo abaixo...
 
 */

public class Inference {
    
    public static void main(String[] args){

        var raio = 3.4; //*

        //!!!DESCOMENTE AQUI PARA VER O ERRO ACONTECER!!
        //**
        // var tentativaMauSucedidaDeDeclararEDepoisAtribuir;
        // tentativaMauSucedidaDeDeclararEDepoisAtribuir = "fail";
        
        final var PI = 3.1415; //#
        //!!!DESCOMENTE AQUI PARA VER O ERRO ACONTECER!!!
        // PI = 5;
        var area = PI * raio * raio; //##

        System.out.println(area);

        //***
        var valorDouble = 1.2;
        valorDouble = 2;
        System.out.println(valorDouble);

        //!!!DESCOMENTE AQUI PARA VER O ERRO ACONTECER!!!
        //###
        // var interger = 1;
        // interger = 2.5;
        // System.out.println(interger);

    }

    //* Uma inferência simples de uma variável de um valor do tipo double;
    //** Aqui tentamos declarar uma inferência sem iniciar ela, veja que o Java nem compila;
    //*** Nas 3 linhas que seguem, veja que uma inferência double aceita um interger;
    //# Uma inferência de uma constante usando o "final" e letras maiúsculas, na linha 54 tentamos reatribuir um valor a constante mas não dá certo, provando que ela realmente é uma constante;
    //## Veja que as inferências também aceitam resultados de operações como valores, o tipo final do resultado irá resultar no tipo definitivo daquela inferência;
    //### Nas 3 linhas que se seguem, veja que uma inferência interger não aceita um double;

}
