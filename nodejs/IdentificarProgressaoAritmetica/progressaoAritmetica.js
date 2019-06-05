const _ = require('lodash');

const identificarSubconjuntos = (conjunto) => {
  checkIfIsArray(conjunto);
  checkIfLengthIsGreaterThan3(conjunto);
  checkSetContainsOnlyValidNumbers(conjunto);
  conjunto = sort(conjunto);
};

const identificaRazoes = (conjunto) => {

};

const sort = conjunto => _.sortBy(conjunto);

const checkIfIsArray = (conjunto) => {
  if (!Array.isArray(conjunto)) {
    throw new Error('Conjunto deve ser um array');
  }
};
const checkIfLengthIsGreaterThan3 = (conjunto) => {
  if (conjunto.length < 3) {
    throw new Error('Conjunto deve conter no mínimo 3 números inteiros.');
  }
};
const checkSetContainsOnlyValidNumbers = (conjunto) => {
  conjunto.forEach((numero) => {
    if (isNaN(numero)) {
      throw new Error('Conjunto deve conter apenas números');
    }

    if (numero < 0) {
      throw new Error('Conjunto deve conter apenas números positivos');
    }
  });
};

module.exports = {
  identificarSubconjuntos,
  identificaRazoes,
};
