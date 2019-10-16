package br.com.involves.dojo.batalhanaval.utils;

import br.com.involves.dojo.batalhanaval.Coordenada;
import br.com.involves.dojo.batalhanaval.barcos.Navio;
import br.com.involves.dojo.batalhanaval.barcos.Navio.Orientacao;

public class NavioUtils {

	public static Navio constroiNavio(Navio navio, Orientacao orientacao, Coordenada coordenada) {
		navio.setCoordenadaInicial(coordenada);
		navio.setOrientacao(orientacao);
		navio.constroi();
		
		return navio;
	}

	public static Navio constroiNavio(Navio navio, Orientacao orientacao) {
		return constroiNavio(navio,orientacao,new Coordenada(0, 0));
	}
}
