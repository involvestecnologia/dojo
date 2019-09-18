package br.com.involves.dojo.roletaromana;

import org.junit.Assert;
import org.junit.Test;

public class RoletaRomanaTest {

    @Test
    public void umaRoletaRomanaComUmaPessoaVence() {
        RoletaRomana roleta = new RoletaRomana(1, 1, 1);

        Assert.assertEquals(1, roleta.posicaoVencedora());
    }

    @Test
    public void comDuasPessoaFatorDoisPosicaoInicialUmVenceAPosicaoDois() {
        RoletaRomana roleta = new RoletaRomana(2, 2, 1);

        Assert.assertEquals(2, roleta.posicaoVencedora());
    }

    @Test
    public void comDuasPessoaFatorDoisPosicaoInicialUmVenceAposicaoUm() {
        RoletaRomana roleta = new RoletaRomana(2, 2, 2);

        Assert.assertEquals(1, roleta.posicaoVencedora());
    }

    @Test
    public void comCincoPessoaFatorDoisPosicaoInicialUmVenceAposicaoQuatro() {
        RoletaRomana roleta = new RoletaRomana(5, 2, 1);

        int posicaoVencedora = 4;

        Assert.assertEquals(posicaoVencedora, roleta.posicaoVencedora());
    }

    @Test
    public void comCincoPessoaFatorDoisPosicaoInicialDoisVenceAposicaoQuatro() {
        RoletaRomana roleta = new RoletaRomana(5, 2, 2);

        int posicaoVencedora = 5;

        Assert.assertEquals(posicaoVencedora, roleta.posicaoVencedora());
    }

    @Test
    public void comDezPessoaFatorTresPosicaoInicialUmVenceAposicaoCinco() {
        RoletaRomana roleta = new RoletaRomana(10, 3, 1);

        int posicaoVencedora = 5;

        Assert.assertEquals(posicaoVencedora, roleta.posicaoVencedora());
    }

    @Test
    public void comDezoitoPessoaFatorTresPosicaoInicialUmVenceAposicaoNove() {
        RoletaRomana roleta = new RoletaRomana(18, 3, 1);

        int posicaoVencedora = 9;

        Assert.assertEquals(posicaoVencedora, roleta.posicaoVencedora());
    }

}
