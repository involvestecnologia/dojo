package br.com.involves.dojo.leitorcelular;

import java.util.Arrays;
import java.util.List;

public enum Teclado {
	ZERO("0", Arrays.asList(" ")),
	DOIS("2", Arrays.asList("A","B","C")),
	TRES("3", Arrays.asList("D","E","F"));
	
	private String numero;
	private List<String> teclado;

	private Teclado (String numero, List < String > teclado) {
		this.numero = numero;
		this.teclado = teclado;
		
	}
	
	public List<String> getTeclado() {
		return teclado;
	}

	public static Teclado value(String numero) {
		for (Teclado value : values()) {
			if (value.numero.equals(numero)) {
				return value;
			}
		}
		return null;
	}

}
