package OO.ExampleMethods;

//  EXEMPLO DE MÉTODO:

/*  Perceba no exemplo abaixo que criamos um método seguindo todas as regras de criação de
    métodos alistadas no arquivo Methods.txt...

    Navegue até o arquivo "ExampleMethodInstancer.java" para ver como usamos esse método na
    classe instancializadora...
 */

public class ExampleMethod {

    String name;
    double price;
    double discount;

    //Ex01
    double priceWithDiscount(double price, double discount){
        double discountCalculated = price * (1 - discount);
        return discountCalculated;
    }
    
    //Ex02
    double priceWithDiscount(double price, int discountGerent){
        double discountCalculated = price * (1 - (discount / 100));
        System.out.printf("Desconto do Gerente: %d por cento\n", discountGerent);
        return discountCalculated;
    }
    
    //Ex03
    double priceWithDiscount(){
        double discountCalculated = price * (1 - discount);
        return discountCalculated;
    }

    /*  Ex01 - Aqui temos a criação de um método simples com 2 parâmetros de entrada e 1 de saída;
     */
    
    /*  Ex02 - Aqui temos o exemplo de que é possível no java criar 2 métodos com o mesmo nome, desde que a assinatura
                do método seja diferente ou em quantidade de parâmetros ou nos tipos de dados que irão atuar na 
                entrada do método;
     */

    /*  Ex03 - E aqui temos um exemplo excelente de como devemos aproveitar o paradigma da Orientação a Objeto para 
                fazer os nossos métodos. Note que como já possuímos os valores do objeto inclusos nos atributos da
                classe, podemos acessá-los diretamente dentro do nosso método sem a necessidade de capturá-los 
                novamente;
     */
    
}