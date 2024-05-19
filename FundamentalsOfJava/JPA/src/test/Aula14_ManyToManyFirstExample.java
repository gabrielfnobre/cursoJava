package test;

import infra.DAO.DAO;
import model.user_example.Nephew;
import model.user_example.Uncle;

// PRIMEIRO EXEMPLO DE MUITOS PARA MUITOS

/* Nesta aula vimos uma implementação bem básica de uma relação N:M entre tios e sobrinhos, 
 * note como essa relação é mapeada por através do paradigma O.O e sua relação com o mundo
 * BD. Veja como criamos essa relação nas classes "Uncle" e "Nephew"...
 * */

public class Aula14_ManyToManyFirstExample {
	public static void main(String[] args) {
		
		//Primeiro criamos 2 tios, atribuíndo nomes a eles...
		Uncle gabriel = new Uncle("Gabriel");
		Uncle junior = new Uncle("Júnior");
		
		//Depois criamos 2 sobrinhas, atribuindo nomes a elas...
		Nephew helena = new Nephew("Helena");
		Nephew mariana = new Nephew("Mariana");
		
		//Dentro da classe Uncle temos um array de Nephews, e atribuímos sobrinhas para os 
		//tios, como a relação é bi-direcional, também temos que atribuir tios para as so-
		//brinhas...
		gabriel.getNephews().add(helena);
		helena.getUncles().add(gabriel);
		
		junior.getNephews().add(helena);
		helena.getUncles().add(junior);
		
		gabriel.getNephews().add(mariana);
		mariana.getUncles().add(gabriel);
		
		junior.getNephews().add(mariana);
		mariana.getUncles().add(junior);
		
		//Geramos um DAO genérico para fazer as inserções no banco de dados...
		DAO<Object> dao = new DAO<>();
		
		//Abrimos e fechamos a trasação que faz as inserções...
		dao
			.openTransaction()
			.insert(gabriel)
			.insert(junior)
			.insert(helena)
			.insert(mariana)
			.commitTransaction()
			.close();
		
		//Veja agora como essa implementação foi gerada nas classes "Uncle" e "Nephew"...
		
	}
}
