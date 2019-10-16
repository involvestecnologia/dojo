package br.com.involves.dojo.batalhanaval;

import static br.com.involves.dojo.batalhanaval.utils.NavioUtils.constroiNavio;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.involves.dojo.batalhanaval.barcos.BarcoDePatrulha;
import br.com.involves.dojo.batalhanaval.barcos.Destroyer;
import br.com.involves.dojo.batalhanaval.barcos.Encoracado;
import br.com.involves.dojo.batalhanaval.barcos.Navio;
import br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao;
import br.com.involves.dojo.batalhanaval.barcos.PortaAviao;
import br.com.involves.dojo.batalhanaval.barcos.Submarino;
import br.com.involves.dojo.batalhanaval.exception.CoordenadaForaDosLimitesException;

public class NavioTest {

	@Before
	public void setup() {
	}
	
	@Test
	public void constroiBarcoDePatrulhaNaVertical() {
		
		Navio navio =  constroiNavio(new BarcoDePatrulha(), Orientacao.VERTICAL);
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}

	@Test
	public void constroiBancoDePatrulhaNaHorizontal() {
		
		Navio navio = constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL);
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiSubmarinoNaVertical() {
		Navio navio = constroiNavio(new Submarino(), Orientacao.VERTICAL);
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		coordenadas.add(new Coordenada(0, 2));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}

	@Test
	public void constroiSubmarinoNaHorizontal() {
		Navio navio = constroiNavio(new Submarino(), Orientacao.HORIZONTAL);
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		coordenadas.add(new Coordenada(2, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiDestroyerNaVertical() {
		Navio navio = constroiNavio(new Destroyer(), Orientacao.VERTICAL);
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		coordenadas.add(new Coordenada(0, 2));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}

	@Test
	public void constroiDestroyerNaHorizontal() {
		Navio navio = constroiNavio(new Destroyer(), Orientacao.HORIZONTAL);
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		coordenadas.add(new Coordenada(2, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiEncoracadoNaVertical() {
		Navio navio = constroiNavio(new Encoracado(), Orientacao.VERTICAL);
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		coordenadas.add(new Coordenada(0, 2));
		coordenadas.add(new Coordenada(0, 3));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiEncoracadoNaHorizontal() {
		Navio navio = constroiNavio(new Encoracado(), Orientacao.HORIZONTAL);
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		coordenadas.add(new Coordenada(2, 0));
		coordenadas.add(new Coordenada(3, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiPortaAviaoNaVertical() {
		Navio navio = constroiNavio(new PortaAviao(), Orientacao.VERTICAL);
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		coordenadas.add(new Coordenada(0, 2));
		coordenadas.add(new Coordenada(0, 3));
		coordenadas.add(new Coordenada(0, 4));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test
	public void constroiPortaAviaoNaHorizontal() {
		Navio navio = constroiNavio(new PortaAviao(), Orientacao.HORIZONTAL);
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		coordenadas.add(new Coordenada(2, 0));
		coordenadas.add(new Coordenada(3, 0));
		coordenadas.add(new Coordenada(4, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void navioSeConstroiNaVerticalParaForaDoTabuleiro() {
		constroiNavio(new BarcoDePatrulha(), Orientacao.VERTICAL, new Coordenada(0, 9));
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void navioSeConstroiNaHorizontalParaForaDoTabuleiro() {
		constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL, new Coordenada(9, 0));
	}
	
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void navioNaVerticalForaDoTabuleiro() {
		constroiNavio(new BarcoDePatrulha(), Orientacao.VERTICAL, new Coordenada(0, 10));
	}
	@Test(expected = CoordenadaForaDosLimitesException.class)
	public void navioNaHorizontalForaDoTabuleiro() {
		constroiNavio(new BarcoDePatrulha(), Orientacao.HORIZONTAL, new Coordenada(10, 0));
	}
	
	
	
	
}
