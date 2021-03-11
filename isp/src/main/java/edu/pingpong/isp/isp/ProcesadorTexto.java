package edu.pingpong.isp.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements Basic{

	List<String> texto = new ArrayList<>();
	
	@Override
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	@Override
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}
}
