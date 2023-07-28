package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.ClassAndMethodsAbstractsAndFinal;

/*  A classe Animal, foi desenvolvida para ser uma classe abstrata. Ela é a
*   principal Super Classe desse exemplo. Como uma classe abstrata existem
*   algumas coisas que ela pode e que não pode fazer, e isso serve para
*   qualquer classe abstrata desenvolvida no java:
*
*       # CLASSES ABSTRATAS NÃO PODEM SER INSTANCIADAS:
*
*           Tente instanciar uma classe abstratas, você terá a grata supresa
*           de que isso não é possível. Pois, as classes abstratas têm
*           apenas 1 objetivo, passar métodos e atributos para frente, para
*           as classes herdeiras;
*
*
*       # CLASSES ABSTRATAS PODEM TER TANTO MÉTODOS ABSTRATOS QUANTO
*         MÉTODOS CONCRETOS:
*
*           Já tentou criar um método abstrato (método sem corpo, como os
*           usamos em interfaces) dentro de uma classe concreta? O
*           resultado será uma falha de compilação. O java não deixa
*           criarmos métodos abstratos dentro de classes concretas, afinal
*           as classes concretas têm de estar "concretas", ou seja,
*           terminadas. Por isso as classes abstratas podem representar
*           muito bem as superclasses, por que elas aceitam tanto métodos
*           concretos quanto métodos abstratos. Ambos poderão ser
*           sobrescritos depois em suas subclasses, tudo dependerá da
*           vontade do desenvolvedor;
*
*   Siga o código abaixo para ver como é feita a implementação tanto de
*   uma classe quanto de um método abstrato...
* */

public abstract class Animal {  //Veja que usamos a palavra reservada "abstract" para identificar uma classe como abstrata, se não usarmos nada o java entende que a classe é concreta...
    protected String breathe(){ //Veja que podemos ter métodos concretos...
        return "CO2";
    };

    protected abstract String move();   //Veja aqui que para tornar um método abstrato temos que fazer 2 coisas:
}                                       // 1º o método não pode ter corpo;
                                        // 2º devemos usar a palavra reservada "abstract";

    //SIGA AGORA PARA A CLASSE Mammal...