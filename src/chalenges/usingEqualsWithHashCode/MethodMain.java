package chalenges.usingEqualsWithHashCode;

public class MethodMain {
    public static void main(String[] args) {

        MyObject user1 = new MyObject("Peter", "peter@ptmail.com");
        MyObject user2 = new MyObject("Peter", "peter@ptmail.com");
        MyObject user3 = new MyObject("Melinda", "melinda@ptmail.com");

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));

    }
}
