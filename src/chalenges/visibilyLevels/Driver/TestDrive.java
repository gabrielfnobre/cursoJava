package chalenges.visibilyLevels.Driver;
import chalenges.visibilyLevels.Car.Car;

public class TestDrive {
    public static void main(String[] args) {

        Car car = new Car(180, 40);

        car.showMyName();
        car.speedUp();
        car.carOn();
        car.speedUp();
        car.speedUp();

    }
}
