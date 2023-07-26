package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.Job;

/*  Note aqui em Paul a relação muda, não é mais uma composição e sim uma herança.
*   Siga o código para ver como os modificadores de acesso estão colocados...
* */

import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House.Ana;
//Necessário exportar a classe Ana, pois ela está fora do pacote Job...

public class Paul extends Ana { //Paul é público para poder ser acessado pela classe "TestFamily"...
    private String secrets = "secrets of Paul"; //Os segredos de Paul só ele sabe...
    String hobby = "video game"; //O hobby de Paul só quem trabalha com ele sabe...
    protected String mannerOfSpeaking = super.mannerOfSpeaking; //O jeito de falar de Paul foi herdado de sua mãe, e pode ser visto por quem trabalha com ele...
    public String job = "developer"; //A profissão de Paul, qualquer um pode saber...

    FriendsPaul carl = new FriendsPaul(); //Paul tem um amigo no trabalho chamado Carl, que ninguém conhece a não ser o pessoal do trabalho...

    public void whatOnlyPaulKnows(){ //Deixado público para ser acessado pela classe "TestFamily"...
        System.out.println("Only Paul knows: " + secrets);
    }

    public void whatPaulKnowsAboutYourFriend(){ //Deixado público para ser acessado pela classe "TestFamily"...
        System.out.println("Friend's Paul job: " + carl.job);
        System.out.println("Friend's Paul hobby: " + carl.hobby);
        System.out.println("Friend's Paul manner of speaking: " + carl.mannerOfSpeaking);
    }
    public void whatAllKnowAboutPaul(){ //Deixado público para ser acessado pela classe "TestFamily"...
        System.out.println("All know Paul's job: " + job);
    }

    //SIGA PARA A CLASSE FriendsPaul...
}
