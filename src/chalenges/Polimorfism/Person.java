package chalenges.Polimorfism;

public class Person {
    private final String NAME;
    private double weight = 0;

    Person(String name, double weight){
        this.NAME = name;
        setWeight(weight);
    }

    public String getNAME() {
        return NAME;
    }

    public double getWeight() {
        return this.weight;
    }

    private void setWeight(double weight) {
        if(weight > 0){
            this.weight += weight;
        }
    }

    public void eating(Food food){
        setWeight(food.getWeight());
        System.out.println(this.NAME + " is eating the " + food.getName());
    }
}
