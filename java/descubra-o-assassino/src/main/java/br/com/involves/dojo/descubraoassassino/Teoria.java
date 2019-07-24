package br.com.involves.dojo.descubraoassassino;

import br.com.involves.dojo.descubraoassassino.Base.Arma;
import br.com.involves.dojo.descubraoassassino.Base.Assassino;
import br.com.involves.dojo.descubraoassassino.Base.Local;

/**
 * @author raphael.silveira
 * @since 24/07/2019
 */
public class Teoria {

	private Assassino assassino;
	private Local local;
	private Arma arma;

	public Teoria(Assassino assassino, Local local, Arma arma) {
		this.assassino = assassino;
		this.local = local;
		this.arma = arma;
	}

	public Assassino getAssassino() {
		return assassino;
	}

	public void setAssassino(Assassino assassino) {
		this.assassino = assassino;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

}
