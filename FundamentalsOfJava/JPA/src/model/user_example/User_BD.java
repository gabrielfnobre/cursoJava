package model.user_example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Aqui temos o nosso 1º exemplo de mapeamento de entidades do curso

//Aqui temos o uso da annotation "@Entity", essa annotation identifica uma classe
//como representação de uma entidade em um BD.
//DICA IMPORTANTE: O nome da classe deve ser exatamente o mesmo nome da tabela no
//BD, do contrário, o Hibernate não fará a identificação. Se você desejar que o 
//nome da classe fique diferente da entidade, mas ainda assim aponte para a enti-
//dade que você deseja, use a annotation "@Table" com o valor "name" identifican-
//do corretamente a entidade envolvida.
@Entity
//@Table(name = "user_bd") //caso fossemos identificar a entidade
public class User_BD {
	
	//Aqui temos o uso da annotation "@Id", essa annotation identifica um deter-
	//minado atributo como referenciador da chave primária na entidade. Temos 
	//também que dar start aos números do nosso ID, para isso podemos usar a 
	//annotation "@GeneratedValue", usando o valor "strategy" podemos escolher
	//como os números do Id serão auto-incrementados, o valor mais comum é o 
	//"IDENTITY" que auto-incrementa os valores na ordem. Temos também o "SE-
	//QUENCE", porém ele incrementa na ordem mas divide essa ordem entre as
	//tabelas.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	public User_BD() {}
	
	public User_BD(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
