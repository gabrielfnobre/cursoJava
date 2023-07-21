package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("gol", 240);
        Vehicle moto = new Motocycle("yamaha", 180);

        car.mySpeed();
        moto.mySpeed();

        System.out.println(moto.getClass());
        System.out.println(car.getClass());
    }
}
