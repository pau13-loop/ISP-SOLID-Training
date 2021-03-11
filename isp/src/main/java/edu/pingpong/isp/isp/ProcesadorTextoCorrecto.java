package edu.pingpong.isp.isp;

public class ProcesadorTextoCorrecto extends ProcesadorTexto implements Complex{
    
	@Override
	public boolean correcto (Idioma idioma) {
        return texto.stream().allMatch(p -> idioma.diccionario.contains(p.toLowerCase()));
	}
}
