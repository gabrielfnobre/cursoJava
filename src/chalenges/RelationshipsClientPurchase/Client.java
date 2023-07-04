package chalenges.RelationshipsClientPurchase;

import java.util.ArrayList;

public class Client {
    String name;
    Purchase purchase;
    ArrayList<Purchase> purchases = new ArrayList<>();

    Client(String name){
        this.name = name;
    }

    void purchaseProduct(Product product){
        this.purchase = new Purchase(new Item(product));
        this.purchases.add(purchase);
        purchase.client = this;
    }

    void showTotalValue(){
        Double total = 0.0;
        for(Purchase purchase: purchases){
            for(Item item: purchase.items){
                for(Product product: item.products){
                    total += product.price;
                    System.out.println(product.name + " - R$" + String.format("%.2f", product.price));
                }
            }
        }
        System.out.println("Total: R$" + String.format("%.2f", total));
    }

}
