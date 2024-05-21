package model.user_example;

/* Essa classe foi desenvolvida em virtude da aula 17.
 * 
 * O objetivo dessa classe é mostrar que é possível que peguemos os valores advindos duma consulta SQL por através
 * de uma Named-Native-Query, somente passando uma classe qualquer (não mapeada) como parâmetros para a tag do nos-
 * so result-set no arquivo "xml".
 * */

//Temos a nossa classe MovieNote, desejamos que o atributo "average" dessa classe receba o resultado agregado da
//somatória da média de todos os filmes da nossa tabela "movies"...
public class MovieNote {

	private Double average;

	public MovieNote(Double average) {
		super();
		this.average = average;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}
}
