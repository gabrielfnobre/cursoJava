package chalenges.RelationshipsClientPurchase;
import java.util.ArrayList;

//Relacionamento N:1 com Client e 1:N com Item...

public class Purchase {
    Client client;
    static int number = 1;
    int numberPurchase;
    ArrayList<Item> items = new ArrayList<>();

    Purchase(Item item){
        this.items.add(item);
        item.purchase = this;
        numberPurchase = number;
        number++;
    }

}
