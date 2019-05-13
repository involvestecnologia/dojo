package br.com.agilebr.code;

import java.math.BigDecimal;

public class OperadoraMaster implements Operadora {
	
	private Boolean liberacao;

	public OperadoraMaster(boolean liberacao) {
		this.liberacao = liberacao;
	}
	
	@Override
	public BigDecimal getTaxaPagamento() {		
		BigDecimal taxaPagamento = new BigDecimal(0);
		if(!liberacao){
			taxaPagamento = new BigDecimal(5.5).add(new BigDecimal(2.5));
		}
		
		return taxaPagamento;
	}

	@Override
	public String getBandeira() {
		return "M";
	}

}
