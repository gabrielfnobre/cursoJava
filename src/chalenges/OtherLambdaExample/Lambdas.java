package chalenges.OtherLambdaExample;

@FunctionalInterface
public interface Lambdas {
    public abstract int calculator(int a, int b);

    default public double calcSquare(int value){
        return value * value;
    }

    default public void sayHello(){
        System.out.println("HelloOooh");
    }

    static void aMethodStatic1(){
        System.out.println("I'm a method static one!");
    }

    static void aMethodStatic2(){
        System.out.println("I'm a method static two!");
    }
}
