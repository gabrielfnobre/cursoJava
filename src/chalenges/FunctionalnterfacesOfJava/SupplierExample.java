package chalenges.FunctionalnterfacesOfJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        //Supplier<R>
        Supplier<List<String>> genericListNames = ()-> Arrays.asList("Ana", "Lia", "Bia");

        System.out.println(genericListNames.get());

    }
}
