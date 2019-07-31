package com.dojo.conversao;

public class ConversorIndoArabicoRomano {

	public String converte(int i) throws EntradaInvalida {

		switch (i) {
		case 1:
			return "I";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 9:
			return "IX";
		case 10:
			return "X";
		case 40: 
			return "XL";
		case 50:
			return "L";
		case 90:
			return "XC";
		case 100:
			return "C";
		default:
			throw new EntradaInvalida();
		}
	}

	public String decompositor(int entrada) {
		if (entrada == 0)
			throw new EntradaInvalida();

		String saida = "";
		int[] numerosRomanos = { 100, 50, 10, 5, 1 };

		for (int numero : numerosRomanos) {
			while (entrada - numero >= 0) {
				saida += converte(numero);
				entrada -= numero;
			}
		}

		return saida;
	}
}
