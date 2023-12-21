package Cast;

//  CAST

/*  O cast (verbo inglês que significa "moldar" ou "formar") é uma ferramenta de 
    conversão de tipos primitivos muito utilizada do Java. 
    
    Ela permite que possamos - por assim dizer - forçar o Java a aceitar a entrada 
    de determinados valores de tipos que não seriam atribuídos naturalmente ao tipo 
    primitivo de forma comum.

    Por exemplo, podemos fazer com que um float aceite um valor double, que um 
    long aceite um valor int e etc.

    Ele faz o que chamamos de "conversão explícita", a conversão explícita é aquela
    onde somos obrigados a dizer ao Java que ele tem que fazer uma conversão, 
    justamente o que o cast faz.

    O cast pode ser feito de duas formas:

        float nomeDaVariavel = (float) 1.123456789123456;

        ou

        float nomeDaVariavel = 1.123456789123456F;

    Perceba que na 1ª forma nós utilizamos o tipo primitivo dentro dos parênteses e
    na segunda apenas colocamos a primeira letra do tipo primitivo ao final do valor,
    é como se estivéssemos dizendo ao Java que ele está autorizado a fazer com que 
    um double seja aceito dentro de um tipo primitivo float.

    OBSERVAÇÃO: É necessário tomar cuidado com convesão de tipos de forma explícita, 
    pois ela não são aceitas por padrão por causa de alguns riscos. Por exemplo, um
    número do tipo double tem muito mais espaço de memória que um número do tipo 
    float, por isso, se convertemos um número grande demais para o float, ele vai 
    truncar o número, isso pode fazer com que percamos informação ou geremos números
    estranhos. É preciso estar cientes dos riscos e saber trabalhar com eles.

    SOBRE CONVERSÃO IMPLICITA E EXPLICITA: Existem 2 tipos de conversão no Java:
        #   Conversão Implícita - é aquela que é aceita naturalmente pelo Java sem
                                    a necessidade de fazer cast, ela acontece 
                                    naturalmente por que o Java entende que um 
                                    determinado valor pode ser atribuído sobre a
                                    variável e isso não vai incorrer em problemas
                                    de tamanho de memória ou confusão entre os 
                                    tipos primitivos. Por exemplos se passarmos o
                                    valor inteiro de "1" para um float ou um 
                                    double o Java vai fazer a conversão implícita
                                    do valor, sem problemas, pois é um número que 
                                    cabe tanto dentro do double quando do float.
                                    
                                    Porém, se tentarmos fazer "1.1" para um "int"
                                    o Java não vai aceitar, mesmo sendo um número
                                    de não vai ocupar muito espaço. Isso acontece
                                    por que para o Java é mais importante o tipo
                                    primitivo do que o valor, se o valor não puder
                                    ser aceito dentro de um tipo primitivo 
                                    determinado, o Java não vai aceitar uma 
                                    conversão implícita.
        
        # Conversão Explícita - é aquela que é feita de forma forçada, onde o 
                                    desenvolvedor tem que explicitar ao Java que
                                    uma conversão será feita. Quando faz isso o 
                                    desenvolvedor assume o risco da conversão e 
                                    nos impactos dela sobre a aplicação.
 */

public class Cast {
    public static void main(String[] args){
        
        //Ex01
        double valueDouble = 1;
        System.out.println("Ex01:\n" + valueDouble);
        int valueConvertedFromDouble = (int) valueDouble;
        System.out.println(valueConvertedFromDouble + "\n");

        //Ex02
        float valueFloat = 20.8F;
        int valueConvertedFromFloat = (int) valueFloat;
        System.out.println("Ex02:\n" + valueConvertedFromFloat + "\n");
        
        //Ex03
        byte valueTemperaturaFarenheit = (byte) 129;
        System.out.println("Ex03:\n" + valueTemperaturaFarenheit + "\n");

        //Ex04
        String valueString = "20";
        double stringToDouble = Double.parseDouble(valueString);
        System.out.println("Ex04:\n" + (20 + stringToDouble) + "\n");


    }

    /*  Ex01 - Neste exemplo podemos ver primeiramente uma conversão implícita, quando a variável "valueDouble" aceita um
                valor do tipo inteiro, isso é totalmente plausível pelo fato de o valor poder ser convertido com 
                facilidade para o valor de ponto flutuante "1.0" e o tamanho do valor não impactar no espaço de memória do 
                double. Após isso vamos uma conversão explícita, onde a variável "valueConvertedFromDouble" que é um 
                inteiro aceita o valor de uma variável double, porém, truncando qualquer valor de casa decimal;
     */
    /*  Ex02 - Neste exemplo vemos a conversão explícita usando a primeira letra do tipo primitivo ao final, onde temos a
                variável "valueFloat" do tipo float onde atribuímos um valor de ponto flutuante sobre ela, mas como por 
                padrão o Java entende números literais de ponto flutuante como sendo double, tivemos que fazer a conversão.
                Mais abaixo temos a variável "valueConvertedFromFloat", que é do tipo inteiro, onde usamos um cast para 
                fazer uma conversão explícita, mas note que após fazer a conversão perdemos os valores das casas decimais.
     */
    /*  Ex03 - E veja como a conversão de tipos pode ser um grande risco neste exemplo, aqui nós atribuímos um número 
                inteiro sobre um byte, que só pode suportar no máximo até o número 127. Porém, quando fizemos o casting com 
                um número maior do que ele pode suportar, ele foi direto para os próximos falores de tabela do byte, indo
                direto para os números negativos. Imagine como isso pode ser problemáticos para uma aplicação e não for 
                usado com cautela.
     */
    /*  Ex04 - Abaixo temos uma conversão explícita de uma string para um valor double, note que para fazer a conversão
                e atribuição do valor, nós usamos o método "parseDouble()" do wrapper "Double". Note mais abaixo que o 
                o valor realmente ser tornou um double, por quando pedimos para somá-lo a um numeral no println, ele fez 
                isso sem problemas.
     */
}
