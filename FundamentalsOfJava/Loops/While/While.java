package Loops.While;

// WHILE:

/*  O laço "while" é um tipo de loop usado para quanto temos uma quantidade indeterminada de repetições
    até que algo aconteça e pare o laço.

    A forma de usar o while é muito simples:

        while(condicional booleano) {
            bloco de execução que é repetido
        }

    Note que o while possuí como entrada de parâmetro uma expressão booleana que só poderá retornar 
    "true" ou "false", enquanto a expressão estiver retornando "true" o while vai repetir o bloco de
    execução que está dentro dele, só quando a expressão retornar um false é que o while vai sair do
    bloco do loop.

    O laço while é muito bom para ser usado quando queremos que usa ação seja repetida até que uma
    determinada condição seja satisfeita.

    Vejamos um exemplo...
 
 */

public class While {
    
    public static void main(String[] args){

        //Ex01
        int i = 0;

        while(i < 10){
            i++;
            System.out.println(i);
        }

    }

    /*  Note nesse exemplo que o nosso laço while vai contar até chegar em 10, quanto a variável "i" tiver um valor que seja
        maior que "10" ela para de repetir.
     */

}
