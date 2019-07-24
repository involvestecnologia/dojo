package br.com.involves.dojo.descubraoassassino;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.involves.dojo.descubraoassassino.Base.Arma;
import br.com.involves.dojo.descubraoassassino.Base.Assassino;
import br.com.involves.dojo.descubraoassassino.Base.Local;

/**
 * @author raphael.silveira
 * @since 24/07/2019
 */
public class TestemunhaTest {

	private Testemunha testemunha;

	@Before
	public void setup() {
		testemunha = new Testemunha();
	}

	@Test
	public void todaTestemunhaDeveConhecerOCrime() {
		assertNotNull(testemunha.getCrime());
	}

	@Test
	public void deveRetornarTeoriaCorretaQuandoAcertouATeoria() {
		//dado
		Teoria crime = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
		Teoria teoria = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
		testemunha.setCrime(crime);

		//quando
		Resposta resposta = testemunha.valida(teoria);

		//então
		assertEquals("deve validar a teoria correta", Resposta.TEORIA_CORRETA, resposta);
	}

	@Test
	public void deveRetornarAssassinoIncorreto() {
		Teoria crime = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
		Teoria teoria = new Teoria(Assassino.DECA, Local.ANGELONI, Arma.AGILE);
		testemunha.setCrime(crime);

		Resposta resposta = testemunha.valida(teoria);

		assertEquals(Resposta.ASSASSINO_INCORRETO, resposta);
	}
	
	@Test
	public void deveRetornarLocalIncorreto() {
		Teoria crime = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
		Teoria teoria = new Teoria(Assassino.ANSO, Local.BALACOBACO, Arma.AGILE);
		testemunha.setCrime(crime);

		Resposta resposta = testemunha.valida(teoria);

		assertEquals(Resposta.LOCAL_INCORRETO, resposta);
	}
	
	@Test
	public void deveRetornarArmaIncorreta() {
		Teoria crime = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
		Teoria teoria = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.DOROTHY);
		testemunha.setCrime(crime);

		Resposta resposta = testemunha.valida(teoria);

		assertEquals(Resposta.ARMA_INCORRETA, resposta);
	}
	
//	@Test
//	public void deveRetornarAssassinoOuLocalIncorreto() {
//		Teoria crime = new Teoria(Assassino.ANSO, Local.ANGELONI, Arma.AGILE);
//		Teoria teoria = new Teoria(Assassino.DIEGO, Local.BALACOBACO, Arma.AGILE);
//		testemunha.setCrime(crime);
//
//		Resposta resposta = testemunha.valida(teoria);
//
//		Assert.assertTrue(resposta.ASSASSINO_INCORRETO.equals(resposta) || resposta.LOCAL_INCORRETO.equals(resposta));
//	}

}
