package caixaeletronico;

import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {

	private void assertSaque(Saque saque, int cem, int cinquenta, int vinte, int dez) {
		Assert.assertEquals(cem, saque.getCem());
		Assert.assertEquals(cinquenta, saque.getCinquenta());
		Assert.assertEquals(vinte, saque.getVinte());
		Assert.assertEquals(dez, saque.getDez());
	}

	@Test
	public void seSacar100ReaisRecebeUmaNotaDe100() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(100);
		assertSaque(saque, 1, 0, 0, 0);
	}

	@Test
	public void seSacar50ReaisRecebeUmaNotaDe50() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(50);
		assertSaque(saque, 0, 1, 0, 0);
	}

	@Test
	public void seSacar20ReaisRecebeUmaNotaDe20() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(20);
		assertSaque(saque, 0, 0, 1, 0);
	}

	@Test
	public void seSacar10ReaisRecebeUmaNotaDe10() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(10);
		assertSaque(saque, 0, 0, 0, 1);
	}

	@Test
	public void seSacar200ReaisRecebeDuasNotasDe100() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(200);
		assertSaque(saque, 2, 0, 0, 0);
	}

	@Test
	public void seSacar150ReaisRecebeUmaNotaDe100EUmaDe50() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(150);
		assertSaque(saque, 1, 1, 0, 0);
	}

	@Test
	public void seSacar30ReaisRecebeUmaNotaDe20EUmaDe10() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(30);
		assertSaque(saque, 0, 0, 1, 1);
	}

	@Test
	public void seSacar80ReaisRecebeUmaNotaDe50UmaDe20EUmaDe10() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(80);
		assertSaque(saque, 0, 1, 1, 1);
	}

	@Test
	public void seSacar90ReaisRecebeUmaNotaDe50DuasDe20() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Saque saque = caixaEletronico.sacar(90);
		assertSaque(saque, 0, 1, 2, 0);
	}

	@Test(expected = SaqueImpossivelException.class)
	public void seSacar55ReaisDeveRetornarUmaExecao() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.sacar(55);
	}

}
