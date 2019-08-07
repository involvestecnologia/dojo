package impressornumeroslcd;

import static java.util.stream.Collectors.joining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Impressor {

	public String imprime(int numero) {
		List<EsqueletoNumero> esqueletos = new ArrayList<>();
		String[] str = String.valueOf(numero).split("");
		for (String s : str) {
			esqueletos.add(EsqueletoNumero.forNumero(Integer.parseInt(s)));
		}

		String primeiraLinha = "";
		String segundaLinha = "";
		String terceiraLinha = "";

		for (EsqueletoNumero esqueleto : esqueletos) {
			String[] linhas = esqueleto.getLinhas();
			primeiraLinha += linhas[0];
			segundaLinha += linhas[1];
			terceiraLinha += linhas[2];
		}

		return Stream.of(primeiraLinha, segundaLinha, terceiraLinha).collect(joining("\n"));
	}

}
