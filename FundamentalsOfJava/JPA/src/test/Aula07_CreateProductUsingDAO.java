package test;

import java.util.List;
import infra.DAO.DAO;
import model.user_example.Product;
import model.user_example.ProductDAO;

// CRIANDO PRODUTOS USANDO DAO

/* Usando a estrutura DAO que está em infra.DAO nós podemos criar e inserir objetos no nosso banco de dados
 * de uma forma muito mais intuitiva no mais alto nível de abastração.
 * 
 * Veja como fizemos isso no exemplo abaixo...
 * */

public class Aula07_CreateProductUsingDAO {
	public static void main(String[] args) {
		
		//======================================================================================================================================
		// EXEMPLO MAIS COMPLEXO DE UTILIZAÇÃO DO DAO
		//======================================================================================================================================
		// Veja abaixo que podemos criar um objeto DAO passando para o generics a classe Product, o que faz com que o nosso DAO tenha acesso a 
		// entidade product do bando de dados e possa operar sobre ela, mas note também que precisamos independentemente criar os nossos produtos
		// fora do DAO e depois atribuílos ao DAO para fazer comandos de inserção, busca, deleção e etc...
		
		DAO<Product> dao = new DAO<>(Product.class);
		Product product = new Product("Pen", 1.50);
		
		dao						//Veja como ficou muito mais intuitiva a abertura de transação, inserção, commit e fechamento de conexão...
		.openTransaction()
		.insert(product)
		.commitTransaction()
		.close();
		
		
		
		//======================================================================================================================================
		// EXEMPLO MAIS PRÁTICO DE UTILIZAÇÃO DO DAO
		//======================================================================================================================================
		/* Vá para a classe "ProductDAO" e veja como implementamos o DAO diretamente numa classe que faz a ligação entre a classe Product e o 
		 * nosso DAO.
		 * */
		
		ProductDAO productDAO = new ProductDAO(); //Criamos um objeto da classe ligadora...
		productDAO.discount10();				  //usamos um método dessa classe que nos devolve o primeiro elemento com desconto de 10% caso
												  //não tenhamos passado nenhum número como ID...
		
		ProductDAO noteBook = new ProductDAO("Note Book", 2954.99);	//Criamos também um método construtor que recebe parâmetros para gerar ins-
		noteBook.discount10(2L);									//tâncias de Product, podemos até encontrar o valor do produto com disconto
																	//de 10% através de um método que criamos dentro de ProductDAO, onde se pas-
																	//sarmos o número de ID teremos o preço retornado com desconto...
		
		List<Product> products = productDAO.get10orMore();	//Podemos também fazer operações mais complexas sobre os elementos da entidade por
		double total = products.stream()					//através de stream API, usando o método que criamos dentro do DAO, que nos retorna
			.map(n -> n.getPrice())							//as primeiras 10 ocorrências e stream API, conseguimos fazer uma soma do total dos
			.reduce(0.0, (t, p) -> t + p);					//preços de todos os produtos da entidade...
		System.out.println(String.format("Total values (no discount): R$ %,.2f", total));
		
	}
}
