package chalenges.Composition;

public class Item {
    int quantidad;
    final Product product;
    Buy buy;

    Item(Product product, int quantidad){
        this.product = product;
        this.quantidad = quantidad;
    }

    void showItem(){
        System.out.println(this.product.name + " - " + this.quantidad + "unidad(s)");
    }

    double showTotalCust(){
        double total = this.product.price * this.quantidad;
        return total;
    }

}
