package FUNDAMENTALS.FundamentalsOfJava.Hashcodes;

//Veja explicação do HASHCODE no documento Hashcode.txt

public class Hashcodes {
    public static void main(String[] args) {

        User user1 = new User(
                "Carlos Augusto",
                "carlosaugusto@email.com");

        User user1Copy = new User(
                "Carlos Augusto",
                "carlosaugusto@email.com");

        User user2 = new User(
                "Paulo Gustavo",
                "paulogustavo@email.com");

        //Ex01:
        System.out.println("Ex01:");
        System.out.println(user1 == user1);
        System.out.println(user1 == user1Copy);
        System.out.println();


        //Ex02:
        System.out.println("Ex02:");
        System.out.println(user1.equals(user1Copy));
        System.out.println(user1.equals(user2));
        System.out.println(user1Copy.equals(user1));

    }
}
