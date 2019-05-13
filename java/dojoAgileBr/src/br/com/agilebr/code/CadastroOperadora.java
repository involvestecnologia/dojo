package br.com.agilebr.code;

public class CadastroOperadora {

	private ServicoLegado servicoLegado;

	public CadastroOperadora(ServicoLegado servicoLegado) {
		this.servicoLegado = servicoLegado;
	}

	@Deprecated
	public void cadastrarVisa(Operadora visa) {
		cadastrar(visa);
	}

	@Deprecated
	public void cadastrarMaster(Operadora master) {
		cadastrar(master);
	}

	public void cadastrar(Operadora operadora) {
		servicoLegado.cadastrarOperadora(operadora);
	}

}
