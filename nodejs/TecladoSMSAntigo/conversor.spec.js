const { assert } = require('chai');

const { convert } = require('./conversor');

suite('Conversor de teclado SMS antigo', () => {
  describe('Conversor de letras', () => {
    it('deve converter a letra "A" para "2"', () => {
      const sequencia = convert('A');
      assert.equal(sequencia, '2');
    });
    it('deve converter a letra "D" para "3"', () => {
      const sequencia = convert('D');
      assert.equal(sequencia, '3');
    });
    it('deve converter a letra "G" para "4"', () => {
      const sequencia = convert('G');
      assert.equal(sequencia, '4');
    });
    it('deve converter a letra "J" para "5"', () => {
      const sequencia = convert('J');
      assert.equal(sequencia, '5');
    });
    it('deve converter a letra "M" para "6"', () => {
      const sequencia = convert('M');
      assert.equal(sequencia, '6');
    });
    it('deve converter a letra "P" para "7"', () => {
      const sequencia = convert('P');
      assert.equal(sequencia, '7');
    });
    it('deve converter a letra "T" para "8"', () => {
      const sequencia = convert('T');
      assert.equal(sequencia, '8');
    });
    it('deve converter a letra "W" para "9"', () => {
      const sequencia = convert('W');
      assert.equal(sequencia, '9');
    });
    it('deve converter espaço  para "0"', () => {
      const sequencia = convert(' ');
      assert.equal(sequencia, '0');
    });
    it('deve converter a letra "B" para "22"', () => {
      const sequencia = convert('B');
      assert.equal(sequencia, '22');
    });
    it('deve converter a letra "C" para "222"', () => {
      const sequencia = convert('C');
      assert.equal(sequencia, '222');
    });
    it('deve converter a letra "E" para "33"', () => {
      const sequencia = convert('E');
      assert.equal(sequencia, '33');
    });
    it('deve converter a letra "I" para "444"', () => {
      const sequencia = convert('I');
      assert.equal(sequencia, '444');
    });
    it('deve converter a letra "S" para "7777"', () => {
      const sequencia = convert('S');
      assert.equal(sequencia, '7777');
    });
  });

  describe('Conversor de palavras em sequência de números.', () => {
    it('deve converter as letras "AD" para "23"', () => {
      const sequencia = convert('AD');
      assert.equal(sequencia, '23');
    });
    it('deve converter a palavra "BABA" para "22_2_22_2"', () => {
      const sequencia = convert('BABA');
      assert.equal(sequencia, '22_2_22_2');
    });
    it('deve converter a palavra "SEMPRE ACESSO O DOJOPUZZLES" para "77773367_7773302_222337777_777766606660366656667889999_9999555337777"', () => {
      const sequencia = convert('SEMPRE ACESSO O DOJOPUZZLES');
      assert.equal(sequencia, '77773367_7773302_222337777_777766606660366656667889999_9999555337777');
    });
  });
});
