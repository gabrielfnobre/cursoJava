package chalenges.HerancaCarro;

public class Ferrari extends Car{
    Ferrari(String name){
        super(name);
    }

    @Override
    void accelerateCar() {
        if(atualSpeed < 350){
            this.atualSpeed += 50;
            System.out.println("Atual speed car: " + atualSpeed);
        } else {
            System.out.println("The car arrives to your max speed!!!");
        }
    }

    @Override
    void breakingCar() {
        if(atualSpeed > 0){
            this.atualSpeed -= 50;
            System.out.println("Atual speed car: " + atualSpeed);
        } else {
            System.out.println("The car is stoped...");
        }
    }
}
