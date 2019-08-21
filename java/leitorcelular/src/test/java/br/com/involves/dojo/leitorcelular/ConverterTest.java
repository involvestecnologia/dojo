package br.com.involves.dojo.leitorcelular;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

	private static final String EMPTY = "";

	@Test
	public void esperaRetornoVazioParaEntradaVazia() {
		Converter converter = new Converter();
		String resultado = converter.converte(EMPTY);

		Assert.assertEquals(EMPTY, resultado);
	}

	@Test
	public void esperaRetornar_A_paraEntrada_2() {
		Converter converter = new Converter();
		String resultado = converter.converte("2");

		Assert.assertEquals("A", resultado);
	}

	@Test
	public void esperaRetornar_D_paraEntrada_3() {
		Converter converter = new Converter();
		String resultado = converter.converte("3");

		Assert.assertEquals("D", resultado);
	}

	@Test
	public void esperaRetornar_Espaco_paraEntrada_0() {
		Converter converter = new Converter();
		String resultado = converter.converte("0");

		Assert.assertEquals(" ", resultado);
	}

	@Test
	public void esperaRetornar_AD_paraEntrada_23() {
		Converter converter = new Converter();
		String resultado = converter.converte("23");

		Assert.assertEquals("AD", resultado);
	}

	@Test
	public void esperaRetornar_B_paraEntrada_22() {
		Converter converter = new Converter();
		String resultado = converter.converte("22");

		Assert.assertEquals("B", resultado);
	}

	@Test
	public void esperaRetornar_C_paraEntrada_222() {
		Converter converter = new Converter();
		String resultado = converter.converte("222");
		
		Assert.assertEquals("C", resultado);
	}
	
	@Test
	public void esperaRetornar_C_D_paraEntrada_22203() {
		Converter converter = new Converter();
		String resultado = converter.converte("22203");
		
		Assert.assertEquals("C D", resultado);
	}
}
