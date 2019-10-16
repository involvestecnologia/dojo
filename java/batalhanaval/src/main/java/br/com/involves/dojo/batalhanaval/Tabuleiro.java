package br.com.involves.dojo.batalhanaval;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.dojo.batalhanaval.barcos.Navio;
import br.com.involves.dojo.batalhanaval.exception.NaviosEmPosicoesConflitantesException;

public class Tabuleiro {

	public static final int LIMITE_MAXIMO = 9;
	public static final int LIMITE_MINIMO = 0;
	
	List<Navio> navios = new ArrayList<>();
	
	public List<Navio> getNavios() {
		return navios;
	}

	public boolean posiciona(Navio novoNavio) {
		for(Navio navio : navios) {
			if(navio.colide(novoNavio)) {
				throw new NaviosEmPosicoesConflitantesException();
			}
		}
		
		return navios.add(novoNavio);		
	}

}
