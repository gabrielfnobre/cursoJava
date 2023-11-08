package chalenges.MethodReference;

import FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.MethodReference.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceExample {

    MethodReferenceExample(){
        System.out.println("A new instance was created!");
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Mia", "Bia", "Lia");

        names.forEach(System.out::println); //using with a method of java.lang
        System.out.println();

        names.forEach(MethodReferenceExample::myMethod); //using with myself method
        System.out.println();

        Supplier<MethodReferenceExample> mre = MethodReferenceExample::new;
        mre.get(); //get() is used to call the new instance

    }

    public static void myMethod(String a){
        System.out.println(a);
    }
}
