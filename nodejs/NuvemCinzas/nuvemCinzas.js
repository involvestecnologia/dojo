let cidade;

const criaCidade = (n) => {
  cidade = [];
  for (let i = 0; i < n; i += 1) {
    cidade[i] = new Array(n).fill('.');
  }
  return cidade;
};

const posicionaAeroporto = (x, y) => {
  cidade[x][y] = 'A';
};

const getCidade = () => cidade;

const posicionaVulcaoAtivo = () => {
  cidade[0][0] = '*';
};

module.exports = {
  criaCidade,
  posicionaAeroporto,
  getCidade,
  posicionaVulcaoAtivo,
};
