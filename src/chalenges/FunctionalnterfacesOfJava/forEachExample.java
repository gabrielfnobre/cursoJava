package chalenges.FunctionalnterfacesOfJava;

import java.util.Arrays;
import java.util.List;

public class forEachExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ana", "Bia", "Lia");

        System.out.println("using forEach with lambda...");
        list.forEach(name -> System.out.println(name));

        System.out.println("\nusing forEach with lambda and Method Reference...");
        list.forEach(System.out::println);

        System.out.println("\nusing forEach with lambda and Method Reference in myself method...");
        list.forEach(forEachExample::myPrint);

    }

    public static void myPrint(String name){
        System.out.println("Hi! My name is " + name);
    }
}
