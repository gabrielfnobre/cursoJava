package OO.Inheritance;

//  Veja que a classe Motocycle herda características da superclasse motocycle...


public class Motocycle extends Vehicle{ //A subclasse tem que usar "extends" para herdar da Superclasse...
    Integer whells;

    Motocycle(String name, Integer speed){  //Para usar o método construtor, temos que usar a palavra
        super(name, speed);                 //reservada "super" para passar parâmetros que queremos
    }                                       //reutilizar

    @Override                                       //Note que aqui sobrescrevemos o método howManyWheels
    void howManyWheels() {                          //afinal, cada tipo de veículo tem um número de rodas
        this.whells = 2;                            //diferente...
        System.out.println("wheels: " + whells);
    }

    //VEJA AGORA UMA IMPLEMENTAÇÃO DIFERENCIADA NA CLASSE Car...

}
