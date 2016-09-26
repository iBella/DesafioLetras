package br.com.isabella.desafio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Antonimo {

	@Id @GeneratedValue
	@Getter
	private Long id;
	
	@Getter @Setter
	private String nome;
	
	public Antonimo(String nome) {
		super();
		this.nome = nome;
	}
}