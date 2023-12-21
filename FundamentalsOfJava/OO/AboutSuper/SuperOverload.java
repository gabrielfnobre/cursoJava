package OO.AboutSuper;

/*  Aqui já estamos exemplificando como usar o método construtor para chamar
*   o método construtor padrão da Super classe, como também para gerar uma
*   sobrecarga sobre o método construtor da própria sub classe...
*
*   Agora vá até a classe AboutSuper para ver como instanciamos...
* */

public class SuperOverload extends SuperClassComum{
    String name;
    String lastName;
    String createData;

    SuperOverload(){
        super();
    }

    SuperOverload(String name){
        this(name, "anyLastName");
        this.createData = "no one date";
    }

    SuperOverload(String name, String lastName){
        this(name, lastName, "00/00/0000");
    }

    SuperOverload(String name, String lastName, String createDate){
        this.name = name;
        this.lastName = lastName;
        this.createData = createDate;
    }

    void showAllAttributes(){
        System.out.println("name: " + name + " | last name: " + lastName + " | create date: " + createData);
    }

}
