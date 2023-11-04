package chalenges.visibilyLevels.ModelsCar;
import chalenges.visibilyLevels.Car.Car;

public class Civic extends Car {
    final String NAME = "Civic";
    int finalSpeed;

    Civic(int finalSpeed, int deltaAccelerate){
        super(finalSpeed, deltaAccelerate);
    }
}
