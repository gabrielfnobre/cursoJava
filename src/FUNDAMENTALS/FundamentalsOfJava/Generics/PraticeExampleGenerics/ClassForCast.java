package FUNDAMENTALS.FundamentalsOfJava.Generics.PraticeExampleGenerics;

public class ClassForCast {

    private Object myObject;

    public Object getMyObject() {
        return myObject;
    }

    public void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
}

/*  Note que criamos uma classe que possuí um único atributo "Object", ou seja, capaz de
*   receber qualquer tipo de dado, porém, note que o retorno sempre será Object. Isso
*   pode nos gerar problemas.
*
*   Vá agora para "ClassForGenerics"...
* */
