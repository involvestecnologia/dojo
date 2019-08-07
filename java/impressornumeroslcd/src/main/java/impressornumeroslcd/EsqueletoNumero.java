package impressornumeroslcd;

public enum EsqueletoNumero {

	UM(1,
			"   ",
			"  |",
			"  |"),
	DOIS(2,
			" _ ",
			" _|",
			"|_ "),
	TRES(3,
			" _ ",
			" _|",
			" _|"),
	QUATRO(4,
			"   ",
			"|_|",
			"  |"),
	CINCO(5,
			" _ ",
			"|_ ",
			" _|"),
	SEIS(6,
			" _ ",
			"|_ ",
			"|_|"),
	SETE(7,
			" _ ",
			"  |",
			"  |"),
	OITO(8,
			" _ ",
			"|_|",
			"|_|"),
	NOVE(9,
			" _ ",
			"|_|",
			" _|"),
	ZERO(0,
			" _ ",
			"| |",
			"|_|");

	private int valor;
	private String primeiraLinha;
	private String segundaLinha;
	private String terceiraLinha;

	private EsqueletoNumero(int valor, String primeiraLinha, String segundaLinha, String terceiraLinha) {
		this.valor = valor;
		this.primeiraLinha = primeiraLinha;
		this.segundaLinha = segundaLinha;
		this.terceiraLinha = terceiraLinha;

	}

	public static EsqueletoNumero forNumero(int numero) {
		for (EsqueletoNumero esqueleto : values()) {
			if (esqueleto.valor == numero) {
				return esqueleto;
			}
		}
		return null;
	}

	public String[] getLinhas() {
		return new String[] { primeiraLinha, segundaLinha, terceiraLinha };
	}

}
