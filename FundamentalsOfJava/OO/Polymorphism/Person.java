package OO.Polymorphism;

public class Person {
    private Double weight = 0d;

    Person(Double weight){
        setWeight(weight);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    void eating(Double weight){
        setWeight(getWeight() + weight);
    }

}
