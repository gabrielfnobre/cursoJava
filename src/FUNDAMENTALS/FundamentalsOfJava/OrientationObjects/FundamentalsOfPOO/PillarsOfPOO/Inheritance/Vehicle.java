package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.Inheritance;

public class Vehicle {

    String name;
    Integer speed;

    Vehicle(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }

    void mySpeed(){
        System.out.println("speed: " + this.speed);
    }

}
