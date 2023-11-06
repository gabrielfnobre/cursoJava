package chalenges.Polimorfism;

public class Rice extends Food {
    private double weight = 0;
    private final String NAME = "RICE";

    public Rice(double weight){
        super(weight);
    }

    public String getName(){
        return this.NAME;
    }
}
