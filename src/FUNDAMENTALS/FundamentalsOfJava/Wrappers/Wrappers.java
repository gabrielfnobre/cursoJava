package FUNDAMENTALS.FundamentalsOfJava.Wrappers;

//  WRAPPERS:

/*  Wrappers, são objetos do Java que simulam os 8 tipos primitivos, porém, como o próprio nome
    diz, esses tipos primitivos sofrem um tipo de mutação que os habilita a ter métodos que 
    facilitam a transição de tipos - por exemplo, apenas usando um método podemos mudar uma
    string para double e vice-versa - e o melhor, esses métodos já são nativos de cada wrapper.

    Temos 8 wrappers, um para cada tipo primitivo:

        Byte - para o byte;
        Short - para o short;
        Interger - para o int;
        Long - para o long;
        Float - para o float;
        Double - para o double;
        Character - para o char;
        Boolean - para o boolean;

        OBSERVAÇÕES: Note que a diferença entre a palavra reservada de um wrapper e um tipo 
        primitivo é apenas o fato de que um wrapper deve ter a primeira letra maíuscula e nome
        completo do tipo primitivo. NÃO É PRECISO IMPORTAR NENHUMA BIBLIOTECA OU PACOTE, 
        wrappers são nativos do java.lang.

    Usá-los é muito simples, é semelhante ao uso da String, basta atribuirmos um valor ao tipo
    de wrapper correto e já poderemos usar. Dessa forma:

        Byte nomeDaVariavel = 1;

    Simples assim. Depois disso é só usar os métodos referentes a um determinado wrapper.

    Vejamos alguns exemplos...
 */


public class Wrappers {

    public static void main(String[] args){
        //Ex01
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 1000000L;
        System.out.println("Ex01\n" + b + 5);
        System.out.println(s + 50);
        System.out.println(i + 500);
        System.out.println(l + 5000 + "\n");

        //Ex02
        Float f = 2.3F;
        Double d = 43.5;
        System.out.println("Ex02\n" + f + 5);
        System.out.println(d + 50 + "\n");

        //Ex03
        Character c = 'a';
        System.out.println("Ex03\n" + Character.toUpperCase(c));
        
        //Ex04
        Boolean bool = true;
        System.out.println("\nEx04\n" + Boolean.logicalAnd(bool, false) + "\n");

        //Ex05
        Double numeroDeString = Double.parseDouble("10");
        System.out.println(numeroDeString);

        Boolean booleanDeInterger = Boolean.parseBoolean("true");
        System.out.println(booleanDeInterger);
    }

    /*Ex01 - Veja as declarações de wrapper sobre tipos inteiros, e note como ela dá certo, isso pode ser percebido
            pelo fato de as contas darem certo e não saírem do contexto de números inteiros;
     */
    /*Ex02 - Veja as declarações de wrapper sobre tipos flutuante, note que como elas são certo, isso pode ser 
            percebido pelo fato de que as contas dão certo e não saem do contexto de números reais;
     */
    /*Ex03 - Aqui temos a atribuição de um wrapper do tipo Character, note que usamos um método que faz parte 
            desse wrapper por colocar o character em letra maíuscula;
     */
    /*Ex04 - Aqui temos a declaração de um boolean, note que estamos usando um método do wrapper Bollean para fazer
            uma comparação lógica AND, note que ela dá false por que temos um true + false; 
     */
    /*Ex05 - Aqui temos uma das maiores utilidades dos wrapper, fazer a conversão rápida de tipos. Note que com os
            parses de cada tipo wrapper conseguimos facilmente converte um tipo wrapper em outro;
     */

}
