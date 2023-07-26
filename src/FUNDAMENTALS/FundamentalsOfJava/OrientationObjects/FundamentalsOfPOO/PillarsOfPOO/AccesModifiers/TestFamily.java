package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers;

import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.House.Ana;
import FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.AccesModifiers.Job.Paul;

public class TestFamily {
    public static void main(String[] args) {
        Paul paul = new Paul();
        System.out.println(paul.inheritProtected);
        System.out.println(paul.inheritPublic);
    }
}
