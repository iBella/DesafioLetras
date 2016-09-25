package br.com.isabella.desafio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Palavra {

	@Id @GeneratedValue
	@Getter
	private Long id;
	
	@Getter @Setter
	@NotEmpty(message="Para realizar a busca a palavra deve ser informada!")
	@NotNull(message="Para realizar a busca a palavra deve ser informada!")
	private String nome;
	
	public Palavra(String nome) {
		super();
		this.nome = nome;
	}
	
}