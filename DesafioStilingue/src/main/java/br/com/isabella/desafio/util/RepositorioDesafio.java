package br.com.isabella.desafio.util;

import java.util.List;

import br.com.isabella.desafio.model.Antonimo;
import br.com.isabella.desafio.model.Autor;
import br.com.isabella.desafio.model.Palavra;
import br.com.isabella.desafio.model.Sinonimo;

public interface RepositorioDesafio {

	void salvar(Palavra palavra);
	List<Palavra> todasPalavras();
	List<Palavra> maisBuscadas();
	List<Sinonimo> todosSinonimos();
	List<Autor> todosAutores();
	List<Antonimo> todosAntonimos();
}
