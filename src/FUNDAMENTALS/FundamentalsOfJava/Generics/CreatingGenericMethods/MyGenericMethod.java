package FUNDAMENTALS.FundamentalsOfJava.Generics.CreatingGenericMethods;

public class MyGenericMethod { //Note que a classe não é genérica...

    public static <T> Object sumOrConcatenate(T v1, T v2){  //Note que criamos um método
        if(v1 instanceof Number && v2 instanceof Number){   //estático e genérico do ti-
            return (int) v1 + (int) v2;                     //po "T" que retorna um Ob-
        } else {                                            //ject, ou seja, qualquer ti-
            return (String) v1 + v2;                        //po de dado e compara se for
        }                                                   //instancia de Number, faz a
    }                                                       //soma se não concatena...

    public static <T> void whatIsTheType(T type){           //E aqui temos um método que
        System.out.println(type.getClass().getSimpleName());//pode receber qualquer tipo
    }                                                       //de dado e retorna qual é a
                                                            //classe desse tipo de dado...
}

/*  Veja como podemos usar esses métodos na classe "CreatingGenericMethods"...
* */
