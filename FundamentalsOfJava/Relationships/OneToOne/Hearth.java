package Relationships.OneToOne;

public class Hearth {
    final Person PERSON; //O objeto "PERSON" não pode ser alterado, tornando-o único...
    Boolean hearthbeat = false;

    Hearth(Person person){     //Note que na construção do objeto o que recebemos é um
        this.PERSON = person;  //objeto "Person" que será atribuíto a uma constante
        hearthbeatOn();        //imutável. Isso nos garante que esse objeto "Hearth"
    }                          //só seja acessível a partir de um único objeto
                               //Person em comum...

    void hearthbeatOn(){
        this.hearthbeat = true;
        System.out.println("Person is alive\nTumTum... TumTum... TumTum");
    }
}
