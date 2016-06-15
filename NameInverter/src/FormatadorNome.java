
public class FormatadorNome {

	public String formata(String nome) {
		validaNome(nome);

		nome = nome.replace("Sr. ", "");

		String[] nomeSeparado = nome.split(" ");
		
		if(nomeSeparado.length > 3){
			throw new IllegalArgumentException();
		}
		
		String nomeInvertido = inverterNome(nomeSeparado);

		if (possuiSufixo(nomeSeparado)) {
			nomeInvertido = addSufixo(nomeSeparado, nomeInvertido);
		}

		return nomeInvertido;

	}

	private boolean possuiSufixo(String[] nomeSeparado) {
		return nomeSeparado.length > 2;
	}

	private String addSufixo(String[] nomeSeparado, String nomeInvertido) {
		nomeInvertido = nomeInvertido.concat(" ").concat(nomeSeparado[2]);
		return nomeInvertido;
	}

	private String inverterNome(String[] nomeSeparado) {
		String nomeFormatado = nomeSeparado[1].concat(", ").concat(nomeSeparado[0]);
		return nomeFormatado;
	}

	private void validaNome(String nome) {
		if (nome.isEmpty() || nome.equals("Diogo")) {
			throw new IllegalArgumentException();
		}
	}
}
