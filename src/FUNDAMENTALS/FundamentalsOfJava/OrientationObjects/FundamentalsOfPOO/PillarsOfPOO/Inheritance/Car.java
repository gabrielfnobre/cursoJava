package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.Inheritance;

//  Note que em car, teremos uma implementação diferente da que tivemos em Motocycle...

public class Car extends Vehicle{
    Integer whells;
    String model;

    Car(String name, Integer speed, String model) { //Note que aqui, além de usar super nós também
        super(name, speed);                         //acrescentamos mais um parâmetro, que deverá
        this.model = model;                         //existir somente em "Car" e ao mesmo tempo
    }                                               //estamos aproveitando atributos da superclasse

    @Override                                       //Também fizemos uma sobrescrita de métodos
    void howManyWheels() {                          //para que o carro apresente 4 rodas em vez de
        this.whells = 4;                            // 1 como acontece em vehicle...
        System.out.println("wheels: " + whells);
    }

    //AGORA VÁ PARA O ARQUIVO Inheritance...

}
