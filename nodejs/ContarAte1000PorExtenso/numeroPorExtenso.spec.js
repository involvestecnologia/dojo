const { assert } = require('chai');
const numeroPorExtenso = require('./numeroPorExtenso');

suite('Coding dojo', () => {
  describe('Teste de unidades', () => {
    it('deve identificar se a casa de unidade eh zero', () => {
      const zero = 0;
      assert.equal(numeroPorExtenso(zero), 'zero');
    });

    it('deve identificar se a casa de unidade eh um', () => {
      const um = 1;
      assert.equal(numeroPorExtenso(um), 'um');
    });

    it('deve identificar se a casa de unidade eh dois', () => {
      const dois = 2;
      assert.equal(numeroPorExtenso(dois), 'dois');
    });

    it('deve identificar se a casa de unidade eh tres', () => {
      const tres = 3;
      assert.equal(numeroPorExtenso(tres), 'tres');
    });

    it('deve identificar se a casa de unidade eh quatro', () => {
      const quatro = 4;
      assert.equal(numeroPorExtenso(quatro), 'quatro');
    });

    it('deve identificar se a casa de unidade eh cinco', () => {
      const cinco = 5;
      assert.equal(numeroPorExtenso(cinco), 'cinco');
    });

    it('deve identificar se a casa de unidade eh seis', () => {
      const seis = 6;
      assert.equal(numeroPorExtenso(seis), 'seis');
    });

    it('deve identificar se a casa de unidade eh sete', () => {
      const sete = 7;
      assert.equal(numeroPorExtenso(sete), 'sete');
    });

    it('deve identificar se a casa de unidade eh oito', () => {
      const oito = 8;
      assert.equal(numeroPorExtenso(oito), 'oito');
    });

    it('deve identificar se a casa de unidade eh nove', () => {
      const nove = 9;
      assert.equal(numeroPorExtenso(nove), 'nove');
    });
  });

  describe('Teste de dezenas', () => {
    it('deve identificar se a casa de dezena eh dez', () => {
      assert.equal(numeroPorExtenso(10), 'dez');
    });

    it('deve identificar se a casa de dezena eh onze', () => {
      assert.equal(numeroPorExtenso(11), 'onze');
    });

    it('deve identificar se a casa de dezena eh doze', () => {
      assert.equal(numeroPorExtenso(12), 'doze');
    });

    it('deve identificar se a casa de dezena eh treze', () => {
      assert.equal(numeroPorExtenso(13), 'treze');
    });

    it('deve identificar se a casa de dezena eh quatorze', () => {
      assert.equal(numeroPorExtenso(14), 'quatorze');
    });

    it('deve identificar se a casa de dezena eh quinze', () => {
      assert.equal(numeroPorExtenso(15), 'quinze');
    });

    it('deve identificar se a casa de dezena eh dezesseis', () => {
      assert.equal(numeroPorExtenso(16), 'dezesseis');
    });

    it('deve identificar se a casa de dezena eh dezessete', () => {
      assert.equal(numeroPorExtenso(17), 'dezessete');
    });

    it('deve identificar se a casa de dezena eh dezoito', () => {
      assert.equal(numeroPorExtenso(18), 'dezoito');
    });

    it('deve identificar se a casa de dezena eh dezenove', () => {
      assert.equal(numeroPorExtenso(19), 'dezenove');
    });

    it('deve identificar se a casa de dezena eh vinte', () => {
      assert.equal(numeroPorExtenso(20), 'vinte');
    });

    it('deve identificar se a casa de dezena eh trinta', () => {
      assert.equal(numeroPorExtenso(30), 'trinta');
    });

    it('deve identificar se a casa de dezena eh quarenta', () => {
      assert.equal(numeroPorExtenso(40), 'quarenta');
    });

    it('deve identificar se a casa de dezena eh cinquenta', () => {
      assert.equal(numeroPorExtenso(50), 'cinquenta');
    });

    it('deve identificar se a casa de dezena eh sessenta', () => {
      assert.equal(numeroPorExtenso(60), 'sessenta');
    });

    it('deve identificar se a casa de dezena eh setenta', () => {
      assert.equal(numeroPorExtenso(70), 'setenta');
    });

    it('deve identificar se a casa de dezena eh oitenta', () => {
      assert.equal(numeroPorExtenso(80), 'oitenta');
    });

    it('deve identificar se a casa de dezena eh noventa', () => {
      assert.equal(numeroPorExtenso(90), 'noventa');
    });
  });

  describe('Testes de combinação de dezenas com unidades', () => {
    it('deve concatenar dezena e unidade corretamente (21)', () => {
      assert.equal(numeroPorExtenso(21), 'vinteeum');
    });

    it('deve concatenar dezena e unidade corretamente (99)', () => {
      assert.equal(numeroPorExtenso(99), 'noventaenove');
    });
  });

  describe('Testes de centenas', () => {
    it('deve identificar se a casa de centena eh cem', () => {
      assert.equal(numeroPorExtenso(100), 'cem');
    });

    it('deve identificar se a casa de centena eh duzentos', () => {
      assert.equal(numeroPorExtenso(200), 'duzentos');
    });

    it('deve identificar se a casa de centena eh trezentos', () => {
      assert.equal(numeroPorExtenso(300), 'trezentos');
    });

    it('deve identificar se a casa de centena eh quatrocentos', () => {
      assert.equal(numeroPorExtenso(400), 'quatrocentos');
    });

    it('deve identificar se a casa de centena eh quinhentos', () => {
      assert.equal(numeroPorExtenso(500), 'quinhentos');
    });

    it('deve identificar se a casa de centena eh seiscentos', () => {
      assert.equal(numeroPorExtenso(600), 'seiscentos');
    });

    it('deve identificar se a casa de centena eh setecentos', () => {
      assert.equal(numeroPorExtenso(700), 'setecentos');
    });

    it('deve identificar se a casa de centena eh oitocentos', () => {
      assert.equal(numeroPorExtenso(800), 'oitocentos');
    });

    it('deve identificar se a casa de centena eh novecentos', () => {
      assert.equal(numeroPorExtenso(900), 'novecentos');
    });
  });

  describe('Teste de combinação com centenas, dezenas e unidades', () => {
    it('deve concatenar centena e unidade corretamente', () => {
      assert.equal(numeroPorExtenso(101), 'centoeum');
      assert.equal(numeroPorExtenso(202), 'duzentosedois');
      assert.equal(numeroPorExtenso(505), 'quinhentosecinco');
    });

    it('deve concatenar centena e dezena corretamente', () => {
      assert.equal(numeroPorExtenso(110), 'centoedez');
      assert.equal(numeroPorExtenso(220), 'duzentosevinte');
      assert.equal(numeroPorExtenso(550), 'quinhentosecinquenta');
    });

    it('deve concatenar centena, dezena e unidade corretamente', () => {
      assert.equal(numeroPorExtenso(111), 'centoeonze');
      assert.equal(numeroPorExtenso(222), 'duzentosevinteedois');
      assert.equal(numeroPorExtenso(555), 'quinhentosecinquentaecinco');
    });
  });

  describe('Testa o numero 1000', () => {
    it('deve identificar o numero 1000', () => {
      assert.equal(numeroPorExtenso(1000), 'mil');
    });
  });
});

