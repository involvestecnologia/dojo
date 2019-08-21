package br.com.involves.dojo.leitorcelular;

import static java.util.Optional.empty;

import java.util.Optional;

public class Converter {

	public String converte(String entrada) {
		StringBuilder resp = new StringBuilder();
		String[] digitos = entrada.split("");
		int index = 0;

		if("".equals(entrada.trim()))
			return "";
		
		if (digitos.length == 1) {
			Teclado tecla = Teclado.value(entrada);
			resp.append(tecla.getTeclado().get(index));
			return resp.toString();
		}

		for (int i = 0; i < digitos.length; ++i) {
			int next = i+1;
			
			if(digitos.length - 1 == i) {
				if (digitos[i - 1].equals(digitos[i])) {
					String numero = digitos[i];
					Teclado tecla = Teclado.value(numero);
					resp.append(tecla.getTeclado().get(index));
				} else {
					String numero = digitos[i];
					Teclado tecla = Teclado.value(numero);
					resp.append(tecla.getTeclado().get(0));
				}
				break;
			}
			
			if(digitos[next].equals(digitos[i])) {
				++index;
			} else {
				String numero = digitos[i];
				Teclado tecla = Teclado.value(numero);
				resp.append(tecla.getTeclado().get(index));
				index = 0;
			} 
//			
//			anterior = Optional.of(digito);
		}

		return resp.toString();
	}

	private String converteUmDigito(String entrada) {
		switch (entrada) {
		case "2":
			return "A";
		case "22":
			return "B";
		case "3":
			return "D";
		case "0":
			return " ";
		default:
			return "";
		}
	}

}
