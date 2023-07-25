package chalenges.HerancaCarro;

public class Car {
    Integer atualSpeed;
    String name;

    Car(String name){
        this.atualSpeed = 0;
        this.name = name;
    }

    void accelerateCar(){
        if(atualSpeed < 210){
            this.atualSpeed += 5;
            System.out.println("Atual speed car: " + atualSpeed);
        } else {
            System.out.println("The car arrives to your max speed!!!");
        }
    }

    void breakingCar(){
        if(atualSpeed > 0){
            this.atualSpeed -= 5;
            System.out.println("Atual speed car: " + atualSpeed);
        } else {
            System.out.println("The car is stoped...");
        }
    }
}
