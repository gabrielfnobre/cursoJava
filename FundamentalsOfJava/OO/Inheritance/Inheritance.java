package OO.Inheritance;

// Veja a explicação detalhada começando pelo arquivo Vehicle, depois volte aqui...

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("gol", 240, "hatch");   //Note que a chamada de Car é diferente

        Vehicle moto = new Motocycle("yamaha", 180);    //Note que instanciamos uma moto usando
                                                                    //Usando a superclasse, o que prova
                                                                    //que a herança aconteceu...
        System.out.println(car.getClass().getSimpleName());
        car.mySpeed();
        System.out.println("Car: " + car.name);
        System.out.println("Model: " + car.model);
        car.howManyWheels();
        car.howManyWhells("super");     //Aqui estamos exemplificando que dá para chamar o método
        System.out.println();                   //da superclasse

        System.out.println(moto.getClass().getSimpleName());
        moto.mySpeed();
        moto.howManyWheels();


    }
}
