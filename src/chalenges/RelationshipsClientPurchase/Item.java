package chalenges.RelationshipsClientPurchase;
import java.util.ArrayList;

//Relacionamento N:1 com Purchase e 1:N com Product...

public class Item {
    Purchase purchase;
    ArrayList<Product> products = new ArrayList<>();
    int numberItem;
    int number = 1;

    Item(Product product){
        this.products.add(product);
        product.item = this;
        numberItem = number;
        number++;
    }

}
