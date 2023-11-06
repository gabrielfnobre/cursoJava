package chalenges.Polimorfism;

public class IceCream extends Food {
    private double weight = 0;
    private final String NAME = "ICE CREAM";

    public IceCream(double weight){
        super(weight);
    }

    public String getName(){
        return this.NAME;
    }
}
