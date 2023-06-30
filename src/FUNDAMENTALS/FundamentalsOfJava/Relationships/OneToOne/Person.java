package FUNDAMENTALS.FundamentalsOfJava.Relationships.OneToOne;

/*  Acompanhe a explicação abaixo para ver como o relacionamento 1 para 1 pode ser gerado
    entre classes...
*/

public class Person {

    final String NAME;
    final Hearth HEARTH; //O objeto de Hearth não pode ser alterado, tornando-o único...

    Person(String name){
        this.NAME = name;
        System.out.println("Person is created!");
        this.HEARTH = new Hearth(this); //Só quando geramos uma instância de Person
        sayMyName();                           //é que uma instância é gerada, estabelendo
    }                                          //dependência. Além disso, note que o
                                               //método construtor passa o próprio objeto
                                               //por através do this para estabelecer uma
                                               //relação 1 para 1. Veja na classe "Hearth"
                                               //como essa relação é estabelecida...

    void sayMyName(){
        System.out.println("Your name is: " + NAME);
    }

    void isAlive(){
        if(this.HEARTH.hearthbeat){                         //Veja que até mesmo esse método
            System.out.println(this.NAME + " is alive.");   //depende de um valor que um
        } else {                                            //valor que só Hearth pode passar...
            System.out.println(this.NAME + " isn't alive.");
        }
    }

}
