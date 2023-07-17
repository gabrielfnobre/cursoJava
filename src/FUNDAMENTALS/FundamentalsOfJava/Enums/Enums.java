package FUNDAMENTALS.FundamentalsOfJava.Enums;

public class Enums {
    public static void main(String[] args) {
        double weigth = 80;
        Planet planet = Planet.EARTH;

        double mass = weigth / Planet.EARTH.getGravidadeSuperficial();
        for (Planet p : Planet.values()) {
            System.out.printf("Your weigth in %s will be %.2f kg%n", p, p.pesoSuperficie(massa));
        }
    }
}
