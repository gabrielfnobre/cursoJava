//  EXEMPLO SIMPLES DA CRIAÇÃO DE UM OBJETO POR ATRAVÉS DE UMA CLASSE:
//  A continuação desse exercício está em Methods/ExampleMethodInstancer.java

/*  Aqui abaixo temos o exemplo clássico de 2 objetos criados a partir de uma classe,
    note alguns detalhes importantes:

        # Essa classe em que estamos é a classe responsável pela criação dos
            objetos. Sempre haverá num programa uma classe que faz isso, note
            que ela faz isso por através da palavra reservada "new", essa 
            palavra faz referência a Classe construtora dos objetos, que no 
            caso é a classe "Product";

        # Note que, nesse exemplo, não foi necessário importar a classe 
            "Product" para essa classe em que estamos. Isso acontece por que 
            a nossa classe "Product" está presente no mesmo pacote. Por isso 
            podemos chamar por ela diretamente, se ela estivesse em outro 
            pacote, seriamos obrigados a usar a notação ponto para chamar 
            pela classe;

        # Note também que podemos instanciar objetos de 2 formas diferentes
            no Java. Podemos fazer isso atribuíndo o próprio nome da classe
            ao tipo de objeto que vamos gerar, ou por através da inferência 
            usando o "var";

        # Note também que neste exemplo - como temos apenas classes públicas
            podemos acessar diretamente os atributos e inserir valores a 
            eles por através da notação ponto, acessando diretamente os 
            atributos da classe "Product" e modificando seus valores;
 */

public class ProductInstancer {
    public static void main(String[] args) {
        
        Product p1 = new Product();
        var p2 = new Product();

        p1.name = "Notebook";
        p1.price = 2160.99;
        p1.discount = 0.25;

        p2.name = "Caneta Preta";
        p2.price = 1.50;
        p2.discount = 0.29;

        System.out.println("Ex01:");
        System.out.println("Esse é o produto 1:");
        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.discount + "\n");

        System.out.println("Esse é o produto 2:");
        System.out.println(p2.name);
        System.out.println(p2.price);
        System.out.println(p2.discount + "\n");
        
        System.out.println("Ex02:");
        System.out.println("Descontos aplicados aos produtos:");
        System.out.printf("Produto 1: R$%.2f\n" , (p1.price * (1 - p1.discount)));
        System.out.printf("Produto 2: R$%.2f\n" , (p2.price * (1 - p2.discount)));
    }

    /*  Ex01 - Nesse exemplo podemos ver como usar a notação ponto para visualizar os valores que foram atribuídos aos
                objetos da classe "product";
     */

    /*  Ex02 - Nesse exemplo podemos constatar que realmente os valores que foram atribuídos possuem um tipo da dados 
                idêntico ao que foi criado na Classe Construtora e que até podemos operar sobre eles - muito embora 
                essas operações que foram feitas aqui não sejam aplicadas sobre os valores reais dos objetos, elas 
                estão sendo aplicadas somente durante a impressão no terminal. Mas como nesse exemplo estamos usando 
                classes públicas, poderíamos operar os valores dos atributos e reatribuí-los aos objetos, isso faria
                com que os valores reais fossem trocados;
     */
}
