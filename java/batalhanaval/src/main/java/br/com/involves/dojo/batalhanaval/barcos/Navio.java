package br.com.involves.dojo.batalhanaval.barcos;

public abstract class Navio {
	private int tamanho;
	private int x;
	private int y;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
