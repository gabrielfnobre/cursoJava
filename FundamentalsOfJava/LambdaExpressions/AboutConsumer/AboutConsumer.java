package LambdaExpressions.AboutConsumer;

//  SOBRE O CONSUMER:

/*  O Consumer é outra functional interface do pacote Function do java.util, essa functional interface tem como missão
*   representar uma função lambda que recebe um argumento e não retorna nenhum resultado (ou seja, missão é apenas
*   consumir dados para algum propósito, mas não retornar dados nenhum).
*
*   Essa functional interface conta com o método accept(T t)) que retorna a lambda passada para o consumer.
*
*   O Consumer pode ser aplicado em várias situações, algumas delas incluem:
*
*       # Iteração e processamento de coleções:
*           Ao usar o método forEach de coleções, você pode passar um Consumer para realizar uma operação em cada
*           elemento da coleção;
*
*       # Leitura de dados:
*           Ao lidar com fluxos de entrada, você pode usar um Consumer para processar os dados lidos;
*
*       # Atualização de objetos:
*           Se você possui uma lista de objetos e deseja atualizá-los de acordo com algum critério, pode usar um
*           Consumer e fazer essa atualização;
*
*   Usar a interface Consumer torna o código mais modular e flexível, pois você pode passar diferentes comportamentos
*   (expressos como expressões lambda) para o mesmo método, dependendo do que precisa ser feito. Além disso, a
*   programação funcional com interfaces funcionais, como o Consumer, pode facilitar o paralelismo e a concorrência em
*   Java, aproveitando as operações em coleções por meio do uso de Streams e outras abstrações funcionais.
*
*   Vejamos um exemplo prático logo abaixo...
* */


import LambdaExpressions.HighOrderFunctions.Product; //Importamos a classe Product
                                                                                     //para gerar objetos que serão
import java.util.Arrays;                                                             //operados sobre o Consumer...
import java.util.List;
import java.util.function.Consumer;

public class AboutConsumer {
    public static void main(String[] args) {

        Consumer<Product> printProducts = p -> System.out.println("Product: " + p.name + " | Price: R$ " + p.value);
        //Veja que usamos o Consumer junto a uma lambda que imprime nome e valor dos produtos que serão gerados...

        Product p1 = new Product("Notebook", 2980.99);
        Product p2 = new Product("Note Pad", 39.99);
        Product p3 = new Product("pencil", 2.99);
        Product p4 = new Product("eraser", 7.99);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4); //Atribuimos os produtos a uma lista para trabalhar
                                                                   //com eles de forma mais performática...
        System.out.println();
        productList.forEach(p -> printProducts.accept(p)); //Veja que chamamos o Consumer passando cada objeto sobre
        System.out.println();                              //o método accept...

        productList.forEach(printProducts); //Veja que também temos a possibilidade de passar somente o nome do
    }                                       //objeto gerado com Consumer e todos os objetos de produto serão operados
}                                           //sobre a lambda, isso acontece por que internamente o método "forEach" de
                                            //ArrayList já recebe um Consumer e opera sobre cada objeto por debaixo dos
                                            //panos, então, nem mesmo temos a necessidade de gerar uma variável em
                                            //forEach que será operada sobre cada iteração...