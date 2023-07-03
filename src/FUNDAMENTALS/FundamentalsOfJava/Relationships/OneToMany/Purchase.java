package FUNDAMENTALS.FundamentalsOfJava.Relationships.OneToMany;

import java.util.ArrayList;

//Veja abaixo como a relação "1:N" é feita...

public class Purchase {

    String client;
    ArrayList<Item> items = new ArrayList<>();  //Note que criamos uma lista para colocar os
                                                //diversos items que uma compra pode ter.
                                                //A nossa lista está recebendo objetos da
                                                //classe "Items"...

    Purchase(String client){
        this.client = client;
    }

    void addItem(String nameItem, Integer quantity, Double price){  //Veja que temos um método
        this.addItem(new Item(nameItem, quantity, price));          //específico para gerar
    }                                                               //novas instâncias de Item,
                                                                    //esse método faz um
                                                                    //override sobre o método
                                                                    //addItem logo abaixo...

    void addItem(Item item){    //Esse método também pode instanciar itens sobre a nossa compra
        items.add(item);        // mas note que ele recebe diretamente um item a ser instanciado
        item.purchase = this;   // e ao mesmo tempo amarra os itens sobre um cliente em especial...
    }

    void showShoppingCart(){
        for(Item item: items){
            System.out.printf("Product: %s | quant.: %d | price: %.2f\n", item.nameItem, item.quantity, item.price);
        }
    }
    Double showTotalPriceShoppingCart(){
        Double total = 0.0;
        for(Item item: items){
            total += item.quantity * item.price;
        }
        return total;
    }

}
