package edu.pingpong.isp.isp;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestProcesadorTexto {

	private ProcesadorTexto procesador;

	@Before
	public void setupProcesadorText() {
		procesador = new ProcesadorTexto();
	}

	@Test
	public void test_simple() {
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma_es() {
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		assertTrue(procesador.correcto(Idioma.ES));
		assertFalse(procesador.correcto(Idioma.EN));
		assertFalse(procesador.correcto(Idioma.CA));
	}

	public void test_con_idioma_en() {
		procesador.nueva("I");
		procesador.nueva("am");
		procesador.nueva("angry");

		assertEquals("I am angry", procesador.texto());
		assertTrue(procesador.correcto(Idioma.EN));
		assertFalse(procesador.correcto(Idioma.ES));
		assertFalse(procesador.correcto(Idioma.CA));
	}

	public void test_con_idioma_ca() {
		procesador.nueva("tenc");
		procesador.nueva("fam");

		assertEquals("tenc fam", procesador.texto());
		assertTrue(procesador.correcto(Idioma.CA));
		assertFalse(procesador.correcto(Idioma.ES));
		assertFalse(procesador.correcto(Idioma.EN);
	}
}
