package br.com.involves.dojo.roletaromana;

import java.util.ArrayList;
import java.util.List;

public class RoletaRomana {

    private List<Integer> pessoas = new ArrayList<Integer>();

    private int posicaoInicial;
    private int fator;

    public RoletaRomana(int numeroPessoas, int fator, int posicaoInicial) {
        this.posicaoInicial = posicaoInicial;
        this.fator = fator;
        for (int posicao = 0; posicao < numeroPessoas; posicao++) {
            pessoas.add(posicao + 1);
        }
    }

    public int posicaoVencedora() {
        int posicao = posicaoInicial;
        while (pessoas.size() > 1) {
            int posicaoRemocao = posicao + fator;

            if (posicaoRemocao > pessoas.size()) {
                posicaoRemocao = posicaoRemocao - pessoas.size();
            }

            pessoas.remove(posicaoRemocao -1);
            if(posicaoRemocao > pessoas.size()){
                posicaoRemocao = posicaoRemocao - pessoas.size();
            }
            posicao = posicaoRemocao ;
        }

        return pessoas.get(0);
    }
}
