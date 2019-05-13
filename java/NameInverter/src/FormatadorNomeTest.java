import org.junit.Assert;
import org.junit.Test;

public class FormatadorNomeTest {

	private FormatadorNome formatadorNome = new FormatadorNome();

	@Test(expected = IllegalArgumentException.class)
	public void entradaInvalida() {
		String entrada = "";

		formatadorNome.formata(entrada);
	}

	@Test(expected = IllegalArgumentException.class)
	public void entradaNomeInvalido() {
		String entrada = "Diogo";
		formatadorNome.formata(entrada);
	}

	@Test
	public void entradaValida() {
		String entrada = "Diogo Viana";
		String nomeFormatado = formatadorNome.formata(entrada);
		Assert.assertEquals("Viana, Diogo", nomeFormatado);
	}

	@Test
	public void recebeFernandoVasconcellos_RetornaFormal() {
		Assert.assertEquals("Vasconcellos, Fernando", formatadorNome.formata("Fernando Vasconcellos"));
	}
	
	@Test
	public void recebeNomeComPrefixo(){
		Assert.assertEquals("Vasconcellos, Fernando", formatadorNome.formata("Sr. Fernando Vasconcellos"));
	}
	
	@Test
	public void recebeNomeComSufixo(){
		Assert.assertEquals("Vasconcellos, Fernando III", formatadorNome.formata("Sr. Fernando Vasconcellos III"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void recebeNomeMaiorQue2Sobrenomes(){
		String entrada = "Sr. Fernando Vasconcellos Silveira III";		
		formatadorNome.formata(entrada);
	}
	
}
