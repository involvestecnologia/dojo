package br.com.involves.dojo.batalhanaval;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.involves.dojo.batalhanaval.barcos.BarcoDePatrulha;
import br.com.involves.dojo.batalhanaval.barcos.Navio;

public class TabuleiroTest {

	private Tabuleiro tabuleiro;

	@Before
	public void setup() {
		tabuleiro = new Tabuleiro();
	}

	@Test
	public void tabuleiroEstahVazio() {
		assertTrue(tabuleiro.getNavios().isEmpty());
	}

	@Test
	public void tabuleiroTemNavioPosicionado() {
		BarcoDePatrulha barcoDePatrulha = new BarcoDePatrulha();
		tabuleiro.posiciona(barcoDePatrulha);
		Assert.assertEquals(1, tabuleiro.getNavios().size());
	}


}
