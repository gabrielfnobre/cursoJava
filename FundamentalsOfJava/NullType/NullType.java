package NullType;

//  TIPO NULL

/*  O tipo "null" é um tipo da linguagem java - e de outras também - usado para quando queremos que uma variável 
    seja inicializada, mas que não aponte para lugar nenhum no espaço de memória.

    Ele é diferente de quando temos uma variável com valor "0" ou uma string vazia "", pois "0" e "" ainda são 
    valores. Um tipo null realmente não aponta para lugar nenhum, o seu único objetivo é mostrar para o java que 
    uma variável foi criada e inicializada, mas ainda não possuí nenhum valor - pois ainda vamos colocar um valor 
    nela - seu objetivo é somente este.

    Vamos ver um exemplo...
 */

public class NullType {
    public static void main(String[] args){

        //Ex01
        String stringTypeEmpty = "";
        System.out.println("Ex01");
        System.out.println(stringTypeEmpty.concat("!!!\n"));
        
        //Ex02
        String nullType = null;
        System.out.println("Ex02");
        System.out.println(nullType.concat("!!!"));


    }

    /*  Ex 01 - Aqui vemos que uma string com valor "vazio" ainda assim possuí um espaço de memória e é considerada
                como uma string, pois foi possível concatená-la com outra string;
     */

    /*  Ex 02 - Aqui vemos que um tipo null não aponta para nenhum espaço de memória. Por isso não pode ser 
                encontrado e muito menos concatenado a uma string. Pois o tipo null serviu apenas para inicializar 
                a variável, mas não para fazê-la apontar para um espaço na memória;
     */

}
