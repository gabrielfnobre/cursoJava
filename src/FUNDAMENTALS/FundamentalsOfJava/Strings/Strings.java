//STRINGS:

/*  Strings em Java são objetos que podem conter um conjunto de caracteres.
    Esses objetos são gerados a partir da classe String, uma classe pré-
    existente dentro o pacote mais básico do Java, o  java.lang.

    Para criar uma string nem mesmo tempos que instanciar o objeto por 
    através da palavra reservada "new", basta seguimos o mesmo procedimento
    que utilizamos quando desejamos criar qualquer variável em qualquer 
    tipo primitivo:

        String nomeDaVariavel = "valor sempre em aspas duplas"

        * OBSERVAÇÃO IMPORTANTE!!! Nenhuma string pode ser criada com áspas
        simples, como acontece em outras linguagens, sempre com áspas 
        duplas.

    Outra coisa importante a se saber das strings, é que toda vez que 
    criamos uma variável ou constante do tipo string temos acesso a uma
    série de funcionalidades da classe String, o que já não acontece com
    os demais tipos primitivos.

    Isso quer dizer que podemos acessar a uma série de métodos que poderão
    ser utilizados na nossa variável. Métodos que podem por exemplo colocar
    todas as letras de uma string em maiúsculo ou minúsculo, métodos que 
    podem encontrar um determinado caractere a partir de um número índice e
    diversas outras funcionalidades.

    Vejamos exemplos de uso com as strings...
 
 */

public class Strings {
    public static void main(String[] args){
        //Ex01
        String palavra = "Boa Tarde";
        palavra = palavra + "!!!";
        System.out.println("Exemplo 01: " + palavra + " " + palavra + " " + palavra);

        //Ex02
        String nome = "Gabriel";
        char sexo = 'M';
        int idade = 32;
        double peso = 105.85345;
        System.out.printf("Exemplo 02: O %s tem %d anos de idade e eh do sexo %c e pesa %.2f\n",
                            nome, 
                            idade, 
                            sexo,
                            peso);

        //Ex03
        System.out.println("Exemplo 03.1: " + palavra.charAt(4));
        System.out.println("Exemplo 03.2: " + palavra.toUpperCase());
        System.out.println("Exemplo 03.3: " + palavra.toLowerCase());
        System.out.println("Exemplo 03.4: " + palavra.startsWith("Bom"));
        System.out.println("Exemplo 03.5: " + palavra.endsWith("!!!"));
        String texto = String.format("Exemplo 03.6: Nome %s peso %.1f",
                                        nome,
                                        peso);
        System.out.println(texto);
    }

    /* Ex01 - Note como é simples a declaração de uma string, veja também que podemos adicionar mais caracteres 
    usando concatenação.*/

    /* Ex02 - Podemos trabalhar concatenação de strings em um texto usando o format com printf, veja abaixo 
    como foi simples criar uma frase inteira que reutilizou todas as strings criadas anteriormente. O format 
    permite que usemos variáveis por através da notação format que utiliza de "%" seguida de um caractere 
    semântico para representar: strings(%s), números inteiros(%d), números de ponto flutuante(%f - podemos até 
    delimitar as casas decimais usando o "." seguindo pelo número de casas decimais), caracteres(%c) e muitos 
    outros, basta vermos a documentação.*/
    
    /* Ex03 - Aqui podemos ver uma ferramenta muito útil em ação, que é o uso dos métodos de string. Como 
     *  * charAt() pode encontrar qualquer caractere que corresponda a um número índice que for passado;
     *  * toUpperCase() transforma todos os caracteres em maiúsculos;
     *  * toLowerCase() transforma todos os caracteres em minúsculos;
     *  * startsWith() podemos colocar uma string como parâmetro nesse método, se a string que estivermos 
     *                  operando tiver a mesma string do parâmetro, esse método retorna "true", se não "false";
     *  * endsWith() faz o mesmo que o startsWith(), mas para o sufixo de uma string;
     *  * format() faz a mesma coisa que o printf(), conseguimos usar o format para escrever uma frase já 
     *              concatenando com uma string em trechos específicos da frase por através de notações format;
    */
}
