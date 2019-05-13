const unidadePorExtenso = function(numero) {
    switch(numero){
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
    switch (numero){
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

const numeroPorExtenso = (numero) => {

    if(numero < 10){
        return unidadePorExtenso(numero);
    }

    if(numero >= 10 && numero < 20){
        return dezenaPorExtenso(numero);
    }        
        
    if(numero >= 20 && numero < 100){
        let numeroStr = numero.toString();
        let numeroArr = numeroStr.split('').map(n =>  parseInt(n));
        let dezena = numeroArr[0];
        let unidade = numeroArr[1];

        if(unidade === 0){
            return dezenasRegularesPorExtenso(dezena);
        }
            
        return dezenasRegularesPorExtenso(dezena) + 'e' + unidadePorExtenso(unidade);
    }

    throw new Error("Numero valido não tratado");
}

module.exports.numeroPorExtenso = numeroPorExtenso;