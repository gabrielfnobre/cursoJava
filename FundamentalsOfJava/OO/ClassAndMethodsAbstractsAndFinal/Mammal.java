package OO.ClassAndMethodsAbstractsAndFinal;

/*  Veja aqui que temos uma segunda classe abstrata que herda os membros da
*   classe abstrata Animal. Uma classe abstrata pode, e até deve, herdar de
*   uma classe abstrata mais genérica.
*
*   Note que a classe Mammal herda características genéricas da classe
*   Animal e acrescenta suas próprias características, bem como pode
*   passar características abstratas que foram herdadas como abstratas
*   para suas futuras classes herdeiras se a implementação dessas
*   características ainda não puderem ser implementadas.
*
*   Siga o código para entender melhor ainda a implementação...
* */

public abstract class Mammal extends Animal{ //Novamente temos o abstract para tornar a classe abstrata...
    protected String nurse(){ //Temos uma nova implementação de método, note que o método é concreto...
        return "Milk";
    }

    protected abstract String move(); //E estamos passando um método abstrato para frente como abstrato também...

    //SIGA PARA A CLASSE Dog PARA VER COMO FICA A IMPLEMENTAÇÃO NUMA CLASSE CONCRETA...
}
