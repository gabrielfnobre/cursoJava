package Generics.WildcardsAndBoundedGenerics;

public class ExampleWithClass <T extends Number>{ //Veja que já no início da classe
    public void sumToDouble(T n1, T n2){            //nós definimos que o ela deve-
        System.out.println(n1.doubleValue() + n2.doubleValue()); //rá ter um tipo
    }                                               //genérico que seja filho de
}                                                   //Number, ou seja, poderá rece-
                                                    //ber Integer ou Double, mas a
                                                    //soma sempre será transformada
                                                    //para double!!!

/*  Vá agora para a classe "WildcardsAndBoundedGeneric" para ver como utilizamos
*   essas classes e métodos...
* */