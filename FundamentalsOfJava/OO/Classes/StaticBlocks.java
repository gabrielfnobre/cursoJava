package OO.Classes;

import OO.Interfaces.Sportive;

// BLOCOS ESTÁTICOS

/* Blocos estáticos são blocos auto-executáveis que são inicializados assim que uma classe
 * é carregada no ClassLoader. Um bloco estático é carregado apenas uma vez quando a clas-
 * se é chamada, não importa se ela é for usada para criar "n" instâncias.
 * 
 * Com frequência eles são usados para inicializar variáveis estáticas das quais precisa-
 * mos de alguma programação para gerar o seu valor.
 * 
 * Abaixo temos um exemplo de como usar um bloco stático!
 * */

//Essa classe tem como objetivo fazer uma soma sobre um valor DELTA pego de uma interface que já utilizamos no exemplo de interfaces...
public class StaticBlocks implements Sportive {
	private static int delta; //Queremos dar um valor delta a esse atributo já na inicialização da nossa classe...
	
	static { 					//Aqui temos o exemplo do bloco estático, ele é chamado assim que a classe inicia e é chamado apenas 1 vez, atri-
		delta = decrease10();	//buindo valor ao delta. Note que a função do bloco estático é executar alguma coisa assim que a classe é chamada
	}							//estamos executanto o método decrease10 e atribuindo ao nosso atributo estático como valor padrão...
	
	static int decrease10() {		//Aqui temos o método que precisa ser implementado assim que a classe é chamada, para dar um valor ao delta
		return COMUMN_DELTA - 10;	//que no caso seria diminuir em 10 o valor do COMUMN_DELTA adivindo da interface Sportive para que esse va-
	}								//valor possa ser declarado para o nosso delta!
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("The variable delta is iniciated with value " + delta + "!\n"+
				"We want that our values to be add to delta..."
				);
		
		for (int i = 1; i <= delta; i++) {
			Thread.sleep(500);
			System.out.println("\t" + (i + delta));
		}
		
		System.out.println("End!");
	}

	
	//ABAIXO TEMOS OS MÉTODO QUE PRECISAM SER IMPLEMENTADOS PARA USARMOS A INTERFACE...
	@Override
	public void turnOnTurbo() {
		// TODO Auto-generated method stub
	}
	

	@Override
	public void turnOffTurbo() {
		// TODO Auto-generated method stub
		
	}
}
