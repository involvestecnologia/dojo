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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
