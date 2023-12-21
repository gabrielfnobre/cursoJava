package Generics.PraticeExampleGenerics;

public class ClassForGenerics<T> { // #01
    private T myObject; // #02

    public T getMyObject() { // #03
        return myObject;
    }

    public void setMyObject(T myObject) { // #04
        this.myObject = myObject;
    }

}

/*  #01 - Aqui usamos generics para definir a classe como genérica...
*
*   #02 - Aqui usamos generics para definir o atributo como genérico, note que pela classe
*           já ser genérica, não foi necessário usar a notação com o par de "<>";
*
*   #03 - Aqui temos o exemplo de um método genérico dentro de uma classe genérica, note
*           também que pela classe já ser genérica não foi necessário definir o método co-
*           mo genérico;
*
*   #04 - Aqui nós temos o exemplo de um método genérico que foi definido dentro da classe
*           como a classe já é genérica, ao usar o tipo genérico aqui, ela só aceitará o
*           tipo que foi definido no momento da instancialização da classe;
*
*   Vá para "GenericsExplained"...
* */