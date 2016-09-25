package br.com.isabella.desafio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Autor {

	@Id @GeneratedValue
	@Getter
	private Long id;
	
	@Getter @Setter
	private String nome;
	
	public Autor(String nome) {
		super();
		this.nome = nome;
	}
}
