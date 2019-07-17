const { assert } = require('chai');
const nuvemCinzas = require('./nuvemCinzas');

suite('Coding dojo', () => {
  describe('Teste criação de cidades', () => {
    it('Cria cidade 1x1', () => {
      const cidade = nuvemCinzas.criaCidade(1);
      assert.deepEqual(cidade, [
        ['.'],
      ]);
    });
    it('Cria cidade 2x2', () => {
      const cidade = nuvemCinzas.criaCidade(2);
      assert.deepEqual(cidade, [
        ['.', '.'],
        ['.', '.'],
      ]);
    });
  });

  describe('Teste posicionar aeroportos', () => {
    it('Deve posicionar um aeroporto numa cidade 1x1', () => {
      nuvemCinzas.criaCidade(1);
      nuvemCinzas.posicionaAeroporto(0, 0);
      assert.deepEqual(nuvemCinzas.getCidade(), [
        ['A'],
      ]);
    });

    it('Deve posicionar um aeroporto em uma cidade 2x2', () => {
      nuvemCinzas.criaCidade(2);
      nuvemCinzas.posicionaAeroporto(0, 1);
      assert.deepEqual(
        nuvemCinzas.getCidade(),
        [
          ['.', 'A'],
          ['.', '.'],
        ],
      );
    });
  });

  describe('Teste posicionar nuvem cinza', () => {
    it('Deve começar na posição 0x0', () => {
      nuvemCinzas.criaCidade(2);
      nuvemCinzas.posicionaVulcaoAtivo();
      assert.deepEqual(
        nuvemCinzas.getCidade(),
        [
          ['*', '.'],
          ['.', '.'],
        ],
      );
    });
  });
});
