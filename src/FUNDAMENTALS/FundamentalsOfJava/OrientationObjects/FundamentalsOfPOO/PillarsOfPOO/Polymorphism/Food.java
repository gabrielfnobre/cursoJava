package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.Polymorphism;

public class Food {
    protected Double weight = 0d;

    Food(Double weight){
        setWeight(weight);
    }

    protected Double getWeight() {
        return weight;
    }

    protected void setWeight(Double weight) {
        this.weight = weight;
    }
}
