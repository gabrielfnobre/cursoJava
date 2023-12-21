package OO.Composition;
// Veja uma explicação detalhada sobre o que é um Composição no arquivo "Composition.txt"...

public class Composition {

    public static void main(String[] args) {

        //Ex01:
        System.out.println("\nEx01:");
        Car car1 = new Car("Toyota");

        System.out.println("O carro está ligado? - " + car1.isOn());
        System.out.println();


        //Ex02:
        System.out.println("Ex02:");

        car1.turnOn();
        System.out.println("O carro está ligado? - " + car1.isOn());
        System.out.println();


        //Ex03:
        System.out.println("Ex03:");

        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        car1.acelerate();
        System.out.println("RPM: " + car1.speed());
        System.out.println();


        //Ex04:
        System.out.println("Ex04:");

        car1.brake();
        System.out.println("RPM: " + car1.speed());
        car1.brake();
        System.out.println("RPM: " + car1.speed());
        car1.brake();
        System.out.println("RPM: " + car1.speed());
        car1.brake();
        System.out.println("RPM: " + car1.speed());
        car1.brake();
        System.out.println("RPM: " + car1.speed());
        System.out.println();


        //Ex05:
        System.out.println("Ex05:");

        car1.turnOff();
        car1.acelerate();
        System.out.println();


        //Ex06:
        System.out.println("Ex06:");
        System.out.println(car1.MOTOR.CAR.MOTOR.CAR.MOTOR.CAR.MOTOR.CAR.NAME);

    }

    /*  Ex01 -  Neste exemplo instanciamos um carro, note que ao instanciar carro nós geramos
                automaticamente uma depedência entre as classes "Car" e "Motor", tudo que
                pertencer a motor será acessível agora à partir de Car.
                Note também que chamamos pelo método "isOn" para verificar se o carro está
                ligado, como não ligamos o carro o resultado é "false";
    */

    /*  Ex02 -  Neste exemplo ligamos o carro usando o método "turnOn" e em seguida
                verificamos novamente se o carro estava ligado, o resultado foi "true";
    */

    /*  Ex03 -  Aqui já testamos acelerar o carro, note que a medida que vamos acelerando o
                carro os RPMs vão aumentando até chegar no limite. Quando chega no limite o
                o método "acelerate" nos retorna uma mensagem avisando que o limite já foi
                excedido;
    */

    /*  Ex04 -  Neste exemplo já ocorre algo diferente, nós usamos a função "brake" para frear
                o carro, note que ao apertar o freio várias vezes o RPM do carro vai baixando
                até chegar no RPM mínimo de 3000;
    */

    /*  Ex05 -  Por fim, neste exemplo, nós desligamos o carro usando a função "turnOff". Note
                que ao tentar acelerar o carro não conseguimos por que o carro está desligado;
    */

    /*  Ex06 -  Aqui temos a comprovação do relacionamento 1 para 1. Veja que podemos chamar
                ambas as classes Motor e Car, que uma vai chamar a outra, e no final quando
                chamamos pela constante "NAME", ela vai imprimir justamente o nome do carro
                referente áquele objeto;
    */

}
