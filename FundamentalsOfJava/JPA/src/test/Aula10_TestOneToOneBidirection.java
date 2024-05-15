package test;

import infra.DAO.DAO;
import model.user_example.ClientBidirection;
import model.user_example.SeatBidirection;

// UM POR UM BI-DIRECIONAL

/* Nessa aula aprendemos como fazer um relacionamentos 1:1 bi-direcional. É importante lembrar que no
 * mundo do Banco de Dados, relacionamentos bidirecionais não podem existir, pois isso poderia gerar
 * muitos conflitos e inconsistências entre o nosso banco de dados. Mas no mundo OO, um objeto pode
 * referenciar outro objeto sem gerar muitos problemas se a integração for bem feita.
 * 
 * Como misturar essa praticidade do mundo OO com a não bi-direcionalidade do mundo do Banco Relacio-
 * nal?
 * 
 * Vejamos o exemplo abaixo e a imprementação feita em ClientBidirection e SeatBidirection...
 * */

public class Aula10_TestOneToOneBidirection {
	public static void main(String[] args) {
		
		//Note que temos um objeto acento e um objeto cliente...
		SeatBidirection seat01 = new SeatBidirection("G7");
		ClientBidirection client01 = new ClientBidirection("Jorge", seat01);
		
		//Criamos também o nosso DAO usando a classe ClientBidirection como base...
		DAO<ClientBidirection> dao = new DAO<>(ClientBidirection.class);
		
		//Fizemos a inclusão atômica de cliente e não precisamos nos preocupar com a inclusão do ace-
		//to, pois ela será feita em cascade...
		dao.atomicInclusion(client01);
		
		//Note que a bi-direcionalidade ocorreu com sucesso, pois a partir do objeto acento consegui-
		//mos o nome do cliente, assim como por através do objeto cliente conseguimos também o seu 
		//nome...
		System.out.println(dao.findById(1L).getSeat().getClient().getName());
		System.out.println(dao.findById(1L).getName());
		
		//Veja agora nas classes ClientBidirection e SeatBidirection como essa implementação foi fei-
		//ta...
	}
}
