package br.com.agilebr.code;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

public class CadastroOperadoraTest {

	private CadastroOperadora cadastroOperadora;
	@Mock
	private ServicoLegado servicoLegado;
	@Captor
	private ArgumentCaptor<Operadora> operadoraCaptor;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
		cadastroOperadora = new CadastroOperadora(servicoLegado);
	}

	@Test
	public void deveSerCobradoApenasTaxaAdesaoQuandoPossuirPlanoAnuidadeParaVisa() {
		cadastroOperadora.cadastrarVisa(new OperadoraVisa(true));
		verify(servicoLegado, atLeastOnce()).cadastrarOperadora(operadoraCaptor.capture());

		assertEquals(new BigDecimal(5.5), operadoraCaptor.getValue().getTaxaPagamento());
	}

	@Test
	public void deveSerCobradoTaxaAdesaoMaisAdicionalEmpresaQuandoNaoPossuirPlanoAnuidadeParaVisa() {
		cadastroOperadora.cadastrarVisa(new OperadoraVisa(false));
		verify(servicoLegado, atLeastOnce()).cadastrarOperadora(operadoraCaptor.capture());

		assertEquals(new BigDecimal("11.0"), operadoraCaptor.getValue().getTaxaPagamento());
	}

	@Test
	public void deveSerCobradoTaxaAdesaoQuandoNaoPossuirLiberacaoTaxaParaMaster() {
		cadastroOperadora.cadastrarMaster(new OperadoraMaster(false));
		verify(servicoLegado, atLeastOnce()).cadastrarOperadora(operadoraCaptor.capture());

		assertEquals(new BigDecimal("8.0"), operadoraCaptor.getValue().getTaxaPagamento());
	}

	@Test
	public void naoDeveSerCobradoTaxaAdesaoQuandoPossuirLiberacaoTaxaParaMaster() {
		cadastroOperadora.cadastrarMaster(new OperadoraMaster(true));
		verify(servicoLegado, atLeastOnce()).cadastrarOperadora(operadoraCaptor.capture());

		assertEquals(new BigDecimal(0), operadoraCaptor.getValue().getTaxaPagamento());
	}

	@Test
	public void americaTemQueSerTaxaOito() {
		cadastroOperadora.cadastrar(new OperadoraAmerica());
		verify(servicoLegado, atLeastOnce()).cadastrarOperadora(operadoraCaptor.capture());
	}

}
