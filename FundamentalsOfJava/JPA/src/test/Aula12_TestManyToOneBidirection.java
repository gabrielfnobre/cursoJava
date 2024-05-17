package test;

import infra.DAO.DAO;
import model.user_example.OrderBidirection;
import model.user_example.OrderItemBidirection;
import model.user_example.Product;

// MUITOS PARA UM BIDIRECIONAL

/* Nesta aula aprendemos a fazer um N:1 bi-direcional. É importante ressaltar que geramos uma relação
 * bi-direcional apenas no contexto do O.O, visto que no contexto do Banco de Dados não é prático 
 * usar relacões bi-direcionais devido a inconsistências e conflitos que poderiam haver no banco de 
 * dados.
 * 
 * Veja abaixo no alto nível como a implementação funciona de forma bidirecional, e depois, veja a im-
 * plementação nas classes "OrderItemBidirection" e "OrderBidirection"...
 * */

public class Aula12_TestManyToOneBidirection {
	public static void main(String[] args) {
		
		//Geramos um DAO genérico para fazer as inserções...
		DAO<Object> dao = new DAO<>();
		
		//Criamos 2 produtos novos: "computer" e "mouse"...
		Product computer = new Product("computer", 3599.99);
		Product mouse = new Product("mouse", 45.99);
		
		//Criamos um pedido de compra...
		OrderBidirection order = new OrderBidirection();
		
		//Criamos 2 itens de pedido para essa compra...
		OrderItemBidirection orderItem1 = new OrderItemBidirection(order, computer, 1);
		OrderItemBidirection orderItem2 = new OrderItemBidirection(order, mouse, 1);
		
		//Fizemos nossa transação, inserindo os produtos, o pedido e os itens de pedido...
		dao
			.openTransaction()
			.insert(computer)
			.insert(mouse)
			.insert(order)
			.insert(orderItem1)
			.insert(orderItem2)
			.commitTransaction()
			.close();
		
		//Geramos um DAO para o pedido, para mostrar que ele capiturou os itens de pedido...
		DAO<OrderBidirection> orderDao = new DAO<>(OrderBidirection.class);
		
		//Atrás do pedido é possível encontrar todos itens de pedido dentro dele dentro do contexto do
		//mundo O.O...
		for(OrderItemBidirection orderItem: orderDao.findById(1L).getItems()) {			
			System.out.println(orderItem.getProduct().getName());
		}
		
		//Fechada a conexão com o DAO que representa o pedido...
		orderDao.close();
		
		//Veja agora como a implementação foi feita nas classes "OrderItemBidirection" e "OrderItem"...
		
	}
}
