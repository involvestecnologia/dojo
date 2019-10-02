package br.com.involves.dojo.batalhanaval;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.involves.dojo.batalhanaval.exception.CoordenadaForaDosLimitesException;

public class PosicaoTest {

	@Test
	public void posicaoRespeitaAsCordernadasPassadas() {
		Coordenada coordenada = new Coordenada(1, 1);

		assertEquals(1, coordenada.getX());
		assertEquals(1, coordenada.getY());
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void naoPermiteCriarCoordenadaAlemDoLimiteHorizontalMaximo() {
		new Coordenada(10, 1);
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void naoPermiteCriarCoordenadaAlemDoLimiteHorizontalMinimo() {
		new Coordenada(-1, 1);
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void naoPermiteCriarCoordenadaAlemDoLimiteVerticalMaximo() {
		new Coordenada(0, 10);
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void naoPermiteCriarCoordenadaAlemDoLimiteVerticalMinimo() {
		new Coordenada(0, -1);
	}

}
