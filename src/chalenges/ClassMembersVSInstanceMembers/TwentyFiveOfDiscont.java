/*  A missão desse exercício é exercitar o uso de membros estáticos de uma classe
 *  e os membros que não são estáticos.
 *  Esse programa tem como missão dar 25% de desconto para qualquer produto que o
 *  cliente incluir no mercado.
 * 
 *  Veja o arquivo "TwentyFiveInstancer" para ver como chamamos pelo método que 
 *  mostra o produto só quando o produto já tinha sido instanciado, e como fizemos
 *  para chamar o método showDiscontValue, um método estático da classe...
 */

public class TwentyFiveOfDiscont {
    
    String name;
    double price;

    //EX01
    static final double DISCONT = 0.25;

    TwentyFiveOfDiscont (String nameInitial, double priceInitial){
        name = nameInitial;
        price = priceInitial;
    }
    
    double priceWithDiscont(){
        return price * (1 - DISCONT);
    }
    
    String seeProduct(){
        return String.format("Product: %s\nOriginal Price: R$ %.2f\nPrice with Discont: R$ %.2f", name, price, priceWithDiscont());
    }

    //EX02
    static String showDiscontValue(){
        return "O desconto e de 25%";
    }

    /*  EX01 - Note que colocamos o modificar "static" na frente o tipo e do nome da constante, junto
                com o modificador "final" que define que a variável é uma constante. O "static" faz
                com que o java entenda que se trata de um atributo estático da classe.
    */

    /*  EX02 - Note aqui que temos um método estático, por ser estático não precisamos de instanciar
                um objeto para então poder usar esse método. Nós o chamamos diretamente a partir da
                classe. Métodos assim não devem ser criados sempre, pois esse tipo de método é usado
                só para quando precisamos de alguma utilidade na classe que não envolva as instâncias
                em si.
    */

}
