package FUNDAMENTALS.FundamentalsOfJava.Enums;

//Veja sobre enums no arquivo Colors...
//Esse arquivo serve somente para mostrar como utilizar uma enum na prática...

public class Enums {
    public static void main(String[] args) {
        //Veja como instanciar uma enum...
        Colors red = Colors.RED;
        Colors blue = Colors.BLUE;
        Colors green = Colors.GREEN;

        //Veja como utilizar seus métodos...
        System.out.println("A cor vermelha em RGB é: " + red.getColor());
        System.out.println("A cor verde em RGB é: " + green.getColor());
        System.out.println("A cor azul em RGB é: " + blue.getColor());
    }
}
