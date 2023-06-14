//IGUALDADE ENTRE STRINGS:

/*  A igualdade entre strings é um tema muito abordado entre os programadores. Pois constantemente temos
    que criar programas que fazem testes de igualdade entre strings advindas do usuário e valores pré-
    existentes no nosso código - um exemplo disso são as senhas.
    
    Mas a igualdade entre strings pode confundir algumas pessoas no Java, pois testes de igualdade entre 
    strings podem não funcionar como esperado dependendo da forma como as strings foram criadas.

    Por exemplo, uma string criada de forma literal: String a = "nome", pode é encarada de forma diferente
    do que uma string gerada por instancialização: String b = new String("nome"), se comparássemos essas 
    strings usando apenas o operador de igualdade (==) o resultado seria "false", apesar de elas terem 
    exatamente a mesma palavra.

    Isso acontece por que quando você cria uma string de forma literal, como em "nome", o Java verifica se 
    já existe uma string com o mesmo valor na "string pool", que é uma área de memória reservada para 
    armazenar strings únicas. Se já existir uma string com o mesmo valor na "string pool", o Java reutiliza 
    essa string em vez de criar uma nova. Isso significa que todas as strings literais com o mesmo valor 
    apontam para o mesmo objeto na memória.

    Por outro lado, quando você cria uma string por meio de instancialização, como em new String("nome"), o 
    Java cria uma nova instância de string, independentemente de haver uma string com o mesmo valor na 
    "string pool". Isso significa que duas strings criadas por meio de instancialização com o mesmo valor 
    terão objetos diferentes na memória.

    Ao usar o operador de igualdade (==) para comparar strings, o Java compara se as duas strings apontam 
    para o mesmo objeto na memória, e não se o conteúdo das strings é o mesmo. Como as strings criadas por 
    meio de literal e instancialização têm objetos diferentes na memória, o resultado da comparação será 
    "false", mesmo que o conteúdo das strings seja o mesmo.

    Para comparar o conteúdo das strings em Java, é recomendado usar o método equals(). O método equals() 
    compara o conteúdo das strings, enquanto o operador de igualdade (==) compara as referências de objeto.

 */

public class equalityBetweenStrings {

    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01 - Igualidade entre strings literalmente declaradas na funcao println: " + ("2" == "2"));
        
        //Ex02
        String nome1 = "Gabriel";
        String nome2 = "Gabriel";
        System.out.println("Ex02 - Igualidade entre strings literalmente atribuidas: " + (nome1 == nome2));
        
        //Ex03
        String exemplo1 = "Gabriel";
        String exemplo2 = new String("Gabriel");
        System.out.println("Ex03 - Igualidade entre uma string literalmente atribuida e outra por instancializacao: " + (exemplo1 == exemplo2));
        
        //Ex04
        System.out.println("Ex04 - Consertando desigualidade entre uma string literalmente atribuida e outra por instancializacao: " + exemplo1.equals(exemplo2));

    }

        /*  Ex01 - Veja como strings literais podem ser facilmente comparadas, mas lembre-se que oque está sendo comparado aqui
                    não são os conteúdos, e sim os espaços de memória;
        */
        /*  Ex02 - Aqui acontece o mesmo que no exemplo 1, como elas são criadas de forma literal, a igualdade (==) vai comparar
                    os espaços de memória e não o conteúdo;
        */
        /*  Ex03 - Aqui temos um exemplo claro de desigualdade. Pois estamos comparando uma variável de valor literal e uma 
                    variável instanciada. Naturalmente, elas vão referenciar a espaços de memória diferentes, ocasionando o 
                    "false";
        */
        /*  Ex04 - Aqui vemos como o "equals()" pode fazer com que comparemos conteúdo e não espaço de memória. Veja que estamos
                    usando as mesmas variáveis que no exemplo 03, mas o resultado dá "true";
        */

}
