package Relationships.OneToMany;

// UM PARA MUITOS (1:N)

/*  O relacionamento de 1 para muitos é um relacionamento onde 1 único objeto de uma classe
*   possuí como dependentes muitos objetos de outra classe.
*
*   Por exemplo, podemos ver isso na relação "Mãe" e "Filhos", uma Mãe pode ter muitos Filhos,
*   mas os Filhos possuírão apenas 1 Mãe, ou seja, uma relação 1:N.
*
*   Abaixo temos a exemplificação disso para uma compra, uma compra pode conter vários itens,
*   mas todos os itens vão pertencer a mesma compra.
*
*   Veja abaixo como operamos isso sobre a simulação de uma compra real, e note os classes
*   "Purchase" e "Item" como geramos a relação bidimensional para que 1 compra referenciasse
*   a vários itens e a um cliente específico, ao mesmo tempo que os vários itens de uma
*   compra referenciaram a mesma compra...
*/

public class PurchaseTest {
    public static void main(String[] args) {

        //Ex01:
        System.out.println("Ex01:");

        Purchase buyer1 = new Purchase("Rafael");
        System.out.println(buyer1.client);
        System.out.println();



        //Ex02:
        System.out.println("Ex02:");

        buyer1.addItem("Pen", 2, 0.50);
        buyer1.addItem("Note", 1, 18.49);
        buyer1.addItem("Bag", 1, 145.99);
        buyer1.showShoppingCart();
        System.out.printf("Total value: %.2f\n", buyer1.showTotalPriceShoppingCart());
        System.out.println();



        //Ex03:
        System.out.println("Ex03:");

        System.out.println(buyer1.items.get(0).purchase.client);

    }

    /*  Ex01 -  Neste exemplo vemos a simples instancialização de um novo cliente para fazer uma
                compra, neste caso amarramos um cliente específico a uma compra específica. Note
                na classe "Purchase" que esse cliente pode ter vários itens dentro da sua compra;
     */

    /*  Ex02 -  Neste exemplo já temos a os items da compra atribuídos a compra em si. Note que
                podemos instanciar vários items ao mesmo cliente. Chamando os métodos
                "showShoppingCart" e "showTotalPriceShoppingCart" podemos ver os itens e o preço
                final do carrinho;
     */

    /*  Ex03 -  Neste exemplo nós comprovamos que a lista está bidimensionalmente amarrada. Note
                que demos a volta completa saindo da classe "Purchase", entrando em uma lista de
                item específica e pegando o nome do cliente que está amarrado na classe "Item";
     */

}
