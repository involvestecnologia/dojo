package br.com.involves.dojo.batalhanaval;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.dojo.batalhanaval.barcos.Navio;

public class Tabuleiro {

	public static final int LIMITE_MAXIMO = 9;
	public static final int LIMITE_MINIMO = 0;
	
	List<Navio> navios = new ArrayList<>();
	
	public List<?> getNavios() {
		return navios;
	}

	public boolean posiciona(Navio navio) {
		return navios.add(navio);		
	}

}
