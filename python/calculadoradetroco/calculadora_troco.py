moedas = [ 100.00, 50.00, 10.00, 5.00, 1.00, 0.50, 0.10, 0.05, 0.01 ]

def calcula_troco(valor_entregue, custo_produto):
	valor_troco = round(valor_entregue - custo_produto, 2)
	moedas_troco = []
	
	while valor_troco > 0 :
		i = 0
		end = len(moedas)
		while i < end:
			if moedas[i] > valor_troco:
				i += 1
				continue
			valor_troco = round(valor_troco - moedas[i],2)
			moedas_troco.append(moedas[i])
			if moedas[i] < valor_troco:
				i -= 1
			else:
				i += 1
	return moedas_troco

