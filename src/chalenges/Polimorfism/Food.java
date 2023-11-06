package chalenges.Polimorfism;

public class Food {
    private double weight = 0;
    private final String NAME = "Food";

    public Food(double weight){
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0){
            this.weight += weight;
        }
    }

    public String getName() {
        return NAME;
    }
}
