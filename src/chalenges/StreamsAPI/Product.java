package chalenges.StreamsAPI;

public class Product {
    private String name;
    private Double price;
    private Boolean portable;

    Product(String name, Double price, Boolean portable){
        this.name = name;
        this.price = price;
        this.portable = portable;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Boolean getPortable() {
        return portable;
    }
}
