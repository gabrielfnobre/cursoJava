package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House;

/*  Aqui na classe Ana já podemos encontrar alguns modificadores de acesso,
*   o objetivo desse pacote é ilustrar como a relação entre os
*   modificadores pode ser ilustrada com as relações humanas. Estamos
*   exemplificando aqui:
*
*   1 Casa (Pacote House) onde mora um casal Ana e Peter possuem algumas
*   relações entre eles:
*           private - coisas que só quem está dentro da classe
*                       (exemplificado pela pessoa) pode saber;
*           package - coisas que só quem está dentro do pacote
*                       (exemplificado pela casa) pode saber;
*           protected - coisas que só quem está dentro da classe ou
*                       herda pode saber (exemplificado pela casa
*                       e pelo filho do casal "Paul");
*           publica - coisas que qualquer classe pode ter acesso
*                       (exemplificado por qualquer pessoa pode saber);
*
*   2 Trabalho do filho (Pacote Job) onde o filho trabalha, lá ele
*   possuí um amigo que sabe pouco ou nada sobre os pais de Paul.
*
*   Siga o código e veja como está a implementação primeiramente em Ana...
* */

import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.Job.Paul;

public class Ana { //Começa pela classe que já é publica, podendo ser acessa a partir de qualquer classe...
    private String secrets = "secrets of Ana"; //Os segredos de Ana, só ela pode saber...
    String hobby = "novels"; //O hobby de Ana é package que é o default, significa que qualquer classe dentro do pacote pode ter acesso...
    protected String mannerOfSpeaking = "fast speaking"; //O jeito de falar de Ana pode ser percebido por qualquer pessoa que more na mesma casa ou que tenha herança com ela...
    public String job = "secretary"; //O emprego de Ana qualquer pessoa pode saber...

    final Peter HUSBAND; //Ana possuí um marido...
    Paul SON; //Ana possuí um filho...

    public Ana(){                               //Veja que o construtor de Ana está público para que possa ser
        this.HUSBAND = new Peter(this);    //acessado de fora do pacote pela classe "TestFamily". Além disso,
    }                                           //veja que já instanciamos um objeto Peter para servir como
                                                //marido de ana...
    public void whatOnlyAnaKnows(){ //Método deixado público para ser acesso por "TestFamily"...
        System.out.println("Only Ana knows: " + secrets);
    }

    public void whatAnaKnowsAboutAllInYourHouse(){ //Método deixado público para ser acesso por "TestFamily"...
        System.out.println("Husband job: " + HUSBAND.job);
        System.out.println("Husband hobby: " + HUSBAND.hobby);
        System.out.println("Husband manner of speaking: " + HUSBAND.mannerOfSpeaking);
    }
    public void whatAllKnowAboutAna(){  //Método deixado público para ser acesso por "TestFamily"
        System.out.println("All know Ana's job: " + job);
    }

    public void getSonJob(Paul son){                        //Método deixado público para ser acesso por "TestFamily",
        this.SON = son;                                     //além disso, veja que já instanciamos um objeto filho
        System.out.println("Ana's son job: " + SON.job);    //para Ana possuir um filho que será passado por
    }                                                       //parâmetro...

    //SIGA AGORA PARA A CLASSE Peter...

}
