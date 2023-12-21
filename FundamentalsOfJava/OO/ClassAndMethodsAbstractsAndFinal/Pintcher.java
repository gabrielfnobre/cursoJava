package OO.ClassAndMethodsAbstractsAndFinal;

/*  Esse exemplo é só para mostrar que a classe Dog, por ser "final" não pode ser herdada...
* */

//public class Pintcher extends Dog{ //Descomente aqui e veja que o código não roda, pois Dog não pode ser herdado...
public class Pintcher{
    void whatsUp(){
        System.out.println("Can't inherit of the Dog!!!");
    }
}

//SIGA PARA A CLASS Whale...
