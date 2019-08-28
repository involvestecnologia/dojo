const Carta = require('./carta');
const Mao = require('./mao');

function compara(black, white) {
  if (black.length >= 2) {
    return comparaDuasCartas(
      new Mao(black.map(carta => new Carta(...carta.split('')))),
      new Mao(white.map(carta => new Carta(...carta.split('')))),
    );
  }
  const cartaB = new Carta(...black[0].split(''));
  const cartaW = new Carta(...white[0].split(''));
  return comparaUmaCarta(cartaB, cartaW);
}

function comparaDuasCartas(maoB, maoW) {
  if (maoB.temDupla() && maoW.temDupla()) {
    return {
      ...comparaUmaCarta(maoB.cartas[0], maoW.cartas[0]),
      play: 'PAIR',
    };
  } else if (maoB.temDupla()) {
    return {
      name: 'black',
      play: 'PAIR',
    };
  } else if (maoW.temDupla()) {
    return {
      name: 'white',
      play: 'PAIR',
    };
  }
  return comparaUmaCarta(maoB.maiorCarta(), maoW.maiorCarta());
}

function comparaUmaCarta(cartaB, cartaW) {
  const winner = {};
  if (cartaB.maiorQue(cartaW)) {
    winner.name = 'black';
    winner.play = 'HIGHER_CARD';
  } else if (cartaW.maiorQue(cartaB)) {
    winner.name = 'white';
    winner.play = 'HIGHER_CARD';
  } else {
    winner.name = 'tie';
  }
  return winner;
}

module.exports = {
  compara,
};
