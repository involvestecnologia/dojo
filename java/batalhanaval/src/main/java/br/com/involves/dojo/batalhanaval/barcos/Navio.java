package br.com.involves.dojo.batalhanaval.barcos;

import static br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao.HORIZONTAL;
import static br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao.VERTICAL;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.dojo.batalhanaval.Coordenada;

public abstract class Navio {
	private int tamanho;
	private int x;
	private int y;
	private List<Coordenada> coordenadas = new ArrayList<>();
	private Orientacao orientacao;

	public enum Orientacao {
		VERTICAL, HORIZONTAL
	}

	public Navio(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public List<Coordenada> getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoordenadaInicial(Coordenada coordenada) {
		this.coordenadas.add(coordenada);
	}

	public Orientacao getOrientacao() {
		return orientacao;
	}
	
	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}

	public void constroi() {
		Coordenada coordenadaInicial = coordenadas.get(0);
		int x = coordenadaInicial.getX();
		int y = coordenadaInicial.getY();
		if (VERTICAL.equals(this.orientacao)) {
			for (int tam = 1; tam < tamanho; tam++) {
				coordenadas.add(new Coordenada(x, ++y));
			}
		} else if (HORIZONTAL.equals(this.orientacao)) {
			for (int tam = 1; tam < tamanho; tam++) {
				coordenadas.add(new Coordenada(++x, y));
			}
		}
	}
}
