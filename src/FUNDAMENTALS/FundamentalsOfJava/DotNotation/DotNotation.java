//NOTAÇÃO PONTO:

/*  A notação ponto, do inglês "dot notation", é um operador de acesso
    a variáveis, métodos e qualquer valores disponíveis dentro de um
    objeto.

    Por exemplo, quando criamos uma variável do tipo string, na verdade
    estamos instanciando um novo objeto sobre a classe String do 
    java.lang. Por isso que podemos usar a notação ponto para acessar
    vários métodos disponíveis as variáveis do tipo String, como:
    toUpperCase(), toLowerCase(), replace() e outros. Sempre que 
    queremos acessar esses métodos usamos o ponto "nome.replace()".

    Resumindo, a notação ponto um operador de acesso a variáveis, 
    constantes, métodos e outras coisas que estejam dentro de um
    objeto.

    Veja um exemplo abaixo...
 
 */

public class DotNotation {
    
    public static void main(String[] args){

        //1#
        String palavra = "carambola";
        System.out.println(
            palavra
            .concat("!!!")
            .toUpperCase()
        );

        /*1# Note no exemplo acima vários exemplos da notação ponto, 
        temos notação ponto no System.out.println, e quando referenciamos
        aos métodos da variável "palavra" que é do tipo String.*/

    }

}
