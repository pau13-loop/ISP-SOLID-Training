package edu.pingpong.isp.isp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProcesadorTexto {

	private ProcesadorTexto procesador;
	private ProcesadorTextoCorrecto procesadorCorrector;

	@Before
	public void setupProcesadorText() {
		procesador = new ProcesadorTexto();
		procesadorCorrector = new ProcesadorTextoCorrecto();
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
		procesadorCorrector.nueva("Tengo");
		procesadorCorrector.nueva("hambre");

		assertEquals("Tengo hambre", procesadorCorrector.texto());
		assertTrue(procesadorCorrector.correcto(Idioma.ES));
		assertFalse(procesadorCorrector.correcto(Idioma.EN));
		assertFalse(procesadorCorrector.correcto(Idioma.CA));
	}

	@Test
	public void test_con_idioma_en() {
		procesadorCorrector.nueva("I");
		procesadorCorrector.nueva("am");
		procesadorCorrector.nueva("angry");

		assertEquals("I am angry", procesadorCorrector.texto());
		assertTrue(procesadorCorrector.correcto(Idioma.EN));
		assertFalse(procesadorCorrector.correcto(Idioma.ES));
		assertFalse(procesadorCorrector.correcto(Idioma.CA));
	}

	@Test
	public void test_con_idioma_ca() {
		procesadorCorrector.nueva("tenc");
		procesadorCorrector.nueva("fam");

		assertEquals("tenc fam", procesadorCorrector.texto());
		assertTrue(procesadorCorrector.correcto(Idioma.CA));
		assertFalse(procesadorCorrector.correcto(Idioma.ES));
		assertFalse(procesadorCorrector.correcto(Idioma.EN));
	}
}
