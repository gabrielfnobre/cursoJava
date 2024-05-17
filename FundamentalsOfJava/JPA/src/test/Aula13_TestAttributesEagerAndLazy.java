package test;

import java.util.List;

import infra.DAO.DAO;
import model.user_example.OrderBidirection;
import model.user_example.OrderItemBidirection;

// EAGER VS LAZY

/* Quando temos relacionamentos entre as classes que representam as nossas entidades do banco de dados temos o conceitos
 * de busca de dados EAGER e LAZY. Veja o conceito:
 * 
 * 		* EAGER:
 * 			No modo EAGER (apressado) assim que fazemos uma busca por item do banco de dados e esse item possuí itens
 * 			relacionados a ele, de outra entidade, o JPA faz uma busca geral, chamando o item em si e também os valores 
 * 			do item relacionado. Por exemplo: quero buscar um pedido, mas quero que os valores dos itens de pedido ve-
 * 			nham juntos todos em uma única pesquisa, isso é possível por através do método EAGUER.
 * 
 * 		* LAZY:
 * 			No modo LAZY (preguiçoso) a busca é feita apenas para o item que fizemos a busca, se ele tiver itens rela-
 * 			cionados a ele, esses itens não serão chamados a menos que façamos uma busca explícita por eles.
 * 
 * O JPA segue um padrão para fazer buscas do tipo EAGER e do tipo LAZY numa relação, para isso ele usa a seguinte re-
 * gra, se o sufixo da annotation que representa a relação for "ToOne", por padrão a busca será EAGER, agora se a busca
 * tiver sufixo "ToMany" a busca será LAZY. E dá pra entender muito bem isso. Afinal, imagine que fizéssemos uma busca
 * padrão EAGER toda vez que tivéssemos um relação OneToMany, onde teríamos uma lista de objetos de outra classe, ima-
 * gine que essa entidade tivesse milhares de linhas, quanto tempo essa busca iria demorar? Por isso, sabiamente o JPA
 * por padrão não faz buscas EAGER em relacionamentos OneToMany ou ManyToMany.
 * 
 * Mas pode haver casos em que não terermos uma lista enorme de elementos capturados de outra entidade e que talvez 
 * seja mais prático pegar esses elementos de forma rápida. Para isso, podemos fazer a mudança do padrão LAZY para o 
 * EAGER.
 * 
 * Como é o caso do nosso exemplo, onde queremos saber apenas a lista de compras de uma pedido. Veja como fizemos essa
 * implementação abaixo...
 * 
 * */

public class Aula13_TestAttributesEagerAndLazy {
	public static void main(String[] args) {
		
		//Geramos um DAO passando a classe dos pedidos...
		DAO<OrderBidirection> orderDao = new DAO<>(OrderBidirection.class);
		
		//A partir do pedido, conseguimos capturar uma lista com os objetos da lista de itens, mas essa lista não traz
		//detalhes necessários que precisamos como: nome do produto, preço, quantidade, para pegar esses detalhes te-
		//ríamos que acessar os métodos getters e setters dos produtos adquiridos. Mas...
		List<OrderItemBidirection> items = orderDao.findById(1L).getItems();
		//... note que fechamos a conexão! E agora? Pode ficar tranquilo! Se você olhar a classe "OrderBidirection" 
		//verá que mudamos o atributo fetch para "EAGER", ou seja, todos os valores que vieram da classe OrderItemBi-
		//direction já foram trazidos pelo JPA...
		orderDao.close();
		
		//Note que podemos fazer a pesquisa dos itens sem nos preocupar com o fechamento da conexão!
		for(OrderItemBidirection item: items) {
			System.out.println(item.getId() + " - " + item.getProduct().getName() + " - R$ " + item.getPrice() + " - " +  item.getQuantity() + "un.");
		}
		
	}
}
