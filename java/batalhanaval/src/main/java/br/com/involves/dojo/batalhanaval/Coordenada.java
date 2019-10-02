package br.com.involves.dojo.batalhanaval;

import static br.com.involves.dojo.batalhanaval.Tabuleiro.LIMITE_MAXIMO;
import static br.com.involves.dojo.batalhanaval.Tabuleiro.LIMITE_MINIMO;

import br.com.involves.dojo.batalhanaval.exception.CoordenadaForaDosLimitesException;

public class Coordenada {

	private int x;
	private int y;

	public Coordenada(int x, int y) {
		validaLimites(x);
		validaLimites(y);
		
		this.x = x;
		this.y = y;
	}

	private void validaLimites(int numero) {
		if (numero > LIMITE_MAXIMO || numero < LIMITE_MINIMO)
			throw new CoordenadaForaDosLimitesException();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
