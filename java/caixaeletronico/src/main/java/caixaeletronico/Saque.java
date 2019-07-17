package caixaeletronico;

public class Saque {

	private int dez;
	private int vinte;
	private int cinquenta;
	private int cem;

	public int getDez() {
		return dez;
	}

	public void setDez(int dez) {
		this.dez = dez;
	}

	public int getVinte() {
		return vinte;
	}

	public void setVinte(int vinte) {
		this.vinte = vinte;
	}

	public int getCinquenta() {
		return cinquenta;
	}

	public void setCinquenta(int cinquenta) {
		this.cinquenta = cinquenta;
	}

	public int getCem() {
		return cem;
	}

	public void setCem(int cem) {
		this.cem = cem;
	}

	public static class Builder{
		
		private Saque saque = new Saque();
		
		public Builder comNotasDeCem(int cem) {
			saque.setCem(cem);
			return this;
		}
		
		public Builder comNotasDeCinquenta(int cinquenta) {
			saque.setCinquenta(cinquenta);
			return this;
		}
		
		public Builder comNotasDeVinte(int vinte) {
			saque.setVinte(vinte);
			return this;
		}
		
		public Builder comNotasDeDez(int dez) {
			saque.setDez(dez);
			return this;
		}
		
		public Saque build() {
			return saque;
		}
		
	}
	
}
