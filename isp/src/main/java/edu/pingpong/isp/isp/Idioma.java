package edu.pingpong.isp.isp;

import java.util.Arrays;
import java.util.List;

public enum Idioma {
	
	EN ("i","am","angry"), 
	ES ("tengo","hambre"), 
	CA ("tenc", "fam");
	
	List<String> diccionario;

	private Idioma(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}
}
