package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House;

public class Ana {
    private String secrets = "secrets";
    protected String mannerOfSpeaking = "fast speaking";
    String hobby = "novels";
    public String job = "secretary";

    static Peter husband = new Peter();

    public static void main(String[] args) {
        System.out.println(husband.hobby);
        System.out.println(husband.mannerOfSpeaking);
        System.out.println(husband.job);
        //System.out.println(husband.secrets);
        System.out.println();
    }

}
