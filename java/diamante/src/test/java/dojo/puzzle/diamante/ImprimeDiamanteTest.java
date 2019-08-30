package dojo.puzzle.diamante;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ImprimeDiamanteTest {

	@Test
	public void imprimeParaEntradaA() {
		ImprimeDiamante imprimeDiamante = new ImprimeDiamante();
		
		List<String> retorno = imprimeDiamante.imprime('A');

		Assert.assertEquals(Arrays.asList("A"), retorno);
	}

	@Test
	public void imprimeParaEntradaB() {
		ImprimeDiamante imprimeDiamante = new ImprimeDiamante();
		
		List<String> retorno = imprimeDiamante.imprime('B');

		Assert.assertEquals(Arrays.asList(" A ", "B B", " A "), retorno);
	}
	
	@Test
	public void imprimeParaEntradaC() {
		ImprimeDiamante imprimeDiamante = new ImprimeDiamante();
		
		List<String> retorno = imprimeDiamante.imprime('C');
		
		Assert.assertEquals(Arrays.asList("  A  ", " B B ","C   C", " B B ", "  A  "), retorno);
	}
	
	@Test
	public void imprimeParaEntradaD() {
		ImprimeDiamante imprimeDiamante = new ImprimeDiamante();
		
		List<String> retorno = imprimeDiamante.imprime('D');
		
		Assert.assertEquals(Arrays.asList(
				"   A   ", 
				"  B B  ",
				" C   C ", 
				"D     D", 
				" C   C ", 
				"  B B  ", 
				"   A   "), retorno);
	}

}
