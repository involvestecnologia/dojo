class Mao {
  constructor(cartas) {
    this.cartas = cartas;
    this.valores = this.cartas.map(carta => carta.valor);
  }

  maiorCarta() {
    return this.cartas[0].maiorQue(this.cartas[1]) ?
      this.cartas[0] : this.cartas[1];
  }

  temDupla() {
    return this.valores[0] === this.valores[1];
  }
}

module.exports = Mao;
