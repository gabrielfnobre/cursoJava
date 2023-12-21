package OO.Inheritance;

/*  Aqui temos uma superclasse para veículo, veja que essa superclasse é genérica em relação as
*   subclasses que veremos (Motocycle e Car).
*   VEJA AGORA A IMPLEMENTAÇÃO DE UMA SUBCLASSE NA CLASSE Motocycle...
* */

public class Vehicle {

    String name;
    Integer speed;
    Integer whells;

    Vehicle(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }

    void mySpeed(){
        System.out.println("speed: " + this.speed);
    }

    void howManyWheels(){
        this.whells = 1;
        System.out.println("whell(s): "  + whells);
    }

}
