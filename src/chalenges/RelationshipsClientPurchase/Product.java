package chalenges.RelationshipsClientPurchase;

public class Product {
    String name;
    Double price;
    Item item;
    int numberProduct;
    static int number = 1;

    Product(String name, Double price){
        this.name = name;
        this.price = price;
        this.numberProduct = number;
        number++;
    }

}
