package OO.TheThis;

public class TheThisInstancer {

    public static void main(String[] args){

        //Ex01
        TheThis person0 = new TheThis();
        System.out.println("Ex01");
        System.out.println(person0.showTheThis() + "\n");
        
        //Ex02
        TheThis person1 = new TheThis("Vandeilson");
        System.out.println("Ex02");
        System.out.println(person1.showTheThis() + "\n");
        
        //Ex03
        TheThis person2 = new TheThis("Calóvisk", "Clements");
        System.out.println("Ex03");
        System.out.println(person2.showTheThis() + "\n");
        
        //Ex04
        TheThis person3 = new TheThis("August", "Clements", 32);
        System.out.println("Ex04");
        System.out.println(person3.showTheThis() + "\n");
        
        //Ex05
        System.out.println("Ex05");
        person3.showMeAllAttributes();

    }

    /*  Ex 01 - Note neste exemplo que chamamos pelo construtor padrão, que automáticamente chama pelo 
                construtor que possuí somente 1 parâmetro;
    */
    
    /*  Ex 02 - Note que ao usar o construtor que possuí o "this" só para o "name", conseguimos pegar o nome 
                passado como argumento corretamente;
    */

    /*  Ex 03 - Neste exemplo, o construtor não usa o "this", por isso ele atribuí o valor ao parametro do 
                método. Por isso, quando chamamos pelo método "showTheThis()" ele retorna os atributos com o
                valor "nulo", pois nada foi atribuído á elas;
    */

    /*  Ex 04 - Aqui temos um caso de sucesso, onde todos os atributos receberam valores;
    */
    
    /*  Ex 05 - Aqui nós usamos o método para mostrar todos os atributos da instância. Esse método utiliza o
                "this" para referenciar todo o objeto;
    */

}
