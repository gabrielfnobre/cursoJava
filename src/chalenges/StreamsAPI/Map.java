package chalenges.StreamsAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        /*  Desafio é:
         *   1. Número para string binária... 6 => "110"
         *   2. Inverter a string... "110" => "011"
         *   3. Converter de volta para inteiro... "011" => 3
         * */

        Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
        UnaryOperator<String> toReverse = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> toInteger = n -> Integer.parseInt(n, 2);

        Stream<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        nums.map(toBinary)
                .map(toReverse)
                .map(toInteger)
                .forEach(println);
    }
}
