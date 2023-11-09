package chalenges.FunctionalnterfacesOfJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample { //Receives a value, but don't gives return
    public static void main(String[] args) {

        Product p1 = new Product("Note", 18.45, 0.15);
        Product p2 = new Product("Pen", 10.99, 0.15);
        Product p3 = new Product("Rubber", 5.50, 0.15);
        Product p4 = new Product("Pencil", 7.89, 0.15);
        Product p5 = new Product("Notebook", 3893.99, 0.15);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5);

        Consumer<Product> showMeDiscountPrice = prod -> System.out.println(prod); //Look at the class Product to see the changes in "toString" method...
        productList.forEach(showMeDiscountPrice); //forEach receives for patern a lambda and executes a Consumer...
        System.out.println();

        productList.forEach(System.out::println); //Using Method Reference we can press the toString automatic, because the println...
        System.out.println();

        productList.forEach(prod -> System.out.println(prod.name)); //Using a lambda directly

    }
}
