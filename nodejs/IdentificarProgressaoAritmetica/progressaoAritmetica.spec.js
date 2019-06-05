const { assert, expect } = require('chai');
const progressaoAritmetica = require('./progressaoAritmetica');

suite('Identificando Progressão Aritmética em um conjunto de números', () => {
  describe('Tratamento do conjunto de entrada', () => {
    it('Conjunto deve ser um array', () => {
      assert.throws(() => progressaoAritmetica.identificarSubconjuntos('teste'), Error);
    });

    it('Conjunto deve possuir 3 ou mais números', () => {
      assert.throws(() => progressaoAritmetica.identificarSubconjuntos([1, 2]), Error);
    });

    it('Conjunto deve ter apenas numeros', () => {
      assert.throws(() => progressaoAritmetica.identificarSubconjuntos([1, 3, 5, 'A']), Error);
    });

    it('Conjunto deve ter apenas numeros positivos', () => {
      assert.throws(() => progressaoAritmetica.identificarSubconjuntos([1, 3, 5, -2]), Error);
    });
  });

  describe('Identificacao de razoes', () => {
    it('Retorna todas as razoes do conjunto [1,2,3]', () => {
      expect(progressaoAritmetica.identificaRazoes([1, 2, 3])).to.eql([1, 2]);
    });
  });
});
