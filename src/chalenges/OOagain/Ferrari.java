package chalenges.OOagain;

public class Ferrari extends Car{
    final String NAME = "FERRARI";

    void speedUp(){
        if(isON == true){
            if(speed <= 300){
                this.speed += 75;
                if(speed > 300){
                    this.speed = 300;
                }
                System.out.println(this.speed);
            } else {
                System.out.println("The car reached maximum speed!");
            }
        } else {
            System.out.println("The car is off.");
        }
    }

    void brake(){
        if(speed > 0){
            this.speed -= 75;
            if(speed < 0){
                this.speed = 0;
            }
            System.out.println(this.speed);
        } else {
            System.out.println("The car stoped.");
        }
    }

    void showMyName(){
        System.out.println(this.NAME);
    }
}
