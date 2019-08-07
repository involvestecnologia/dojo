package impressornumeroslcd;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;

public class ImpressorTest {
	
	private Impressor impressor = new Impressor();

	@Test
	public void deveImprimirUm() {
		String numeroImpresso = impressor.imprime(1);
		String[] linhas = EsqueletoNumero.UM.getLinhas();
		String impressao = Stream.of(linhas).collect(joining("\n"));
		
		assertEquals(impressao, numeroImpresso);
	}

	@Test
	public void deveImprimirUmDois() {
		String numeroImpresso = impressor.imprime(12);
		
		String impressao = Stream.of(EsqueletoNumero.UM.getLinhas()[0], EsqueletoNumero.DOIS.getLinhas()[0], "\n", 
				EsqueletoNumero.UM.getLinhas()[1], EsqueletoNumero.DOIS.getLinhas()[1], "\n",
				EsqueletoNumero.UM.getLinhas()[2], EsqueletoNumero.DOIS.getLinhas()[2]
				).collect(joining(""));
		
		System.out.println(numeroImpresso);
		assertEquals(impressao, numeroImpresso);
	}
	
	@Test
	public void deveImprimirOitocentosETrintaEQuatro() {
		String numeroImpresso = impressor.imprime(834);
		
		String impressao = Stream.of(
				EsqueletoNumero.OITO.getLinhas()[0], EsqueletoNumero.TRES.getLinhas()[0], EsqueletoNumero.QUATRO.getLinhas()[0], "\n",
				EsqueletoNumero.OITO.getLinhas()[1], EsqueletoNumero.TRES.getLinhas()[1], EsqueletoNumero.QUATRO.getLinhas()[1], "\n",
				EsqueletoNumero.OITO.getLinhas()[2], EsqueletoNumero.TRES.getLinhas()[2], EsqueletoNumero.QUATRO.getLinhas()[2])
				.collect(joining(""));
		
		System.out.println(numeroImpresso);
		assertEquals(impressao, numeroImpresso);
	}

}
