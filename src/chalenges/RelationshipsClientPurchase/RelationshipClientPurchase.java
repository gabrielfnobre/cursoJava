package chalenges.RelationshipsClientPurchase;

public class RelationshipClientPurchase {
    public static void main(String[] args) {

        Product prod1 = new Product("Pen", 1.50);
        Product prod2 = new Product("Notebook", 18.49);
        Product prod3 = new Product("Bag", 149.99);

        Client c1 = new Client("Rafael");
        c1.purchaseProduct(prod1);
        c1.purchaseProduct(prod1);
        c1.purchaseProduct(prod1);
        c1.purchaseProduct(prod2);
        c1.purchaseProduct(prod2);
        c1.purchaseProduct(prod3);

        c1.showTotalValue();

        System.out.println(prod1.item.numberItem);
        System.out.println(prod1.item.purchase.numberPurchase);
        System.out.println(prod1.item.purchase.client.name);

        Client c2 = new Client("Daniel");
        c2.purchaseProduct(prod1);
        c2.purchaseProduct(prod2);
        c2.purchaseProduct(prod2);
        c2.purchaseProduct(prod3);

        c2.showTotalValue();

        System.out.println(prod3.item.numberItem);
        System.out.println(prod3.item.purchase.numberPurchase);
        System.out.println(prod3.item.purchase.client.name);

    }
}
