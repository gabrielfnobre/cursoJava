package FUNDAMENTALS.FundamentalsOfJava.Enums;

public enum Planet {

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 6.911e7),
    SATURN(5.688e+26, 5.8232e7),
    URANUS(8.686e+25, 2.5362e7),
    NEPTUNE(1.024e+26, 2.4622e7);

    private final double MASS;
    private final double RADIUS;

    Planet(double mass, double radius) {
        this.MASS = mass;
        this.RADIUS = radius;
    }

    public double getMass() {
        return MASS;
    }

    public double getRadius() {
        return RADIUS;
    }

    // Constante gravitacional universal em m^3 kg^−1 s^−2
    public static final double G = 6.67300E-11;
}
