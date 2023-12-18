package FUNDAMENTALS.FundamentalsOfJava.Generics.InheritanceUsingGenerics;

public class Box <T>{
    private T myThingInTheBox;

    public T getMyThingInTheBox() {
        return myThingInTheBox;
    }

    public void setMyThingInTheBox(T myThingInTheBox) {
        this.myThingInTheBox = myThingInTheBox;
    }
}

/*  Note aqui na classe Box que temos uma Classe Genérica de um tipo "T" que tem a respon-
*   sabilidade de receber um objeto do tipo "T" com seus respectivos métodos getter e
*   setter.
*
*   Vá agora para a classe "BoxIntoTheBox", uma classe filha dessa classe para ver como
*   fizemos a implementação do Generics...
*
* */
