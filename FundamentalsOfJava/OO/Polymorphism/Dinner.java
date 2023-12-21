package OO.Polymorphism;

//Esse exemplo é para exemplificar como usamos o polimorfismo dinamico entre as classes Food e os outros alimentos...

public class Dinner {
    public static void main(String[] args) {
        Rice snack1 = new Rice(0.04);
        Beans snack2 = new Beans(0.03);
        IceCream dessert = new IceCream(0.02);
        Person fabio = new Person(98.65);

        System.out.println(fabio.getWeight());

        fabio.eating(snack1.getWeight());
        fabio.eating(snack2.getWeight());
        fabio.eating(dessert.getWeight());
        System.out.printf("%.2f" ,fabio.getWeight());
    }
}
