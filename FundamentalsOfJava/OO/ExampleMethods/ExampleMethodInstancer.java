package OO.ExampleMethods;

/* Para mais detalhes sobre como esses métodos foram criados, veja o arquivo "ExampleMethod.java" neste
 * mesmo pacote.
 */

public class ExampleMethodInstancer {
    public static void main(String[] args) {
        
        ExampleMethod p1 = new ExampleMethod();
        var p2 = new ExampleMethod();

        p1.name = "Notebook";
        p1.price = 2160.99;
        p1.discount = 0.25;

        p2.name = "Caneta Preta";
        p2.price = 1.50;
        p2.discount = 0.29;

        System.out.println("Ex01:");
        System.out.printf("Preço do desconto: R$ %.2f\n\n", p1.priceWithDiscount(p1.price, p1.discount));
        
        System.out.println("Ex02:");
        System.out.printf("Preço do desconto: R$ %.2f\n\n", p2.priceWithDiscount());
        
        System.out.println("Ex03:");
        System.out.printf("Preço do desconto Gerente: R$ %.2f", p1.priceWithDiscount(p1.price, 10));
    }

}
