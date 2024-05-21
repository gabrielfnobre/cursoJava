package infra.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//	DAO E HIBERNATE

/*	Relembrando o DAO (Data Access Object) é uma estrutura de projeto que presa por tornar o 
	acesso entre objeto e elementos dos bancos de dados mais fácil, interativo e de alta abs-
	tração.
	
	Pensando nisso, criamos uma classe DAO na pasta "infra" do nosso projeto para simular 
	uma estrutura DAO para as entidades do nosso projeto de exemplo, veja a implementação lo-
	go abaixo...
 */

public class DAO<E> { //Note que a classe DAO é genérica, o que torna possível que ela receba qualquer classe que mapeie uma entidade...

	static private EntityManagerFactory emf; //Nossa fábrica de entidades para conexão com nossa persistence-unit é gerada dentro do DAO... 
	private EntityManager em; //Nossa conexão com o banco também...
	private Class<E> classe; //O atributo classe é o responsável por armazenar a classe que estiver sendo utilizada no momento...
	
	//Aqui temos um bloco estático responsável por fazer a inicialização do emf!
	static {
		try {
			emf = Persistence.createEntityManagerFactory("example-jpa");
		} catch(Exception e) {
			System.out.println("Is not possible create a EntityManager Factory on the class!");
		}
	}
	
	public DAO() { 	//Criamos um construtor padrão para o DAO simplesmente pelo fato de que o Hibernate exige que todas as classes operadas sobre
		this(null);	//ele utilizem um construtor padrão...
	}
	
	public DAO(Class<E> classe) {		//E aqui temos o construtor que realmente vamos utilizar para as nossas classes mapeadas em entidades, es-
		this.classe = classe;			//sas classes deverão ser passadas no momento da instancialização do objeto e serão atribuídas ao atributo
		em = emf.createEntityManager();	//classe. Além disso, nosso conexão como o banco será aberta no momento da instancialização.
	}
	
	//NOTE QUE TODOS OS MÉTODOS ABAIXO RETORNAM O OBJETO DAO, ISSO É PROPOSITAL, PARA QUE O OBJETO POSSA SER OPERADO VÁRIAS VEZES E TAMBÉM PARA 
	//QUE POSSAMOS FAZER OPERAÇÃO DE MÉTODOS EM CADEIA...
	
	public DAO<E> openTransaction(){	//Veja como a abstração fica em mais alto nível com um método para abrir uma transação!
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> commitTransaction(){	//Veja como a abstração fica em mais alto nível com um método para commitar uma transação!
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> insert(E entity){	//Veja como a abstração fica em mais alto nível com um método para inserir dados na tabela!
		em.persist(entity);
		return this;
	}
	
	public E findById(Long id){
		return em.find(classe, id);
	}
	
	public DAO<E> atomicInclusion(E entity){ 						 //Criamos também um método para inserção atômica, ou seja, para fazer todo o
		return openTransaction().insert(entity).commitTransaction(); //processo de abrir transação, inserção e commit!
	}
	
	public List<E> get10orMore(Integer... args) {	//Temos um método para pegar 10 ocorrências ou mais, dependendo do que passarmos como parâme-
		int value = args.length > 0 ? args[0] : 10;	//tro na assinatura do método. Se não passarmos nada ele pega 10, se passarmos algo ele vai
		return this.getList(value, 0);				//pegar o número de ocorrências que passarmos...
	}
	
	public List<E> getList(int limit, int desloc){								//O método getList pega uma lista a partir de parâmetros pré-defi-
		if(classe == null) {													//nidos para número de ocorrências desejado e número de desloca-
			throw new UnsupportedOperationException("The class is null!!!");	//mento. Ou seja, podemos escolher pegar um determinado número 
		}																		//de ocorrências a partir de um dado valor.
		
		String jpql = "select e from " + classe.getName() + " e";  	//Ele usa jpql para fazer isso, onde passamos o comando para pegar uma List do
		TypedQuery<E> query = em.createQuery(jpql, classe);			//nosso banco e trazer uma nova list passando os valores de limit e desloc...
		query.setMaxResults(limit);
		query.setFirstResult(desloc);
		return query.getResultList();
	}
	
	public void close() {	//Temos também um método void para fechar a conexão com o banco.
		em.close();
	}
	
	public EntityManager setEm() {
		return em;
	}
	
	//Abaixo temos um método para usar nossas Named Queries, note que esse método retorna uma lista
	//genérica de qualquer coisa e recebe como parâmetro o nome de uma Named Query e um array de 
	//parâmetros. Por através da Named Query podemos gerar uma consulta que será capturada por um
	//TypedQuery e poderemos iterar sobre esse objeto passando os parâmetros que desejamos buscar 
	//no array "params" usando o método "setParameter" dentro do laço for que itera de 2 em 2 para
	//buscar os parâmetros corretamente. E no final todos os valores capturados no TypedQuery serão
	//armazenados na List por através do método "getResultList"...
	public List<E> queryNamed(String queryNamed, Object... params){
		TypedQuery<E> query = em.createNamedQuery(queryNamed, classe);
		for (int i = 0; i < params.length; i+=2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}
	
	//Abaixo temos um método que faz uma busca simples, executando somente o comando que tiver si-
	//do passado na NamedQuery, sem capturar nenhum parâmetro adicional na consulta e retornando 
	//a lista de elementos capturados na consulta...
	public List<E> queryNamedNoParams(String queryNamed){
		TypedQuery<E> query = em.createNamedQuery(queryNamed, classe);
		return query.getResultList();
	}
	
	//Abaixo criamos um método para nos retornar valores agregados a partir de uma busca Named Que-
	//ry ou Named-Native-Query. Para isso, note que utilizamos dentro desse método o método "query-
	//Named" passando como parâmetro o nome da query e dos parâmetros referentes aos valores que 
	//desejamos capturar...
	public E queryAverageMovies(String queryNamed, Object... params) {
		List<E> list = queryNamed(queryNamed, params);
		return list.isEmpty() ? null : list.get(0);
	}
}
