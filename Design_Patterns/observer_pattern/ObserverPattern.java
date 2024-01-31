package observer_pattern;

public class ObserverPattern {

}

// 	OBSERVER PATTERN

/*	O Padrão Observer, é um padrão de projeto comportamental que têm por objetivo usar um objeto 
 * 	observador para identificar mudanças de estado em um determinado objeto ou evento que deve 
 * 	ser observado e então avisar as classes ou objetos interessados que essa determinada mudança 
 * 	ocorreu.
 * 
 * 	Assim, todos os objetos interessados na mudança poderão ser informados e poderão executar um 
 * 	determinado comportamento definido previamente para acontecer assim que a mudança for dispa-
 * 	rada.
 * 
 * 	Para ilustrar:
 * 
 * 		É como um aniversário, imagine que uma mãe deseja fazer um aniversário surpresa para o 
 * 		filho e contata o porteiro do prédio para avisá-la assim que o rapaz chegar. É como se 
 * 		essa mãe estivesse usando o padrão observer junto com os demais convidados da festa.
 * 
 *   	Pois, temos um evento: A chegada do aniversariante;
 *   	Temos um observador: O porteiro;
 *   	Temos varios interessados: A mãe e todos os convidados da festa;
 * 	
 * 
 * 	Qual as vantagens de usar esse padrão?
 * 
 * 		Podemos entender bem as vantagens usando ainda o exemplo do aniversariante...
 * 
 * 			* Produtividade: 
 * 
 * 							O fato da mãe delegar a tarefa de observar a chegada do filho para o 
 * 							porteiro em vez de ela mesma ficar fazendo isso, possibilita que a
 * 							mãe se ocupe com os preparativos da festa enquanto o rapaz não che-
 * 							ga. Ela só vai colocar a festa em ação assim que ela for notificada
 * 							da chegada dele;
 * 
 * 							Da mesma forma, podemos criar objetos observadores que não precisam
 * 							se preocupar a todo instante que um evento aconteça para que ele pos-
 * 							sa fazer as demais execuções que não precisam necessariamente parar 
 * 							enquanto a resposta do evento não viesse.
 * 
 * 							O objeto pode ir executando suas tarefas e será notificado quando o
 * 							evento ocorrer, tornando o código mais eficiente e produtivo.
 * 
 * 
 * 			* Baixo Acoplamento:
 * 
 * 							Por termos um único objeto observador, podemos ter 0 ou "N" objetos
 * 							interessados em aguardar pela resposta. Esses objetos não precisam
 * 							ter vínculo obrigatório com o observador, pois eles podem ser cria-
 * 							dos ou deletados segundo o nosso desejo.
 * 
 * 
 * 			* Reutilização de Código:
 * 
 * 							Por termos 1 mesmo comportamento para "N" objetos interessados, po-
 * 							demos ter um único observador que irá notificar todos os interessa-
 * 							dos. Não havendo a necessidade criar vários observadores, pois esse
 * 							único observador possuí uma lista de todos os interessados e noti-
 * 							fica a todos de uma única vez.
 * 						
 * 	
 * 	Estrutura do Observer Pattern:
 * 
 *  	O Observer Pattern, como os demais padrões de projeto, podem ser aplicados em qualquer 
 *  	linguagem de programação, mas eles devem obedecer a seguinte estrutura:
 *  
 *  	 _______________________             _________________ 
 *  	|                       |           |                 |
 *  	|        SUBJECT        |◊----------|    OBSERVER     |
 *  	|_______________________|           |_________________|
 *  	|                       |           |_________________|
 *      | -observerCollection   |           |                 |
 *      |_______________________|           |    +notify()    | 
 *  	|                       |           |_________________|
 *      | -registerObserver()   |                    △
 *      | -unRegisterObserver() |                    |
 *      | -notifyObserver()     |                    |
 *      |_______________________|                    |
 *                 ◆                                 |
 *                 |                      ___________|___________
 *  	           |                     |                       |
 *  	           |                     |   OBSERVER_CONCRETE   |
 *  	           |                     |_______________________|
 *                 |---------------------|_______________________|
 *  	                                 |                       |
 *  	                                 |       +notify()       |
 *  	                                 |_______________________|
 *  
 *  
 *  		* Subject:
 *  		
 *  			É o elemento responsável por identificar quando o evento ou mudança ocorrem 
 *  			no objeto que desejamos observar. Esse objeto também é responsável por re-
 *  			gistrar todos os observadores interessados no acontecimento do evento, bem
 *  			como por remover observadores. Note que ele também deve armazenar todos os
 *  			observadores interessados numa collection ou array.
 *  
 *  			No diagrama acima, temos um exemplo adaptado para o Java, onde temos uma 
 *  			classe que possuí uma collection responsável por armazenar todos os observa-
 *  			dores, um método registrador, um método removedor de observers e um método
 *  			notificador;
 *  
 *  			OBSERVAÇÃO: O registro é muito importante para que os observadores sejam
 *  			notificados, observadores que não estiverem registrados, não serão notifi-
 *  			cados.
 *  
 *  
 *  		* Observer:
 *  
 *  			É o elemento que representa a interface ou classe abstrata que contém o mé-
 *  			todo que deverá ser implementado em todos os observadores. Esse método se-
 *  			rá chamado para cada observador assim que o evento ocorrer. Cada observador
 *  			irá possuir uma execução própria e individualizada para a chamada, de acor-
 *  			do com o propósito de cada um deles.
 *  
 *  			No diagrama acima temos a representação de uma interface que não possuí 
 *  			atributos, somente o método público "notify()", como é demonstrado pelo re-
 *  			lacionamento entre ela e a classe Observer_Concrete, o triângulo vazio in-
 *  			dica que ela é uma interface.
 *  
 *  		
 *  		* Observer Concrete:
 *  
 *  			É o elemento observador interessado, nós o chamamos de "Observador Concre-
 *  			to", pois ele é o responsável por implementar o método abstrato advindo da
 *  			interface Observer, transformando esse método abstrato em um método concre-
 *  			to.
 *  
 *  			São os objetos de Observer Concrete que são registrados no Subject e depo-
 *  			is notificados pelo Subject quanto o evento ocorre. Podemos ter quantos Ob-
 *  			server Concrete nós quisermos, assim como num aniversário podemos ter quantos 
 *  			convidados nós quisermos. O que é importante lembrar é que cada um deles é 
 *  			interessado em saber quando o evento ocorre, para que possam ser notificados 
 *  			e agir de acordo com seus interesses quando isso acontecer.
 *  
 * 				No diagrama acima, note que os Observer Concrete possuem uma dependência de  
 * 				composição com a classe do Subject, pois essa classe armazena diversos Ob-
 * 				server Concrete para poder notificá-los. Se o Subject não existe, os Obser-
 * 				ver Concrete perdem o valor, pois não haverá nenhum elemento responsável por
 * 				assistir o evento acontecer.
 * 
 * 				Além disso, veja que o Observer Concrete também replica o método da interfa-
 * 				ce Observer nele mesmo.
 * 
 *	Agora, veja no exemplo acima uma implementação do exemplo do aniversariante na prática 
 *	usando o padrão Observer...
 *
 * */
