package chalenges.StreamsAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        Product television = new Product("Television", 5499.99, false);
        Product smartphone = new Product("Smartphone", 899.99, true);
        Product notebook = new Product("Notebook", 3499.99, true);

        Stream<Product> products = Arrays.asList(television, smartphone, notebook).stream();

        Predicate<Product> isBiggerThanOneThousand = p -> p.getPrice() >= 1000.0 ? true : false;
        Predicate<Product> isPortable = p -> p.getPortable();
        Function<Product, String> showResults =
                p -> p.getName() + " has value bigger than 1.000, and is portable.";

        products.filter(isBiggerThanOneThousand)
                .filter(isPortable)
                .map(showResults)
                .forEach(println);
    }
}
