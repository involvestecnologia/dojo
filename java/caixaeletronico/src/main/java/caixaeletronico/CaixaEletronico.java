package caixaeletronico;

import static java.lang.Math.floorMod;

public class CaixaEletronico {

	private static final int ZERO = 0;
	private static final int DEZ = 10;
	private static final int VINTE = 20;
	private static final int CINQUENTA = 50;
	private static final int CEM = 100;

	public Saque sacar(int entrada) {
		int cem = divideBy(entrada, CEM);
		int resto = mod(entrada, CEM);
		
		int cinquenta = divideBy(resto, CINQUENTA);
		resto = mod(resto, CINQUENTA);
		
		int vinte = divideBy(resto, VINTE);
		resto = mod(resto, VINTE);
		
		int dez = divideBy(resto, DEZ);
		
		validateResto(resto);
		
		return new Saque.Builder()
				.comNotasDeCem(cem)
				.comNotasDeCinquenta(cinquenta)
				.comNotasDeVinte(vinte)
				.comNotasDeDez(dez)
				.build();
	}

	private void validateResto(int resto) {
		if(mod(resto, DEZ) != ZERO) {
			throw new SaqueImpossivelException();
		}
	}

	private int mod(int entrada, int mod) {
		return floorMod(entrada, mod);
	}

	private int divideBy(int i, int by) {
		return i / by;
	}

}
