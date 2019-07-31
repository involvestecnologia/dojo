package com.dojo.conversao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversorIndoArabicoRomanoTest {

	@Test
	public void deveRetornarIParaEntrada1() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(1);

		assertEquals("I", saida);
	}

	@Test
	public void deveRetornarVParaEntrada5() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(5);

		assertEquals("V", saida);
	}

	@Test
	public void deveRetornarXParaEntrada10() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(10);

		assertEquals("X", saida);
	}

	@Test
	public void deveRetornarLParaEntrada50() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(50);

		assertEquals("L", saida);
	}

	@Test
	public void deveRetornarCParaEntrada100() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(100);

		assertEquals("C", saida);
	}

	@Test(expected  = EntradaInvalida.class)
	public void deveRetornarExcecaoAoInserirZero() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(0);
	}
	
	@Test
	public void deveRetornarIIParaEntrada2() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(2);

		assertEquals("II", saida);
	}
	
	@Test
	public void deveRetornarIVParaEntrada4() {
		ConversorIndoArabicoRomano conversor = new ConversorIndoArabicoRomano();
		String saida = conversor.decompositor(4);

		assertEquals("IV", saida);
	}
	
}
