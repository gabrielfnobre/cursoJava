package chalenges.FunctionalnterfacesOfJava;

public class Product {
    public String name;
    public double price;
    public double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString(){
        return this.name + " has discount price of: R$ " + String.format("%.2f", this.price);
    }
}
