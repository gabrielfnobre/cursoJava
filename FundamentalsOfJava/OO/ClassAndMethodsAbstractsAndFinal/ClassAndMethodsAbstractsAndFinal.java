package OO.ClassAndMethodsAbstractsAndFinal;

// CLASSES E MÉTODOS ABSTRATOS E FINAIS:

/*  Não apenas no java com outras linguagens de programação usa-se um conceito de POO
*   que é o conceito de "abstrato", "concreto" e "final" para falar de métodos e
*   classes.
*
*   Esses conceitos são usados em conjunto com o pilar de Herança. O que eles querem
*   dizer?
*
*       - ABSTRATO: É o conceito de que algo ainda não está definido, que precisa de
*                   implementação, de estar completo para ser concreto. Na Herança
*                   isso acontece com constância, onde temos uma Classe mais genérica,
*                   que não possuí muita implementação para uma sub classe herdeira
*                   que possuí uma implementação mais concreta;
*
*       - CONCRETO: É o conceito de que algo está completo, está totalmente definido.
*                   Essa ideia pode ser vista nas subclasses, onde temos classes que
*                   não são genéricas como suas Super Classes, em vez disso, elas
*                   possuem implementações mais exatas do que desejam;
*
*       - FINAL:    Traz a ideia de algo que está totalmente terminado e não deve
*                   ser modificado. Essas seriam as nossas classes folha, onde as
*                   classes não poderão mais ser herdadas, pois já chegaram onde
*                   tinham que chegar;
*
*   No java, por padrão, todas as classes e métodos são "concretos", mas o java
*   possuí palavras reservadas para as implementações "abstract" e "final". Vamos
*   ver como usá-las.
*
*   Siga para a classe Animal...
* */

public class ClassAndMethodsAbstractsAndFinal {
    public static void main(String[] args) {

        Animal tobby = new Dog(); //Veja que podemos instanciar Dog de um tipo Animal, mas não podemos instanciar a partir de Animal...
        Mammal willy = new Whale(); //Veja que podemos instanciar Whale de um tipo Mammal...
        Pintcher pintcher = new Pintcher(); //Instanciamos Pintcher só para mostrar que ele não herda de Dog, por que é impossível...

        System.out.println();
        System.out.println("Tobby: " + tobby.breathe()); //Método herdado de animal...
        System.out.println("Tobby: " + ((Dog) tobby).nurse()); //Veja que tivemos que usar um casting para chamar o método nurse, pois como ele foi passado por herança por através da classe "Mammal", por através do "protected", Animal não conhece esse método, e o objeto tobby foi instanciado à partir de Animal...
        System.out.println("Tobby: " + tobby.move()); //Método que era abstrato e sofreu sobrescrita em Dog...
        System.out.println();

        System.out.println("Willy: " + willy.breathe()); //Método herdado de animal...
        System.out.println("Willy: " + willy.nurse()); //Como o método nurse foi originado em Whale, não precisamos fazer casting...
        System.out.println("Willy: " + willy.move());  //Método que era abstrato e sofreu sobrescrita em Whale...
        System.out.println();

        pintcher.whatsUp(); //Só pra mostrar que uma herança a partir de Dog é impossível!

    }
}
