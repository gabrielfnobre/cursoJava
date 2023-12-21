package OO.Composition;

public class Car {
    //Aqui temos a composição, essa composição é de 1 para 1, já só podemos ter 1 motor para 1 carro...
    final Motor MOTOR;
    final String NAME;

    /*Note que os objetos de motor só existem por causa de carro, se carro parar de existir,
    *   motor fica inútil. Veja também que é um relação 1 para 1, pois só poderemos ter 1 único objeto
    *   MOTOR no carro, declarado sobre uma constante, e ao mesmo tempo, usamos o método construtor de
    *   motor para receber o objeto de carro, que também é único. Fazendo com que 1 carro só receba 1
    *   motor e vice e versa. Estabelecendo a relação 1 para 1.
    */
    Car(String name){
        this.NAME = name;
        this.MOTOR = new Motor(this);
    }

    //Note que os métodos abaixo conseguem acessar os atributos e métodos de motor sem problemas...
    void acelerate(){
        if(MOTOR.on){
            if(MOTOR.injectionFactor < 2.6){
                MOTOR.injectionFactor += 0.4;
            } else {
                System.out.println("The car arrives to max speed!");
            }
        } else {
            System.out.println("The car is off, cannot acelerate");
        }
    }

    void brake(){
        if(MOTOR.injectionFactor > 0.5){
            MOTOR.injectionFactor -= 0.4;
        }
    }

    void turnOn(){
        MOTOR.on = true;
        System.out.println("The car is on!");
    }

    void turnOff(){
        MOTOR.on = false;
        System.out.println("The car is off.");
    }

    boolean isOn(){
        return MOTOR.on;
    }

    int speed(){
        return MOTOR.rpm();
    }
}