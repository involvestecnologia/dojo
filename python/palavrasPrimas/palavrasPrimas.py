from mapa import mapa
from numerosPrimos import eh_numero_primo

def eh_palavra_prima(palavra):
	total = 0
	for letra in palavra:
		total += mapa[letra]
	return eh_numero_primo(total)
