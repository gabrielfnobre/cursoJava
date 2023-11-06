package chalenges.Polimorfism;

public class Beans extends Food {
    private double weight = 0;
    private final String NAME = "BEANS";

    public Beans(double weight){
        super(weight);
    }

    public String getName(){
        return this.NAME;
    }
}
