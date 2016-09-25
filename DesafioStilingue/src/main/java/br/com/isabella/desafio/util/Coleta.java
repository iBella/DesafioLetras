package br.com.isabella.desafio.util;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Coleta {
	
	public String coleta(String url, String tag) {
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements ele = doc.select(tag);
			System.out.println("Teste = "+ele.text().toString());
			
			return ele.text();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}