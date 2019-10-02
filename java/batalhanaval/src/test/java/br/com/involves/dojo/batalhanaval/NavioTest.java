package br.com.involves.dojo.batalhanaval;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import br.com.involves.dojo.batalhanaval.barcos.BarcoDePatrulha;

public class NavioTest {

	@Test
	public void tabuleiroEstahVazio() {
		Tabuleiro tabuleiro = new Tabuleiro();
		
		assertTrue(tabuleiro.getNavios().isEmpty());
	}
	
	@Test
	public void tabuleiroTemNavioPosicionado() {
		Tabuleiro tabuleiro = new Tabuleiro();
		BarcoDePatrulha barcoDePatrulha = new BarcoDePatrulha();
		tabuleiro.posiciona(barcoDePatrulha);
		Assert.assertEquals(1, tabuleiro.getNavios().size());
	}

}
