package br.com.involves.intervalos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IdentificadorIntervaloTest {

	@Test
	public void arrayComUm4DeveTerIntervaloDe4a4() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4);

		assertEquals("[[4]]", intervalos);
	}

	@Test
	public void arrayCom4e5DeveTerIntervaloDe4a5() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4, 5);

		assertEquals("[[4-5]]", intervalos);
	}

	@Test
	public void arrayCom4e5e6DeveTerIntervaloDe4a6() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4, 5, 6);

		assertEquals("[[4-6]]", intervalos);
	}

	@Test
	public void arrayCom4e5e7DeveTerIntervaloDe4a5e7() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4, 5, 7);

		assertEquals("[[4-5],[7]]", intervalos);
	}

	@Test
	public void arrayCom4e5e7e8DeveTerIntervaloDe4a5e7a8() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4, 5, 7, 8);

		assertEquals("[[4-5],[7-8]]", intervalos);
	}

	@Test
	public void arrayCom4e5e7e9e10DeveTerIntervaloDe4a5e7e9a10() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(4, 5, 7, 9, 10);

		assertEquals("[[4-5],[7],[9-10]]", intervalos);
	}

	@Test
	public void arrayCom3e5e7e9e10DeveTerIntervaloDe4a5e7e9a10() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(3, 4, 5, 7, 9, 10);

		assertEquals("[[3-5],[7],[9-10]]", intervalos);
	}

	@Test
	public void oDoDesafio() {
		IdentificadorIntervalo identificador = new IdentificadorIntervalo();

		String intervalos = identificador.retornaIntervalos(100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150);

		assertEquals("[[100-105],[110-111],[113-115],[150]]", intervalos);
	}

}
