package br.com.agilebr.code;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class OperadoraAmericaTest {

	private OperadoraAmerica operadoraAmerica;
	@Before
	public void setUp(){
		operadoraAmerica = new OperadoraAmerica();
	}
	
	@Test
	public void taxaPagamentoOitoPorcento() throws Exception {
		assertEquals(new BigDecimal("8.0"), operadoraAmerica.getTaxaPagamento());
	}
	
	@Test
	public void bandeiraAmericaExpressDeveSerIgualA() throws Exception {
		assertEquals("A", operadoraAmerica.getBandeira());
	}
	
}
