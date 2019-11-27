package br.com.involves.intervalos;

public class IdentificadorIntervalo {

	public String retornaIntervalos(int... numeros) {
		StringBuilder intervalos = new StringBuilder();
		intervalos.append("[");
		if (numeros.length <= 2) {
			intervalos.append(formataIntervalo(numeros));
		} else {
			int inicial = numeros[0];
			for (int pos = 0; pos < (numeros.length - 1); pos++) {
				if (numeros[pos] - numeros[pos + 1] != -1) {
					if(inicial == numeros[pos]) {
						intervalos.append(formataIntervalo(inicial));
					}else {
						intervalos.append(formataIntervalo(inicial, numeros[pos]));
					}
					intervalos.append(",");
					inicial = numeros[pos + 1];
				}
			}
			if(inicial == numeros[numeros.length -1 ])
				intervalos.append(formataIntervalo(numeros[numeros.length -1]));
			else
				intervalos.append(formataIntervalo(inicial, numeros[numeros.length -1]));	
		}

		return intervalos.append("]").toString();
	}

	private String formataIntervalo(int... numeros) {
		if (numeros.length == 1) {
			return String.format("[%d]", numeros[0]);
		}
		return String.format("[%d-%d]", numeros[0], numeros[numeros.length - 1]);
	}

}
