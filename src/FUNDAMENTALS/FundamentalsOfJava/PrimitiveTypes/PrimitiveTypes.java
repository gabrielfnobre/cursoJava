//TIPOS PRIMITIVOS:

/*  No Java podemos trabalhar com 8 Tipos Primitivos, sendo que 
    6 destes tipos primitivos são usados somente para números, 
    onde dentre estes, 4 tipos primitivos são referentes a 
    números inteiros e 2 para representar números reais.

    Os outros 2 Tipos Primitivos restantes são do tipo Booleano
    e caracter. Vejamos uma explicação mais detalhada logo 
    abaixo:

        4 TIPOS PRIMITIVOS INTEIROS DO JAVA:

            * byte: representa 1 único byte. Sendo capaz de 
                    armazenar -128 até 127 (inclusive) em valores 
                    numéricos;

            * short: representa 2 bytes. Sendo capaz de armazenar 
                    de -32.768 á 32.767 (inclusive) em valores 
                    numéricos;

            * int: também conhecido como "interger", ele 
                    representa 4 bytes de armazenamento. Sendo 
                    capaz de armazenar DE -2.147.483.648 á
                    2.147.483.647 (inclusive) em valores 
                    numéricos;

            * long: armazena valores entre -9.223.372.036.854.775.
                    808 á -9.223.372.036.854.775.807 (inclusive)
                    em valores numéricos;

        OBSERVAÇÕES: Valores inclusive são valores que incluem o 
        zero, ou seja, no java o "0" é um número positivo. Por isso 
        que os valores positivos sempre dão o valor de 1 algarismo 
        a menos em relação aos valores negativos.


        2 TIPOS PRIMITIVOS DE PONTO FLUANTE NO JAVA (NÚMEROS REAIS):

            * float: armazena valores de ponto flutuante equivalentes
                    a 4 bytes. Isso significa 10^-45 (negativos) e
                    10^38 (positivos). A precisão decimal entre esses
                    números é de 7 casas decimais;

            * double: armazena valores de ponto flutuante equivalentes
                    a 8 bytes. Isso significa 10^-324 (negativos) e
                    10^308 (positivos). A precisão decimal entre esses
                    números é de 15 casas decimais;
 
        TIPO BOOLEAN:

            * boolean: armazena somente 2 valores "true" ou "false". 
                    Mas atenção! Diferente de outras linguagens de 
                    programação onde um valor "0" pode ser convertido
                    para "false", o valor "1" pode ser convertido para
                    "true", no java NÃO ACONTECE ESSA CONVERSÃO. O
                    boolean só aceita "true" ou "false";

        TIPO CHAR:

            * char: armazena comente 1 caractere, e sempre entre aspas
                    simples, assim: 'a', '1', '?' ou '@';
 */

public class PrimitiveTypes {
    public static void main(String[] args){

        //exemplo com inteiros...
        
        byte anos = 32;
        short endereco = 418;
        int ano = 1991;
        long preco = 333_333L; //1#

        //exemplo com ponto flutuante...

        float valor = 2.36F; //2#
        double valorGrande = 2_334.50; //3#

        //exemplo de boolean...
        boolean ligado = false;

        //exemplo com char...
        char ativoOuInativo = 'A';
        char unicode = '\u0011'; //4#

        System.out.println(anos);
        System.out.println(endereco);
        System.out.println(ano);
        System.out.println(preco);
        System.out.println(valor);
        System.out.println(valorGrande);
        System.out.println(ligado);
        System.out.println(ativoOuInativo);
        System.out.println(unicode);

    }

    /*1# Exemplo com long, no 2 coisas curiosas no número "333_333L" que estamos usando no long, como 
        long trabalha com numerações muito grandes, é possível separá-las por underlines para facilitar
        a leitura, por isso estamos usando o underline para ler facilmente o número trezentos e trinta
        e três mil trezentos e trinta e três. Além disso, estamos usando o "L" ao final do número, por 
        que isso? Por que o Java por padrão atribuí valores "int" aos inteiros, então quando atribuímos
        ao long um número inteiro o Java entende que esse número é um "int", mesmo quando ele é 
        atribuído sobre um long, por isso temos que dizer ao Java que o número é um long colocando um
        "L" no final do número. (Pode ser usado um "l" minúsculo também, mas como o "l" pode ser 
        facilmente confundido com um número, é melhor utilizar o "l" em letra maíuscula.);*/
    
    /*2# Exemplo do float, note que no float estamos usando um número de ponto flutuante seguido de uma
        letra "f" ao final. Isso é por que o Java por padrão utiliza números double sempre que 
        um número de ponto de ponto flutuante é atribuído, e precisamos dizer ao Java que o número é 
        um float e não um double, para isso utlizamos o "f" ao final (Note que estamos usando o "f" em
        maiúsculo, isso é apenas uma convenção para identificar melhor o "f" entre as letras e não 
        confundí-lo com um número).*/
    
    /*3# Exemplo com double, note que o número que está no double está com um underline no meio dele, 
        isso acontece por que no Java podemos utilizar o "_" como separador de valores no Java para
        facilitar a leitura de números grandes, já que o ponto não pode ser usado.*/ 
    
    /*4# Exemplo com char, note que além de caracteres de apenas 1 letra, podemos também utilizar a
        notação "unicode", já que essa notação também representa uma única letra.*/

}
