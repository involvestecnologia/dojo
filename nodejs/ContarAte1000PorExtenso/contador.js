const numeroPorExtenso = require('./numeroPorExtenso');


const contadorazinha = () => {
  let contador = '';

  for (let i = 0; i <= 1000; i++) {
    contador += numeroPorExtenso(i);
  }

  console.log(contador);
  console.log(contador.length);
};

module.exports = contadorazinha();
