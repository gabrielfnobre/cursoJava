package OO.AnonimousClass;

//  CLASSE ANÔNIMA:

/*  Em Java, uma classe anônima é uma classe que não possui um nome explicitamente definido. Ela é usada para criar uma
*   instância de uma classe abstrata ou de uma interface, sem a necessidade de criar uma classe separada para
*   implementar essas interfaces ou extender classes abstratas.
*
*   As classes anônimas são particularmente úteis ao trabalhar com interfaces funcionais, que são interfaces que
*   possuem apenas um método abstrato (conhecidos como interfaces funcionais a partir do Java 8). Elas são comumente
*   usadas com expressões lambda para criar objetos de implementações de interfaces de forma rápida e simples.
*
*   Elas eram comumente usadas como alternativa as functional interfaces quando essas não existiam. Mas após a sua
*   criação com o Java 8, elas foram praticamente substituídas pelas lambdas em conjunto com as functional iterfaces.
*
*   Veja abaixo como fazemos para implementar e usar uma classe anônima...
* */

public class AnonimousClass {
    public static void main(String[] args) {
        System.out.println();
        Anominous anonimous = new Anominous(){                                  //Aqui temos um exemplo típico de
            public void sayHello(){                                             //classe anônima, onde instanciamos
                System.out.println("I'm a method of the anonimous class!");     //uma interface ou classe abstrata
            }                                                                   //sobre uma classe que não existe de
        };                                                                      //fato, afinal não podemos instanciar
                                                                                //classes abstratas nem interfaces.
                                                                                //veja que na sequência da
                                                                                //instancialização, nós somos obrigados
                                                                                //a implementar o método abstrato...

        anonimous.sayHello();

    }

    interface Anominous{
        void sayHello();
    }
}
