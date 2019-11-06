def eh_numero_primo(numero):
	for n in range(2,numero-1):
		if(numero % n == 0):
			return False

	return True
