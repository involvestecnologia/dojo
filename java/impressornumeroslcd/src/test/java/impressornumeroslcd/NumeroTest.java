package impressornumeroslcd;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NumeroTest {
	
	@Test
	public void deveConstruirNumeroUm() {
		Numero numero = createNumero(1);

		Assert.assertEquals(1, numero.getValor());
	}
	
	@Test
	public void primeiraLinhaDoNumeroUmDeveRetornarTresEspacosVazios() {
		Numero numero = createNumero(1);

		Assert.assertEquals("   ", numero.getPrimeiraLinha());
	}
	
	@Test
	public void segundaLinhaDoNumeroUmDeveRetornarEspacoEspacoPipe() {
		Numero numero = createNumero(1);
		
		Assert.assertEquals("  |", numero.getSegundaLinha());
	}
	
	@Test
	public void terceiraLinhaDoNumeroUmDeveRetornarEspacoEspacoPipe() {
		Numero numero = createNumero(1);
		
		Assert.assertEquals("  |", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroDoisDeveTerAtributosCorretos() {
		Numero numero = createNumero(2);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals(" _|", numero.getSegundaLinha());
		Assert.assertEquals("|_ ", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroTresDeveTerAtributosCorretos() {
		Numero numero = createNumero(3);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals(" _|", numero.getSegundaLinha());
		Assert.assertEquals(" _|", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroQuatroDeveTerAtributosCorretos() {
		Numero numero = createNumero(4);
		Assert.assertEquals("   ", numero.getPrimeiraLinha());
		Assert.assertEquals("|_|", numero.getSegundaLinha());
		Assert.assertEquals("  |", numero.getTerceiraLinha());
	}

	@Test
	public void numeroCincoDeveTerAtributosCorretos() {
		Numero numero = createNumero(5);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals("|_ ", numero.getSegundaLinha());
		Assert.assertEquals(" _|", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroSeisDeveTerAtributosCorretos() {
		Numero numero = createNumero(6);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals("|_ ", numero.getSegundaLinha());
		Assert.assertEquals("|_|", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroSeteDeveTerAtributosCorretos() {
		Numero numero = createNumero(7);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals("  |", numero.getSegundaLinha());
		Assert.assertEquals("  |", numero.getTerceiraLinha());
	}
	
	@Test
	public void numeroOitoDeveTerAtributosCorretos() {
		Numero numero = createNumero(8);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals("|_|", numero.getSegundaLinha());
		Assert.assertEquals("|_|", numero.getTerceiraLinha());
	}

	@Test
	public void numeroNoveDeveTerAtributosCorretos() {
		Numero numero = createNumero(9);
		Assert.assertEquals(" _ ", numero.getPrimeiraLinha());
		Assert.assertEquals("|_|", numero.getSegundaLinha());
		Assert.assertEquals(" _|", numero.getTerceiraLinha());
	}

	@Test
	public void numeroZeroDeveTerAtributosCorretos() {
		Numero numero = createNumero(0);
		assertEquals(" _ ", numero.getPrimeiraLinha());
		assertEquals("| |", numero.getSegundaLinha());
		assertEquals("|_|", numero.getTerceiraLinha());
	}
	
	private Numero createNumero(int numero) {
		EsqueletoNumero esqueleto = EsqueletoNumero.forNumero(numero);
		return new Numero(numero, esqueleto.getLinhas());
	}

}
