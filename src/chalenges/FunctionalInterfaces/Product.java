package chalenges.FunctionalInterfaces;

public class Product {
    private String name;
    private Double price;
    private Double discount;

    public Product(String name, Double price, Integer discount) {
        this.name = name;
        this.price = price;
        this.discount = discount / 100d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
