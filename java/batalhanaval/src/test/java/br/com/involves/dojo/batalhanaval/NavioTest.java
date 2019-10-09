package br.com.involves.dojo.batalhanaval;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.involves.dojo.batalhanaval.barcos.BarcoDePatrulha;
import br.com.involves.dojo.batalhanaval.barcos.Navio;
import br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao;

public class NavioTest {

	@Before
	public void setup() {
	}
	
	@Test
	public void constroiNavioTamanhoDoisNaVertical() {
		Coordenada coordenada = new Coordenada(0, 0);
		
		Navio navio = new BarcoDePatrulha();
		navio.setCoordenadaInicial(coordenada);
		navio.setOrientacao(Orientacao.VERTICAL);
		navio.constroi();
		
		assertEquals(Orientacao.VERTICAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(0, 1));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}

	@Test
	public void constroiNavioTamanhoDoisNaHorizontal() {
		Coordenada coordenada = new Coordenada(0, 0);
		
		Navio navio = new BarcoDePatrulha();
		navio.setCoordenadaInicial(coordenada);
		navio.setOrientacao(Orientacao.HORIZONTAL);
		navio.constroi();
		
		assertEquals(Orientacao.HORIZONTAL, navio.getOrientacao());
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(0, 0));
		coordenadas.add(new Coordenada(1, 0));
		
		assertEquals(coordenadas, navio.getCoordenadas());
	}
	
}
