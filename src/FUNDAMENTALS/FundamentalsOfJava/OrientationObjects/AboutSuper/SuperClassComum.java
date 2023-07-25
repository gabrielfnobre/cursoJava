package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.AboutSuper;

/*  Note que aqui temos uma implementação simples de uma superclasse que receberá um
*   nome e o exibirá por através de um método. Note que essa classe tem 2
*   construtores, um padrão e um implementado. Agora vá na classe SubClassComum para
*   ver como fazemos para chamar o construtor padrão...
* */

public class SuperClassComum {
    String nameClass;

    SuperClassComum(){
        this.nameClass  = "super class";
    }
    SuperClassComum(String name){
        this.nameClass  = name;
    }

    void sayMyName(){
        System.out.println(nameClass);
    }

}
