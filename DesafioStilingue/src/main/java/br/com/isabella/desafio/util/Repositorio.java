package br.com.isabella.desafio.util;

import java.util.ArrayList;
import java.util.List;

import br.com.isabella.desafio.model.Autor;
import br.com.isabella.desafio.model.Palavra;
import br.com.isabella.desafio.model.Sinonimo;

public class Repositorio implements RepositorioDesafio{
	
	private static final String MAIS_BUSCADAS = "#tagListIndex ul a";
	private static final String SINONIMO = "#contentList p";
	private static final String AUTORES = "h6[title]";
	
	private static final String URL_MAIS_BUSCADAS = "http://www.dicionariocriativo.com.br";
	private static final String URL_SINONIMO = "http://www.dicionariocriativo.com.br/sinonimos-e-antonimos/";
	private static final String URL_AUTORES = "http://www.dicionariocriativo.com.br//brainstorm/";
	
	private static final List<Palavra> listaPalavra = new ArrayList<>();
	private static final List<Sinonimo> listaSinonimo = new ArrayList<>();
	private static final List<Autor> listaAutor = new ArrayList<>();
	
	
	@Override
	public void salvar(Palavra palavra) {
		Coleta c = new Coleta();
		
		String sinonimos[] = c.coleta(URL_SINONIMO + palavra.getNome(),SINONIMO).split(" ");
		listaSinonimo.clear();
		for(String s: sinonimos){
			listaSinonimo.add(new Sinonimo(s));
		}
		
		String autores[] = c.coleta(URL_AUTORES + palavra.getNome(), AUTORES).split(" ");
		listaAutor.clear();
		for(String s: autores){
			listaAutor.add(new Autor(s));
		}
		
		listaPalavra.clear();
		listaPalavra.add(palavra);
	}
	
	@Override
	public List<Palavra> todasPalavras() {
		return listaPalavra;
	}
	
	@Override
	public List<Palavra> maisBuscadas() {
		Coleta coleta = new Coleta();
		List<Palavra> palavras = new ArrayList<>();
		String maisBuscadas[] = coleta.coleta(URL_MAIS_BUSCADAS, MAIS_BUSCADAS).split(" ");
		for(String p: maisBuscadas){
			Palavra palavra = new Palavra(p);
			palavras.add(palavra);
		}
		return palavras;
	}

	@Override
	public List<Sinonimo> todosSinonimos() {
		return listaSinonimo;
	}

	@Override
	public List<Autor> todosAutores() {
		return listaAutor;
	}

}
