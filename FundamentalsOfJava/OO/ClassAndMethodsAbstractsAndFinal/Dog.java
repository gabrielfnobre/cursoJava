package OO.ClassAndMethodsAbstractsAndFinal;

/*  Aqui temos uma classe Concreta, que é uma classe como geralmente estamos
*   acostumados. Antes de analisar o código é importante estar atento a
*   algumas características importantes sobre classes concretas:
*
*       # CLASSES CONCRETAS DEVEM TER TODOS OS SEUS MÉTODOS IMPLEMENTADOS:
*           É impossível compilar uma classe concreta sem que todos os seus
*           métodos estejam implementados, ou seja ela não aceita métodos
*           abstratos;
*
*       # PODEMOS TRANSFORMAR TANTO A CLASSE QUANTO OS MÉTODOS DELA EM
*         FINALS:
*           Tanto as classes concretas quanto seus métodos podem ser
*           "final", ou seja, podem ser definitivos. Isso quer dizer
*           que:
*               Uma classe final não pode ser herdada;
*               Um método final não pode ser modificado;
*
*   Siga o código para ver a implementação...
* */

public final class Dog extends Mammal{ //Veja que a classe Dog herda os membros de Mammal, mas ao mesmo tempo ela também é uma classe final, o que significa que nenhuma outras classe poderá herdar seus membros...
    @Override                               //Veja que fizemos uma sobrescrita no método "move" que era um método
    public final String move(){             //abstrato vindo desde a classe Animal. Se não tivessemos feito essa
        return "Moving using the paws";     //sobrescrita o java nem mesmo compilaria. Colocamos um final nesse
    }                                       //método também, caso uma classe filha tentasse sobrescrevê-la daria erro.

    //SIGA PARA A CLASSE Pintcher....

}
