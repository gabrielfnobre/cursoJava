package model.user_example;

import java.util.List;
import infra.DAO.DAO;

/* O objetivo da classe ProductDAO é facilitar ainda mais a interação entre a nossa classe mapeada em uma entidade e o nosso DAO. Geralmente es-
 * te é o método mais utilizado, por criar uma abstração ainda maior do nosso objeto. Veja como a implementação é feita no exemplo abaixo...
 * */

// Criamos uma classe que extende de DAO já passando a classe Product como parâmetro no generics...
public class ProductDAO extends DAO<Product>{
	
	public ProductDAO() {		//No construtor padrão, nos chamamos o construtor de DAO que recebe a classe como objeto, o que servirá para 
		super(Product.class);	//mostrarmos ao DAO a entidade que desejamos operar...
	}
	
	public ProductDAO(String name, Double price) {  //Criamos também um segundo construtor, caso desejemos criar novas instâncias da classe 
		super(Product.class);						//Product, esse construtor também chama o método construtor de DAO passando a classe co-
		Product product = new Product(name, price);	//mo parâmetro e já instancia um novo objeto em produto fazendo a inserção atomica dele
		this.atomicInclusion(product);				//no banco de dados...
	}
	
	public ProductDAO discount10(Long... args) {														//Outra vantagem de criar o DAO des-
		int desloc = (int) (args.length > 0 ? (args[0] - 1) : 0);										//sa forma é que podemos gerar méto-
		List<Product> prices = this.getList(1, desloc);													//dos específicos para serem chama-
		for(Product price: prices) {																	//dos pelos nossos objetos criados
			System.out.println(String.format(price.getName() + " R$ %.2f", (price.getPrice() * 0.9)));	//a partir de uma instância de Pro-
		}																								//ductDAO...
		return this;
	}
	
}
