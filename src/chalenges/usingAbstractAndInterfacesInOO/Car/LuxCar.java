package chalenges.usingAbstractAndInterfacesInOO.Car;

public class LuxCar extends Car implements Esportive, AirConditioning {
    private Boolean isON = false;
    private int speed = 0;
    private final String NAME;
    private final int FINAL_SPEED = 300;
    private int deltaAcceleration = 60;

    public LuxCar(String name){
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
            if(getSpeed() < getFINAL_SPEED()){
                this.speed += this.deltaAcceleration;
                if(getSpeed() > getFINAL_SPEED()){
                    this.speed = getFINAL_SPEED();
                    System.out.println("The " + this.NAME + " to arrives maximum speed!!!");
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
    public void turboON() {
        this.deltaAcceleration += this.deltaAcceleration * 0.2;
        System.out.println("TURBO IS ON!!!");
    }
    @Override
    public void turboOFF() {
        this.deltaAcceleration -= this.deltaAcceleration * 0.2;
        System.out.println("Turbo is off...");
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
