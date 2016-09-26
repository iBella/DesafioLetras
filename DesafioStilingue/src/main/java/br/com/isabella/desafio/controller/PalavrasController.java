package br.com.isabella.desafio.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.isabella.desafio.model.Palavra;
import br.com.isabella.desafio.util.RepositorioDesafio;

@Controller
public class PalavrasController {

	private final Result result;
	private final RepositorioDesafio repositorio;
	
	/**
	 * @deprecated CDI eyes only
	 */
	protected PalavrasController() {
		this(null,null);
	}
	
	@Inject
	public PalavrasController(Result result, RepositorioDesafio repositorio) {
		this.result = result;
		this.repositorio = repositorio;
	}

	@Path("/apresentarBusca")
	public void apresentarBusca() {
		
	}
	
//	public void getPalavras() {
//		this.result.use(Results.json()).from(Palavra.class).include("palavra").serialize();
//	}
	
	@Path("/busca")
	public void busca(){
		result.include("palavraList", repositorio.todasPalavras());
		result.include("sinonimoList", repositorio.todosSinonimos());
		result.include("antonimoList", repositorio.todosAntonimos());
		result.include("autorList", repositorio.todosAutores());
		result.redirectTo(this).resultado();
	}
	
	@Path("/maisBuscadas")
	public void maisBuscadas(){
		result.include("palavraList", repositorio.maisBuscadas());
		result.redirectTo(this).resultado();
	}
	
	@Path("/salvar")
	public void salvar(Palavra palavra) {
		repositorio.salvar(palavra);
		result.redirectTo(this).busca();
	}
	
	@Path("/resultado")
	public void resultado() {
		
	}
		
	
}
