package br.com.agilebr.code;

import java.math.BigDecimal;

public class OperadoraVisa implements Operadora {

	private boolean anuidade;

	public OperadoraVisa(boolean anuidade) {
		this.anuidade = anuidade;
	}

	public BigDecimal getTaxaPagamento() {
		BigDecimal taxaPagamento = new BigDecimal(5.5);
		if (!anuidade) {
			taxaPagamento = taxaPagamento.add(new BigDecimal(5.5));
		}

		return taxaPagamento;
	}

	@Override
	public String getBandeira() {
		return "V";
	}
}
