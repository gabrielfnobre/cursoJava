package chalenges.usingAbstractAndInterfacesInOO.Car;

public class CommonCar extends Car implements AirConditioning {
    private Boolean isON = false;
    private int speed = 0;
    private final String NAME;
    private final int FINAL_SPEED = 190;
    private int deltaAcceleration = 30;

    public CommonCar(String name){
        this.NAME = name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getNAME() {
        return this.NAME;
    }

    public int getFINAL_SPEED() {
        return FINAL_SPEED;
    }

    public Boolean getON() {
        return isON;
    }

    @Override
    public void carON() {
        this.isON = true;
        System.out.println("The " + getNAME() + " is ON.");
    }

    @Override
    public void carOFF() {
        this.isON = false;
        System.out.println("The " + getNAME() + " is OFF.");
    }

    @Override
    public void speedUp() {
        if(getON()){
            if(getSpeed() <= 180){
                this.speed += this.deltaAcceleration;
                if(getSpeed() > getFINAL_SPEED()){
                    this.speed = 180;
                }
                System.out.println(getSpeed());
            }
        } else {
            System.out.println("The " + getNAME() + " is off.");
        }
    }

    @Override
    public void brake() {
        if(getON()){
            if(getSpeed() > 0){
                this.speed -= deltaAcceleration;
                if(getSpeed() <= 0){
                    this.speed = 0;
                    System.out.println("The " + getNAME() + " is stoped!");
                }
                System.out.println(getSpeed());
            }
        } else {
            System.out.println("The " + getNAME() + " is off.");
        }
    }

    @Override
    public void airIsON() {
        this.deltaAcceleration -= this.deltaAcceleration * 0.12;
        System.out.println("The air was ON...");
    }

    @Override
    public void airIsOFF() {
        this.deltaAcceleration += this.deltaAcceleration * 0.12;
        System.out.println("The air was OFF...");
    }
}
