package chalenges.OOagain;

public class Car {

    int speed = 0;
    Boolean isON = false;
    final String NAME = "CAR";

    void carOn(){
        this.isON = true;
        System.out.println("The " + this.NAME + " is on!");
    }

    void carOff(){
        this.isON = false;
        System.out.println("The " + this.NAME + " is off!");
    }

    void speedUp(){
        if(isON == true){
            if(speed <= 180){
                this.speed += 40;
                if(speed > 180){
                    this.speed = 180;
                }
                System.out.println(this.speed);
            } else {
                System.out.println("The " + this.NAME + " reached maximum speed!");
            }
        } else {
            System.out.println("The " + this.NAME + " is off.");
        }
    }

    void brake(){
        if(speed > 0){
            this.speed -= 40;
            if(speed < 0){
                this.speed = 0;
            }
            System.out.println(this.speed);
        } else {
            System.out.println("The " + this.NAME + " stoped.");
        }
    }

    void showMyName(){
        System.out.println(this.NAME);
    }

}
