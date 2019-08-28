const { assert } = require('chai');
const comparador = require('./comparaMaosDePoker');

suite('Comparação mãos de poker', () => {
  describe('Compara apenas uma carta', () => {
    it('Compara 2E com 3C', () => {
      const vencedor = comparador.compara(['2E'], ['3C']);
      assert.deepEqual(vencedor, { name: 'white', play: 'HIGHER_CARD' });
    });
    it('Compara 3C com 2E', () => {
      const vencedor = comparador.compara(['3C'], ['2E']);
      assert.deepEqual(vencedor, { name: 'black', play: 'HIGHER_CARD' });
    });
    it('Compara 3C com 3E', () => {
      const vencedor = comparador.compara(['3C'], ['3E']);
      assert.deepEqual(vencedor, { name: 'tie' });
    });
  });
  describe('Compara duas cartas', () => {
    it('Uma mão vence por dupla', () => {
      const vencedor = comparador.compara(['2E', '2O'], ['3C', '3P']);
      assert.deepEqual(vencedor, { name: 'white', play: 'PAIR' });
    });

    it('Uma mão vence por dupla e a outra perde sem dupla', () => {
      const vencedor = comparador.compara(['2E', '2O'], ['4C', '3P']);
      assert.deepEqual(vencedor, { name: 'black', play: 'PAIR' });
    });

    it('Verificar desempate por não existir duplas', () => {
      const vencedor = comparador.compara(['2E', '5O'], ['4C', '3P']);
      assert.deepEqual(vencedor, { name: 'black', play: 'HIGHER_CARD' });
    });
  });
});
