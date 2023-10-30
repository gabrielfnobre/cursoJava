package chalenges.Composition;

import java.util.ArrayList;

public class Buy {

    final Client client;
    ArrayList<Item> listItems = new ArrayList<>();
    static int id = 0;
    int idbuy;

    Buy(Client client){
        id++;
        this.client = client;
        this.idbuy = id;
        System.out.println("Buy ID: " + id);
    }

    void addItem(Item item){
        item.buy = this;
        listItems.add(item);
    }

    double totalCustToBuy(){
        double total = 0;
        for (Item item: listItems){
            total += item.product.price * item.quantidad;
        }
        return total;
    }

}
