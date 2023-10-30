package chalenges.Composition;

import java.util.ArrayList;

public class Client {
    String name;
    Buy buy;
    final ArrayList<Buy> buyList = new ArrayList<>();

    Client(String name){
        this.name = name;
    }

    void makeANewBuy(){
        this.buy = new Buy(this);
        buyList.add(buy);
    }

    double totalCust(){
        double total = 0;
        for (Buy buyItem: buyList){
            total += buyItem.totalCustToBuy();
        }
        return total;
    }

}
