package chalenges.visibilyLevels.Car;

public class Car {
    private final String NAME = "CAR";
    private int finalSpeed;
    private int deltaAccelerate;
    private int speed = 0;
    private Boolean isOn = false;

    public int getDeltaAccelerate() {
        return deltaAccelerate;
    }

    protected void setDeltaAccelerate(int deltaAccelerate) {
        this.deltaAccelerate = deltaAccelerate;
    }

    public int getFinalSpeed() {
        return finalSpeed;
    }

    protected void setFinalSpeed(int finalSpeed) {
        this.finalSpeed = finalSpeed;
    }

    public Boolean getOn() {
        return isOn;
    }

    protected void setOn(Boolean on) {
        isOn = on;
    }

    public String getNAME() {
        return NAME;
    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(int finalSpeed, int deltaAccelerate){
        setFinalSpeed(finalSpeed);
        setDeltaAccelerate(deltaAccelerate);
    }

    public void carOn(){
        setOn(true);
        System.out.println("The " + getNAME() + " is on!");
    }

    public void carOff(){
        setOn(false);
        System.out.println("The " + getNAME() + " is off!");
    }

    public void speedUp(){
        if(this.isOn){
            if(this.speed < this.finalSpeed){
                this.speed += deltaAccelerate;
                if(this.speed >= finalSpeed){
                    this.speed = finalSpeed;
                    System.out.println(speed);
                }
                System.out.println(speed);
            } else {
                System.out.println("The " + this.NAME + " reaches to maximum speed!");
            }
        } else {
            System.out.println("The " + this.NAME + " is off.");
        }
    }

    public void brake(){
        if(this.isOn){
            if(this.speed > 0){
                this.speed -= deltaAccelerate;
                if(this.speed < 0){
                    this.speed = 0;
                    System.out.println(this.speed);
                }
                System.out.println(this.speed);
            } else {
                System.out.println("The " + this.NAME + " is stopped!");
            }
        } else {
            System.out.println("The " + this.NAME + " is off.");
        }
    }

    public void showMyName(){
        System.out.println("\n" + getNAME());
    }
}
