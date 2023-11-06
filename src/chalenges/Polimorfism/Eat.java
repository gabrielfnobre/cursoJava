package chalenges.Polimorfism;

public class Eat {
    public static void main(String[] args) {

        Person p1 = new Person("Gabriel", 99.5);
        Food rice = new Rice(0.5);
        Food beans = new Beans(0.5);
        Food iceCream = new IceCream(0.5);

        System.out.println(p1.getWeight());
        p1.eating(rice);
        p1.eating(beans);
        p1.eating(iceCream);
        System.out.println(p1.getWeight());

    }
}
