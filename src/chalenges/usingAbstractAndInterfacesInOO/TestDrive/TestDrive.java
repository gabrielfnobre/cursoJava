package chalenges.usingAbstractAndInterfacesInOO.TestDrive;

import chalenges.usingAbstractAndInterfacesInOO.Car.Car;
import chalenges.usingAbstractAndInterfacesInOO.Car.CommonCar;
import chalenges.usingAbstractAndInterfacesInOO.Car.LuxCar;

public class TestDrive {
    public static void main(String[] args) {

        CommonCar civic = new CommonCar("Civic");

        System.out.println("\n" + civic.getNAME());
        civic.carON();
        civic.speedUp();
        civic.speedUp();
        civic.airIsON();
        civic.speedUp();
        civic.speedUp();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.brake();
        civic.brake();

        LuxCar ferrari = new LuxCar("Ferrari");

        System.out.println("\n" + ferrari.getNAME());
        ferrari.carON();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.turboON();
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
        ferrari.turboOFF();
        ferrari.speedUp();
        ferrari.airIsON();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.airIsOFF();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.carOFF();
    }
}
