package chalenges.FunctionalnterfacesOfJava;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Product product = new Product("Notebook", 3893.99, 0.15);

        Predicate<Product> isExpensive = prod -> (prod.price * (1 - prod.discount)) > 750 ? true : false;

        System.out.println(isExpensive.test(product));

    }
}
