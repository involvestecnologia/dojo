package br.com.involves.dojo.batalhanaval;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.involves.dojo.batalhanaval.barcos.BarcoDePatrulha;
import br.com.involves.dojo.batalhanaval.barcos.Navio;
import br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao;
import br.com.involves.dojo.batalhanaval.barcos.PortaAviao;
import br.com.involves.dojo.batalhanaval.exception.NaviosEmPosicoesConflitantesException;
import br.com.involves.dojo.batalhanaval.utils.NavioUtils;

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
	public void posicionaUmNavioNoTabuleiro() {
		Navio navio = NavioUtils.constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL);
		
		tabuleiro.posiciona(navio);
		Assert.assertEquals(1, tabuleiro.getNavios().size());
	}

	@Test
	public void posicionaDoisNaviosNoTabuleiro() {
		Navio barcoDePatrulha = NavioUtils.constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL, new Coordenada(0, 0));
		Navio portaAviao = NavioUtils.constroiNavio(new PortaAviao(), Orientacao.HORIZONTAL, new Coordenada(0, 1));
		
		tabuleiro.posiciona(barcoDePatrulha);
		tabuleiro.posiciona(portaAviao);
		
		assertEquals(2, tabuleiro.getNavios().size());
	}
	
	@Test(expected = NaviosEmPosicoesConflitantesException.class)
	public void posicionaDoisNaviosHorizontalmenteComPosicoesConflitantes() {
		Navio barcoDePatrulha = NavioUtils.constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL, new Coordenada(0, 0));
		Navio portaAviao = NavioUtils.constroiNavio(new PortaAviao(), Orientacao.HORIZONTAL, new Coordenada(1, 0));
		
		tabuleiro.posiciona(barcoDePatrulha);
		tabuleiro.posiciona(portaAviao);
	}
	
	@Test(expected = NaviosEmPosicoesConflitantesException.class)
	public void posicionaDoisNaviosVerticalComPosicoesConflitantes() {
		Navio barcoDePatrulha = NavioUtils.constroiNavio(new BarcoDePatrulha(), Orientacao.VERTICAL, new Coordenada(0, 0));
		Navio portaAviao = NavioUtils.constroiNavio(new PortaAviao(), Orientacao.VERTICAL, new Coordenada(0, 1));
		
		tabuleiro.posiciona(barcoDePatrulha);
		tabuleiro.posiciona(portaAviao);
	}

}
