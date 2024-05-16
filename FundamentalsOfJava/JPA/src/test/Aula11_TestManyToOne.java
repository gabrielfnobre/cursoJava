package test;

import infra.DAO.DAO;
import model.user_example.OrderItem;
import model.user_example.Orders;
import model.user_example.Product;

// MUITOS PARA UM

/* Nessa aula fizemos a representação do relacionamento N:1, representando a relação que existe 
 * entre um pedido de compra, os itens de um pedido e os produtos que são comprados.
 * 
 * No nosso banco de exemplo, nossa classe principal seria a classe dos itens de pedido, por 
 * através dessa classe conseguimos saber qual foi o número do pedido e quais produtos foram com-
 * prados.
 * 
 * Veja abaixo como ficou a abstração dessas operações e depois veja nas classes Product, Orders 
 * e OrderItem como a implementação foi feita no paradigma O.O...
 * */

public class Aula11_TestManyToOne {
	public static void main(String[] args) {
		
		//Chamamos o nosso DAO de forma genérica para que ele aceite qualquer tipo de classe...
		DAO<Object> dao = new DAO<>();

		//Criamos 1 único objeto dos pedidos, para representar que 1 pedido pode referenciar a
		//diversos itens de pedido...
		Orders order = new Orders();
		
		//Criamos 2 produtos novos...
		Product refrigerator = new Product("refrigerator", 4525.99);
		Product microwave = new Product("microwave", 400.99);
		
		//E criamos 2 itens de pedido diferentes, que referenciam a 1 única ordem de pedido e
		//a 1 único tipo de produto...
		OrderItem orderItem = new OrderItem(order, refrigerator, 1);
		OrderItem orderItem2 = new OrderItem(order, microwave, 1);
		
		//Abaixo fizemos a inserção dos nossos produtos, do pedido e incluímos dois itens de
		//pedido passando os produtos, o pedido ao qual pertencem e a quantidade de produtos...
		dao
			.openTransaction()
			.insert(refrigerator)
			.insert(microwave)
			.insert(order)
			.insert(orderItem)
			.insert(orderItem2)
			.commitTransaction()
			.close();
		
		//Vá até o banco de dados e veja que as tabelas orders e order_item foram criadas e
		//que por através de order_item você poderá ver quais produtos foram pedidos para um
		//determinado número de pedido...
	}
}
