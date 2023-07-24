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

    void howManyWhells(String superclass){              //Nesse exemplo estamos mostrando que mesmo
        if(superclass == "super"){                      //em overrides podemos chamar o mesmo método
            super.howManyWheels();                      //da superclass, usando a palavra reservada
        } else {                                        //"super"...
            System.out.println("Use word \"super\"!");
        }
    }

    //AGORA VÁ PARA O ARQUIVO Inheritance...

}
