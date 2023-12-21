package Relationships.OneToMany;

//Veja abaixo como a relação 1:N foi bidimensionada...

public class Item {

    String nameItem;
    Integer quantity;
    Double price;
    Purchase purchase;  //Veja que Item recebe um objeto de purchase, note que esse objeto é
                        //único, gerando uma relação de 1 para vários itens que uma compra
                        //pode ter...

    Item(String nameItem, Integer quantity, Double price){
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.price = price;
    }

}
