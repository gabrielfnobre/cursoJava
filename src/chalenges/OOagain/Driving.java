package chalenges.OOagain;

public class Driving {
    public static void main(String[] args) {
        Car car = new Car();
        car.showMyName();
        car.carOn();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.carOff();
        System.out.println();

        Civic civic = new Civic();
        civic.showMyName();
        civic.carOn();
        civic.speedUp();
        civic.speedUp();
        civic.speedUp();
        civic.speedUp();
        civic.speedUp();
        civic.speedUp();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.carOff();
        System.out.println();

        Car ferrari = new Ferrari();
        ferrari.showMyName();
        ferrari.carOn();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.carOff();
        System.out.println();

        ferrari = new Civic();
        ferrari.showMyName();
    }
}
