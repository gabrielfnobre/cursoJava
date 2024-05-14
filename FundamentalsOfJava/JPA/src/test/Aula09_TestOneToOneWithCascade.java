package test;

import infra.DAO.DAO;
import model.user_example.Clients;
import model.user_example.Seat;

// TESTE COM OPERAÇÃO DE INSERÇÃO EM CASCATA

/* Nesta aula vamos ver como fazer uma operação de inserção em cascata. Mas primeiramente, o que são operações em cascata?
 * Operação em cascata é um método utilizado pelo JPA para fazer com que as ações executadas numa classe sejam propagadas
 * para as demais classes relacionadas com ela. Em palavras simples, todas as ações de uma determinada classe que afetem
 * a estrutura de outra, são facilmente realizadas por através da operação em cascata.
 * 
 * Esse tipo de operação é especialmente feita em relacionamentos, onde se um valor de um relacionamento "x" muda, um o 
 * valor do relacionamento "y" que é dependente do valor "x" também deve mudar. Vamos ver um exemplo disso no exemplo abai-
 * xo, onde vamos tentar inserir um cliente e um assento para ele, mas vamos chamar o método "atomicInclusion" que não faz
 * a inserção do assento novo no banco, pois ele recebe como parâmetro apenas o nome da pessoa. Vamos criar uma operação 
 * em cascata que irá primeiro adicionar o assento ao banco, e depois fazer a inserção da pessoa já no banco novo.
 * Veja...
 * */

public class Aula09_TestOneToOneWithCascade {
	public static void main(String[] args) {
		
		//Criamos o assento e a pessoa, passando o assento como objeto para a instância do cliente...
		Seat seat = new Seat("G7");
		Clients maria = new Clients("Maria", seat);
		
		//Declaramos um DAO, para fazer as operações que o o DAO utiliza...
		DAO<Object> dao = new DAO<>();
		
		//Aqui temos o código que poderia dar bug, estamos usando o método "atomicInclusion", que incluí somente um elemen-
		//to do banco, que no caso é o cliente, sem inserir o assento antes.
		//Mas note que não gera erro, na verdade o cliente é incluso e o assento também, isso acontece por que declaramos o
		//relacionamento como "cascade = cascadeType.PERSIST", o que faz com que a nossa aplicação ao encontrar o atributo
		//que faz o relacionamento e ver que o objeto ainda não existe, a aplicação automáticamente faz a inserção do obje-
		//to antes de fazer a inserção da pessoa...
		dao
			.atomicInclusion(maria);
				
	}
}
