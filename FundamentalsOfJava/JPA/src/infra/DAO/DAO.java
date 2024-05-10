package infra.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	static private EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("example-jpa");
		} catch(Exception e) {
			System.out.println("Is not possible create a EntityManager Factory on the class!");
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> openTransaction(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> commitTransaction(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> insert(E entity){
		em.persist(entity);
		return this;
	}
	
	public DAO<E> atomicInclusion(E entity){
		return openTransaction().insert(entity).commitTransaction();
	}
	
	public List<E> get10() {
		return this.getList(10, 0);
	}
	
	public List<E> getList(int limit, int desloc){
		if(classe == null) {
			throw new UnsupportedOperationException("The class is null!!!");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(limit);
		query.setFirstResult(desloc);
		return query.getResultList();
	}
	
	public void close() {
		em.close();
	}
}
