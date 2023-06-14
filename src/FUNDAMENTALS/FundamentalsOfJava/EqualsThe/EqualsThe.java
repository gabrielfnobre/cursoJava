//  O EQUALS:

/*  O equals é um método pré-implementado do Java que têm como missão fazer comparação 
    entre valores. Quando falamos que ele é pré-implementado, é por que o Java por 
    padrão já vem com um método "equals()" pré-implementado dentro de todos seus tipos 
    primitivos, wrappers e objects.

    Porém, é importante alertar que equals pré-implementados tem a missão de comparar 
    apenas valores que foram armazenados no espaço de memória, e sabemos que quando 
    falamos de arrays e objetos, o que vamos encontrar é sempre uma referência ao 
    espaço de memória onde os valores realmente estão.

    Nesses casos temos que implementar o equals, seja na nossa classe ou quando 
    comparamos arrays, temos que dizer ao equals que ele deve comparar valores e não
    espaços de memória (se a nossa intenção realmente for comparar valores e 
    geralmente é isso o que queremos fazer mesmo).

    Vejamos como fazer isso...
 */


public class EqualsThe {
    public static void main(String[] args){

        //Ex01
        System.out.println("Ex01:");
        String name = "Gabriel";
        System.out.println(name.equals("gabriel"));
        System.out.println(name.equals("Gabriel"));
        System.out.println();
        
        //Ex01
        System.out.println("Ex02:");
        String[] anyArray = {"Gabriel", "Ferreira", "Nobre"};
        String[] otherArray = {"Gabriel", "Ferreira", "Nobre"};
        System.out.println(anyArray.equals(otherArray));
        System.out.println(anyArray[0].equals(otherArray[0]));
        System.out.println();

        //Ex03
        System.out.println("Ex03:");
        User u1 = new User();
        u1.name = "Gabriel";
        u1.email = "gabriel_user@User.com";
         
        User u2 = new User();
        u2.name = "Gabriel";
        u2.email = "gabriel_user@User.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }

    /*  EX 01 - Neste exemplo temos o uso mais comum de um "equals", note que o usamos para comparar
                duas strings, note que nesse exemplo não precisamos de implementar o equals por que
                estamos comparando diretamente valores;
     */
    
    /*  EX 02 - Neste caso, note que tivemos que implementar o equals, pois arrays por padrão 
                sempre irão referenciar a espaços de memória. Note que quando tentamos compará-los
                diretamente o resultado é false. Mas quando dizemos ao equals para comparar um 
                índice com outro, nós conseguimos um resultado true;
     */
    
    /*  EX 03 - Neste caso, estamos comparando instâncias da classe "User", e instâncias são objetos
                por isso sempre irão referenciar ao espaço de memória onde os atributos e métodos do 
                objeto estão. Note que quando tentamos comparar um objeto com outro usando o sinal 
                de igualdade, o resultado é false. Mas veja o método equals implementado na classe
                User...
     */

}
