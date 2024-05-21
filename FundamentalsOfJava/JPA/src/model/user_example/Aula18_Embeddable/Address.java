package model.user_example.Aula18_Embeddable;

import javax.persistence.Embeddable;

// EMBEDDABLE

/* No JPA temos outra annotation que é a "@embeddable" que pode ser traduzida por "encorporável", o que essa an-
 * notation faz é justamente incorporar atributos que pertencem a uma determinada classe como colunas nas nossas
 * classes mapeadas, adicionando essas colunas as tabelas sem a necessidade de fazer relacionamentos ou gerar 
 * uma nova tabela só para isso, em vez disso toda a ligação entre os atributos da classe e as tabelas fica toda
 * por conta da Orientação a Objeto por através da Composição (relacionamento do tipo "Tem Um" - onde uma classe
 * POSSUÍ elementos de outra).
 * 
 * Usando apenas a annotation @Embeddable as nossas demais classes do JPA que tiverem um atributo do tipo dessa
 * classe automaticamente irão possuir os mesmos atributos declarados na nossa classe embeddable, e terão os 
 * mesmos valores que forem passados como parâmetro para o objeto dessa classe.
 * 
 * Veja como a nossa classe @Embeddable foi implementada no exemplo abaixo, e veja como as classes Employess e 
 * Suppliers acabam possuíndo os atributos dessa classe...
 * */

//Aqui temos a declaração na nossa annotation @Embeddable, mostrando que essa classe terá os seus atributos pos-
//suídos por outras classes mapeadas pelo nosso JPA...
@Embeddable
public class Address {
	
	//Note que temos apenas 2 atributos, esses 2 atributos se tornarão colunas nas nossas tabelas...
	private Long number;
	private String place;
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
