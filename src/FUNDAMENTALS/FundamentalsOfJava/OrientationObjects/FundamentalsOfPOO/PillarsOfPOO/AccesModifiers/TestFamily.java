package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers;

/*  Esse é o 1º Arquivo a ser lido!!!
*
*   Vamos ver dentro do pacote "AccesModifiers" como podemos usar os "Modificadores
*   de Acesso" do java. Que tem a ver com o pilar e encapsulamento em POO.
*
*   É importante ressaltar que os modificadores de acesso não são usados somente
*   quando temos herança, mas em qualquer tipo de relacionamento dentro do java,
*   como vamos até exemplificar aqui.
*
*   Vá para a classe Ana...
* */

import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House.Ana;
import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House.Peter;
import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.Job.Paul;

public class TestFamily {
    public static void main(String[] args) {

        Ana ana = new Ana(); //Note que podemos chamar ana normalmente...

        System.out.println();
        ana.whatOnlyAnaKnows(); //Só Ana sabe os segredos dela...
        ana.whatAnaKnowsAboutAllInYourHouse(); //O que Ana sabe de seu Marido...
        ana.whatAllKnowAboutAna(); //O que todos sabem sobre Ana...

        Paul paul = new Paul(); //Note que temos que criar um filho e passar o filho para Ana...
        ana.getSonJob(paul); //O que Ana sabe sobre o emprego de seu filho...
        System.out.println();

        Peter peter = new Peter(ana); //Para criar Peter, temos que passar sua esposa...

        System.out.println();
        peter.whatOnlyPeterKnows(); //O que só Peter sabe...
        peter.whatPeterKnowsAboutAllInYourHouse(); //O que Peter sabe sobre sua esposa...
        peter.whatAllKnowAboutPeter(); //O que qualquer pessoa pode saber sobre Peter...
        System.out.println();

        System.out.println();
        paul.whatOnlyPaulKnows(); //O que só Paul sabe...
        paul.whatPaulKnowsAboutYourFriend(); //O que Paul sabe sobre o seu amigo...
        paul.whatAllKnowAboutPaul(); // O que qualquer pessoa pode saber sobre o Paul...
        System.out.println();


    }
}
