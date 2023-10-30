package chalenges.Composition;

public class ClientTest {
    public static void main(String[] args) {
        Product p1 = new Product("book", 25.9);
        Product p3 = new Product("pen", 3.59);

        Client c1 = new Client("Gabriel");

        c1.makeANewBuy();
        c1.buy.addItem(new Item(p1, 1));
        c1.buy.addItem(new Item(p3, 10));
        System.out.println(c1.buy.listItems.get(0).showTotalCust());
        System.out.println(c1.buy.listItems.get(1).showTotalCust());
        System.out.println(c1.buy.totalCustToBuy());

        c1.makeANewBuy();
        c1.buy.addItem(new Item(p1, 2));
        c1.buy.addItem(new Item(p3, 5));

        c1.buy.listItems.get(0).showItem();
        System.out.println(c1.buy.listItems.get(0).showTotalCust());
        System.out.println(c1.buy.listItems.get(1).showTotalCust());
        System.out.println(c1.buy.totalCustToBuy());
        System.out.println(c1.totalCust());

    }
}
