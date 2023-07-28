package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.Interfaces;

/*  Aqui temos um exemplo de interface, antes de seguirmos para ver o que está
*   acontecendo no código, é importante ressaltar alguns aspectos importantes
*   sobre interfaces:
*
*       #   INTERFACES, SEUS MÉTODOS E ATRIBUTOS SÃO SEMPRE PÚBLICOS E
*           ESTÁTICOS!:
*               Já é padrão das interfaces ter seus membros públicos e
*               estáticos não podemos repetir o nome de um atributo tornando-o
*               dinâmico para as instâncias de uma classe. Nem podemos
*               aumentar o seu nível de encapsulamento (mesmo dentro das
*               classes);
*
*       #   MÉTODOS DEVEM SER SEMPRE ABSTRATOS (OU NÃO DEPOIS DO JAVA 8):
*               Os métodos de uma interface devem ser sempre abstratos (sem
*               implementação), a implementação deve ser feita na classe. Mas,
*               mas! Existe um adendo a isso, depois do java 8 foi
*               implementado o método default para interfaces, onde podemos
*               implementar um método padrão dentro da interface que poderá
*               ser herdado pela classe que usar a interface. Sendo possível
*               que a classe tanto utilize o método padrão, quanto possa
*               sobrescrever esse método;
*
*       #   POR PADRÃO OS ATRIBUTOS SÃO SEMPRE CONSTANTES:
*               Mesmo sem colocar o "final" na frente do nome da variável, ela
*               já é uma constante. Ela pode ser uma variável? Sim se for a
*               partir do java 8, basta colocarmos o nome "static" na frente
*               da variável;
*
*       #   INTERFACES PERMITEM HERANÇA MÚLTIPLA:
*               Diferente da herança entre classes, onde uma classe no java
*               só pode herdar os membros de uma única super classe. Com as
*               interfaces é diferente, uma classe pode herdar elementos de
*               várias interfaces;
*
*   Essas características reforçam a ideia de que uma interface tem apenas um
*   papel: servir de contrato para que outras classes implementem os seus
*   membros.
*
*   Siga o código para ver de perto a implementação...
*
* */

public interface Sportive {         //Em vez de "class" recebe o nome de "interface", sempre são públicas!

    Integer COMUMN_DELTA = 20;      //Mesmo sem o "final" por padrão, os atributos são sempre constantes!
    Integer MAX_SPEED = 350;

    void turnOnTurbo();             //Só métodos abstratos!!
    void turnOffTurbo();

    default void strangerMethod(){
        System.out.println("I can to be invoke");
    } //Aqui temos o exemplo de
                                                                                //um método padrão, note
                                                                                //usamos a palavra reservada
                                                                                //"default" para implementar
                                                                                //esse método...

    // SIGA PARA A INTERFACE Luxury...

}
