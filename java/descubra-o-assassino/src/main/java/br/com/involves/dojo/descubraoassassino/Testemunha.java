package br.com.involves.dojo.descubraoassassino;

import java.util.Random;

import br.com.involves.dojo.descubraoassassino.Base.Arma;
import br.com.involves.dojo.descubraoassassino.Base.Assassino;
import br.com.involves.dojo.descubraoassassino.Base.Local;

/**
 * @author raphael.silveira
 * @since 24/07/2019
 */
public class Testemunha {

	private Teoria crime;

	public Testemunha() {
		Random random = new Random();
		this.crime = new Teoria(
			Assassino.values()[random.nextInt(Assassino.values().length)],
			Local.values()[random.nextInt(Local.values().length)],
			Arma.values()[random.nextInt(Arma.values().length)]);
	}

	public Teoria getCrime() {
		return this.crime;
	}

	public void setCrime(Teoria crime) {
		this.crime = crime;
	}

	public Resposta valida(Teoria teoria) {
		if (!teoria.getAssassino().equals(crime.getAssassino())) {
			return Resposta.ASSASSINO_INCORRETO;
		}
		
		if (!teoria.getLocal().equals(crime.getLocal())) {
			return Resposta.LOCAL_INCORRETO;
		}
		
		if (!teoria.getArma().equals(crime.getArma())) {
			return Resposta.ARMA_INCORRETA;
		}
		
		return Resposta.TEORIA_CORRETA;
	}

}
