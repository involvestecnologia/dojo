package dojo.puzzle.diamante;

import java.util.ArrayList;
import java.util.List;

public class ImprimeDiamante {

	public List<String> imprime(char letra) {
		int quantidadeLetras = letra - 'A' + 1;
		int espacosEmBrancoInicial = quantidadeLetras - 1;
		int espacosEmBrancoMeio = 1;
		
		List<String> diamante = new ArrayList<String>();
		
		for (char letraInicial = 'A'; letraInicial <= letra; letraInicial++) {
			if (letraInicial == 'A') {
				diamante.add(
						espacos(espacosEmBrancoInicial) + 
						letraInicial + 
						espacos(espacosEmBrancoInicial));
			} else if (letraInicial < letra) {
				diamante.add(
						espacos(espacosEmBrancoInicial) + 
						letraInicial + 
						espacos(espacosEmBrancoMeio) +
						letraInicial + 
						espacos(espacosEmBrancoInicial));
				
				espacosEmBrancoMeio += 2;
			} else {
				diamante.add(
						letraInicial + 
						espacos(espacosEmBrancoMeio) + 
						letraInicial);
				
				espacosEmBrancoMeio += 2;
			}
			
			espacosEmBrancoInicial -= 1;
		}

		for (int i = (diamante.size() - 2); i >= 0; i--) {
			diamante.add(diamante.get(i));
		}

		return diamante;
	}
	private String espacos(int quantidade) {
		String espacos = "";
		for (int i = 0; i < quantidade ; i++) {
			espacos += " ";
		}
		return espacos;
	}
	
}
