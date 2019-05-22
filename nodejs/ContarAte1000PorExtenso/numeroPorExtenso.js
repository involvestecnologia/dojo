const unidadePorExtenso = function (numero) {
    switch (numero) {
        case 0:
            return "zero";

        case 1:
            return "um";

        case 2:
            return 'dois';

        case 3:
            return 'tres';

        case 4:
            return 'quatro';

        case 5:
            return 'cinco';

        case 6:
            return 'seis';

        case 7:
            return 'sete';

        case 8:
            return 'oito';

        case 9:
            return 'nove';

        default:
            return '';
    }

}

const dezenaPorExtenso = (numero) => {
    switch (numero) {
        case 10:
            return 'dez';

        case 11:
            return 'onze';

        case 12:
            return 'doze';

        case 13:
            return 'treze';

        case 14:
            return 'quatorze';

        case 15:
            return 'quinze';

        case 16:
            return 'dezesseis';

        case 17:
            return 'dezessete';

        case 18:
            return 'dezoito';

        case 19:
            return 'dezenove';

        default:
    }
}

const dezenasRegularesPorExtenso = (numero) => {
    switch (numero) {
        case 2:
            return 'vinte';

        case 3:
            return 'trinta';

        case 4:
            return 'quarenta';

        case 5:
            return 'cinquenta';

        case 6:
            return 'sessenta';

        case 7:
            return 'setenta';

        case 8:
            return 'oitenta';

        case 9:
            return 'noventa';
    }
}

const centenasPorExtenso = (numero) => {
    switch (numero) {
        case 1:
            return 'cento';

        case 2:
            return 'duzentos';

        case 3:
            return 'trezentos';

        case 4:
            return 'quatrocentos';

        case 5:
            return 'quinhentos';

        case 6:
            return 'seiscentos';

        case 7:
            return 'setecentos';

        case 8:
            return 'oitocentos';

        case 9:
            return 'novecentos';
    }
};

const trataDezena = numero => {
    if (numero >= 10 && numero < 20) {
        return dezenaPorExtenso(numero);
    }

    let numeroStr = numero.toString();
    let numeroArr = numeroStr.split('').map(n => parseInt(n));
    let dezena = numeroArr[0];
    let unidade = numeroArr[1];

    let resultado = '';
    if (dezena >= 2) {
        resultado += dezenasRegularesPorExtenso(dezena);
    }
    if (unidade) {
        resultado += 'e' + unidadePorExtenso(unidade);
    }
    return resultado;
}

const trataCentena = numero => {
    let numeroStr = numero.toString();
    let numeroArr = numeroStr.split('').map(n => parseInt(n));
    let centena = numeroArr[0];
    let dezena = numeroArr[1];
    let unidade = numeroArr[2];

    if (centena == 1 && unidade == 0 && dezena == 0) {
        return 'cem';
    }

    let resultado = centenasPorExtenso(centena);

    if (dezena) {
        resultado += 'e' + trataDezena(dezena * 10 + unidade);
    } else if (unidade) {
        resultado += 'e' + trataUnidade(unidade);
    }

    return resultado;
};

const numeroPorExtenso = (numero) => {
    if (numero === 1000) {
        return 'mil';
    }

    if (numero >= 100 && numero < 1000) {
        return trataCentena(numero);
    }

    if (numero >= 10 && numero < 100) {
        return trataDezena(numero);
    }

    if (numero < 10) {
        return trataUnidade(numero);
    }

    throw new Error("Numero valido não tratado");
}

const trataUnidade = unidade => {
    return unidadePorExtenso(unidade);
}

module.exports = numeroPorExtenso;