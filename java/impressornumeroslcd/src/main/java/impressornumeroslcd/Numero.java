package impressornumeroslcd;

public class Numero {

	private String primeiraLinha;
	private String segundaLinha;
	private String terceiraLinha;

	public Numero(int valor) {
		this.valor = valor;
	}

	public Numero(int valor, String[] linhas) {
		this(valor);
		this.primeiraLinha = linhas[0];
		this.segundaLinha = linhas[1];
		this.terceiraLinha = linhas[2];
	}

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPrimeiraLinha() {
		return primeiraLinha;
	}

	public String getSegundaLinha() {
		return segundaLinha;
	}

	public String getTerceiraLinha() {
		return terceiraLinha;
	}

}
