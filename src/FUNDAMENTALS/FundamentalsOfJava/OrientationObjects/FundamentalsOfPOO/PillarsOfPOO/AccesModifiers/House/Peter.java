package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House;

public class Peter {
    private String secrets = "secrets";
    protected String mannerOfSpeaking = "low speaking";
    String hobby = "baseball";
    public String job = "lawer";

    static public Ana wife = new Ana();

    public static void main(String[] args) {
        System.out.println(wife.hobby);
        System.out.println(wife.mannerOfSpeaking);
        System.out.println(wife.job);
        //System.out.println(husband.secrets);
    }
}
