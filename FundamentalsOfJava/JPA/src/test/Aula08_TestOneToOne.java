package test;

import infra.DAO.DAO;
import model.user_example.Clients;
import model.user_example.Seat;

// TESTE COM O RELACIONAMENTO 1:1

/* Nesta aula fizemos o teste entre os relacionamentos 1:1 (para entender melhor como os relacionamentos
 * são mapeados entre o paradigma OO e o BD veja o arquivo JPA relationships.txt que está na pasta cur-
 * soJava.FundamentalsOfJava.JPA.src.Fundamentals).
 * 
 * Veja as classes "Clients" e "Seat" para ver como o relacionamento 1:1 foi mapeado entre essas classes.
 * */

public class Aula08_TestOneToOne {
	public static void main(String[] args) {
		
		//Primeiro criamos um objeto Seat, para representar um acento que o cliente irá comprar para as-
		//sistir a um jogo...
		Seat seatB12 = new Seat("B12");
		
		//Também criamos um client, passando um assento para ele...
		Clients client01 = new Clients("João", seatB12);
		
		//Geramos o nosso DAO passando um elemento genérico para ele, para que ele possa operar qualquer
		//tipo de objeto...
		DAO<Object> dao = new DAO<>();
		
		//Temos aqui nossa inserção tanto do assento quanto do cliente feita em apenas 1 transação aber-
		//ta. Note que fizemos na ordem correta, onde primeiro nós geramos o acento e depois o cliente.
		dao
			.openTransaction()
			.insert(seatB12)
			.insert(client01)
			.commitTransaction();
		
		//Criamos um assento para gerar uma segunda cliente...
		Seat seatC19 = new Seat("C19");
		Clients client02 = new Clients("Margarida", seatC19);
		//Note que invertemos a ordem, primeiro criamos um cliente e depois um assento, mas ainda assim 
		//o código compila, pois como estamos dentro de uma única transação o JPA é experto o suficien-
		//te para fazer apenas um update em cliente, apenas acrescentando um assento depois de criá-lo.
		dao
			.openTransaction()
			.insert(client02)
			.insert(seatC19)
			.commitTransaction();
		
		//Note que ao tentar atribuir um cliente a um assento que já é de outra pessoa, o JPA não dá 
		//nenhuma mensagem de erro, mas também, não faz nada. Pois o acento já é de outra pessoa.
		dao
			.openTransaction()
			.insert(client01)
			.insert(seatC19)
			.commitTransaction();
		
	}
}
