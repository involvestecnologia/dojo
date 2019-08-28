class Carta {
  constructor(valor, naipe) {
    this.valor = valor;
    this.naipe = naipe;
  }

  maiorQue(outraCarta) {
    return this.valor > outraCarta.valor;
  }

  toString() {
    return this.valor + this.naipe;
  }
}

module.exports = Carta;
